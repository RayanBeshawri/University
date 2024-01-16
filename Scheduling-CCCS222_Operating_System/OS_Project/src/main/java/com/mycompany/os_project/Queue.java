package com.mycompany.os_project;

import java.util.ArrayList;

public class Queue {
    // Amount of created queues
    static final ArrayList<Queue> queues = new ArrayList<>();
     
    // Queue settings
    int id, timeQuantum;
    int throughput, counter = 0;
    
    String type;

    ArrayList<Process> processes;
    
    // First constructor
    public Queue() {
        this.id = queues.size() + 1;
        this.type = "FCFS";
        
        queues.add(this);
    }
    
    // Second constructor
    public Queue(int timeQuantum) {
        this.id = queues.size() + 1;
        this.type = "RR";
        this.timeQuantum = timeQuantum;
        
        queues.add(this);
    }
    
    // Methods
    public void setThroughput(int throughput) {
        this.throughput = throughput;
    }
    
    public int getID() {
        return this.id;
    }
    
    public String getType() {
        return this.type;
    }
    
    public int getThroughput() {
        return this.throughput;
    }
    
    public int getTimeQuantum() {
        return this.timeQuantum;
    }

    // CPU Scheduling method
    public void cpuSchedule() {
        // Get all ready processes and add them to the queue
        processes = Process.getProcessesOfState("ready");
        
        for (int i = 0; i < processes.size(); i++) {
            Process p = processes.get(i);  
            
            p.setState("running");
            p.setWaitingTime(counter);
            p.responseTimeEnd = System.nanoTime();
            
            // Round Robin Scheduling
            if(getType() == "RR") {
                int currentQueueBurstTime = 0;

                while(currentQueueBurstTime < getTimeQuantum() && p.getRemainingBurstTime() > 0) {
                    int currentTime = p.getCurrentBurstTime();
                    p.setCurrentBurstTime(++currentTime);
                    ++currentQueueBurstTime;
                    ++counter;
                }
                
            // FCFS Scheduling
            } else if(getType() == "FCFS") {                
                while(p.getRemainingBurstTime() > 0) {
                    int currentTime = p.getCurrentBurstTime();
                    p.setCurrentBurstTime(++currentTime);
                    ++counter;
                }
            }
            
            p.responseTime = p.responseTimeEnd - p.responseTimeStart;
            p.responseTimeStart = System.nanoTime();
            
            if(p.getRemainingBurstTime() == 0) {
                int queueThroughput = getThroughput();
                
                p.setState("terminated");
                setThroughput(++queueThroughput);
            } else {
                p.setState("ready");
            }
        }
        
        printQueueProcessesInfo();
    }
    
    // Print queue processes method
    public void printQueueProcessesInfo() {
        String queueString = getType() == "RR" ? ("Round Robin (RR) and time quantum " + getTimeQuantum() + " ms") : "First Come First Served (FCFS)";
        System.out.println("\n======= Queue #" + getID() + " with " + queueString + " =======");
        
        if(processes.isEmpty()) {
            System.out.println("The queue is empty. No CPU scheduling has been made!");
            return;
        }

        int queueThroughput = getThroughput();
        double totalWaitingTime = 0;
        
        System.out.println(String.format(
            "%-15s%-15s%-15s%-15s%-15s", 
            "PROCESS", "BURST TIME", "REMAINING", "WAITING TIME", "RESPONSE TIME"
        ));
        
        for (int i = 0; i < processes.size(); i++) {
            Process p = processes.get(i);
            
            int remainingBurstTime = p.getRemainingBurstTime();
            totalWaitingTime = totalWaitingTime + p.getWaitingTime();
                        
            String row = String.format("%-15s%-15s%-15s%-15s%-15s", 
                p.getID(), // Process ID
                p.getBurstTime(), // Process Burst time
                (remainingBurstTime > 0) ? remainingBurstTime : "Executed", // Process remaining burst time
                p.getWaitingTime() + " ms", // Process waiting time
                calculateTime(p.responseTime) // Process response time
            );
            System.out.println(row);
        }
        
        System.out.println("\nTotal waiting time: " + totalWaitingTime + " ms");
        System.out.println("Avg. waiting time: " + String.format("%.02f", totalWaitingTime / processes.size()) + " ms");
        System.out.println("Throughput: " + queueThroughput + (queueThroughput > 1 ? " processes" : " process"));
    }
    
    // Utility method to calculate time
    public static String calculateTime(long nanoTime) {
        if(nanoTime < 1000000) {
            // Nanoseconds
            return nanoTime + " ns";
        } else {
            // Millisecond
            return (nanoTime / 1000000) + " ms";
        }
    }
}
