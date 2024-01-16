package com.mycompany.os_project;

import java.util.ArrayList;

public class Process {
    // Amount of created processes
    static final ArrayList<Process> processes = new ArrayList<>();
    
    // Process information (PCB)
    int id, burstTime, currentBurstTime;
    double waitingTime;
    long responseTime, responseTimeStart, responseTimeEnd;
    String state;
    
    // Constructor
    public Process(int burstTime) {
        // Set process state to new. Because, we just created it
        this.state = "new";
        
        // Set the process information (PCB)
        this.id = processes.size() + 1;
        this.burstTime = burstTime;
        this.currentBurstTime = 0;
        this.waitingTime = 0.0;
        
        // Process is now ready
        this.state = "ready";
        this.responseTimeStart = System.nanoTime();
        
        processes.add(this);
    }
    
    // Methods
    public void setState(String state) {
        this.state = state;
    }
    
    public void setCurrentBurstTime(int currentBurstTime) {
        this.currentBurstTime = currentBurstTime;
    }
 
    public void setWaitingTime(double waitingTime) {
        this.waitingTime = waitingTime;
    }
    
    public String getState() {
        return this.state;
    }
    
    public int getBurstTime() {
        return this.burstTime;
    }
    
    public int getCurrentBurstTime() {
        return this.currentBurstTime;
    }
 
    public double getWaitingTime() {
        return this.waitingTime;
    }
    
    public int getRemainingBurstTime() {
        return (getBurstTime() - getCurrentBurstTime());
    }
    
    public int getID() {
        return this.id;
    }
    
    // Get a list of all processes of a given state
    public static ArrayList<Process> getProcessesOfState(String state) {
        ArrayList<Process> readyProcesses = new ArrayList<>();
        
        for (int i = 0; i < processes.size(); i++) {
            Process p = processes.get(i); 
            
            if(p.getState() == state) {
                readyProcesses.add(p);
            }
        }
        
        return readyProcesses;
    }
}
