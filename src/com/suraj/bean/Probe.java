package com.suraj.bean;

/**
 * 
 * @author Suraj-Singh
 *
 */
public class Probe {
	int initiator;
	int sender;
	int receiver;
	
	public Probe(int initiator, int sender, int receiver) {
		super();
		this.initiator = initiator;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	public int getInitiator() {
		return initiator;
	}
	
	public int getSender() {
		return sender;
	}
	
	public int getReceiver() {
		return receiver;
	}

	@Override
	public String toString() {
		return "Probe [initiator=" + initiator + ", sender=" + sender
				+ ", receiver=" + receiver + "]";
	}

}
