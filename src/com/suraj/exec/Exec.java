package com.suraj.exec;

import java.util.Scanner;

import com.suraj.algo.ChandyMishraAlgo;

public class Exec {

	public static void main(String[] args) {
		System.out.println("======== Welcome to Chandy-Mishra AND Algorithm @written by Suraj Singh =========");
		System.out.println("");

		Scanner scan = new Scanner(System.in);
		boolean endFlag = false;
		while(!endFlag){
			System.out.println("::::: Options:<code> ::::");
			System.out.println("1. RunAlgo: run");
			System.out.println("2. End: end");
			
			System.out.print("Enter your choice :");
			String choice = scan.nextLine().toLowerCase();
			
			switch(choice){
			case "run":
				System.out.print("Enter no. of processes :");
				int noOfProcess = Integer.parseInt(scan.nextLine());
				
				System.out.println("Now enter dependecies across processes");
				int[][] dependenciesGraph = new int[noOfProcess][noOfProcess];
				
				for(int i = 0; i<noOfProcess; i++){
					System.out.print("P"+(i+1)+" | ");
				}
				
				System.out.println("\n");
				
				for(int i = 0; i<noOfProcess; i++){
					System.out.println(String.format("Enter complete row %d (space separated) having %d elements : ",i+1,noOfProcess));
					String row = scan.nextLine();
					String[] splits = row.split(" ");
					
					if(splits.length != noOfProcess){
						System.out.println("Wrong no. of inputs");
						break;
					}
					for(int j = 0; j<noOfProcess; j++){
						dependenciesGraph[i][j] = Integer.parseInt(splits[j]);
					}
				}
				
				System.out.println("Build Dependecies graph as follows: ");
				for(int i = 0; i<noOfProcess; i++){
					System.out.print("P"+(i+1)+" | ");
				}
				System.out.println("");
				
				for(int i = 0; i<noOfProcess; i++){
					for(int j = 0; j<noOfProcess; j++){
						System.out.print(dependenciesGraph[i][j]+" ");
					}
					System.out.println("");
				}
				
				System.out.println("Enter process no. of initiator : ");
				int initiator = Integer.parseInt(scan.nextLine());
				
				System.out.println("=========== Start Execution for Chandy Mishra AND Algorithm for DeadLock Detection ========== ");
				ChandyMishraAlgo algo = ChandyMishraAlgo.getInstance();
				algo.initialize(dependenciesGraph, noOfProcess);
				
				boolean deadlock = algo.runChandyAlgo(initiator);
				if(deadlock){
					System.out.println("XXXXXXXXXXXXXXX Deadlock Detected XXXXXXXXXXXXXXXXX");
					System.out.println("");
				}else{
					System.out.println("Deadlock is not detected");
				}
				break;
			
			case "end":
				endFlag = true;
				break;
			default:
				System.out.println("Not a valid choice. Please reselect your choice");
			}
		}
		
		System.out.println("==== Thank You ===");
	}

}
