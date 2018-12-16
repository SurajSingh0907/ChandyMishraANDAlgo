package com.suraj.algo;

/**
 * 
 * @author Suraj-Singh
 *
 */
public class ChandyMishraAlgo {

	private int[][] dependenciesGraph;

	private int noOfProcess;
	
	private static ChandyMishraAlgo instance;
	
	public static ChandyMishraAlgo getInstance(){
		if(instance == null){
			synchronized (ChandyMishraAlgo.class) {
				if(instance == null){
					instance =  new ChandyMishraAlgo();
				}				
			}
		}
		return instance;
	}
	
	public void initialize(int[][] dependencyGraph, int noOfProcess){
		this.dependenciesGraph = dependencyGraph;
		this.noOfProcess = noOfProcess;
	}
	
	/**`
	 * 
	 * @param initiatorProcess
	 * @return
	 */
	public boolean runChandyAlgo(int initiatorProcess){
		int initiatorIndex = initiatorProcess - 1;
		
		for(int k = 0; k<noOfProcess; k++){
			if(dependenciesGraph[initiatorIndex][k] == 1){
				return probeFlow(initiatorIndex, k);
			}
		}
		return false;
	}

	private boolean probeFlow(int initiatorIndex, int sender) {
		for(int i = 0; i< noOfProcess; i++){
			if(dependenciesGraph[sender][i] == 1){
				if(initiatorIndex == i){
					System.out.println(String.format("Probe loop found on : (%d , %d , %d) : ", initiatorIndex+1, sender+1, i+1));
					return true;
				}
				return probeFlow(initiatorIndex, i);
			}
		}
		return false;
	}
}
