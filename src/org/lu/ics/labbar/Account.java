package org.lu.ics.labbar;

public class Account {
	//Attribut
	private String nbr;
	private double balance;
	
	//Och ägare owner
	private Person owner;
	
	//Och åtkomstmetoder
	public void setNbr (String nbr) {
		this.nbr = nbr;
	}
	
	public String getNbr() {
		return nbr;
	}
	
	public void setBalance (double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//Åtkomstmetod för tredje instansvariabeln "Person".
	//Sätter bara konto under användaren,
	//inte in i personens lista med konton, eftersom det ger stack overflow.
	public void setOwner (Person owner) {
		this.owner = owner;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	//Instansmetoder
	public void credit (double amount) {
		this.balance += amount;
	}
	
	public void withdraw (double amount) {
		this.balance -= amount;
	}

}
