package bank;

import java.util.ArrayList;
import java.util.List;

import client.Client;

public class Bank {
	public String name = "Digital Bank";
	private List<String> clients;

	public Bank() {
		this.clients = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}

	

	public void addClient(String name) {
		clients.add(name);
	}
	public void printClientList () {
		System.out.println(clients);
	}

}
