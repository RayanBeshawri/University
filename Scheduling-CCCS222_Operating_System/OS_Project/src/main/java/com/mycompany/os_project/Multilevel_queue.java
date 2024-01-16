package com.mycompany.os_project;

import java.util.*;

public class Multilevel_queue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        
        System.out.println(
            "Welcome to our project of CCCS225 - Final Lab\n" +
            "Our program will use a Multilevel feedback queue\n" +
            "Also, it will calculate the process response time, throughput, and average waiting time\n\n" +
            "Enter a positive integer burst time (or negative integer to exit): "
        );
        
        Queue queue1 = new Queue(8);
        Queue queue2 = new Queue(16);
        Queue queue3 = new Queue();  
        
        int procBurstTime = 0;
        
        do {                        
            System.out.print("> ");

            while(!scanner.hasNextInt()) {
                System.out.println("An error occured. Please enter a valid burst time!");
                scanner.next();
                System.out.print("> ");
            }
            
            procBurstTime = scanner.nextInt();
            
            if(procBurstTime > 0)
                new Process(procBurstTime);
        } while(procBurstTime > 0);
        
        // CPU Schedule Queues
        ArrayList<Queue> queues = Queue.queues;
        
        for (int i = 0; i < queues.size(); i++) {
            Queue queue = queues.get(i);
            queue.cpuSchedule();
        }
    }   
}
