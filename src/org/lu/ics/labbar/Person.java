package org.lu.ics.labbar;
import java.util.HashMap;

public class Person {
	//Attribut
	private String pNbr;
	private String name;
	
	//Instansvariabel - lista över de tillhörande konton
	private HashMap<String, Account> accounts = new HashMap<String, Account>();
	
	public void setAccounts(HashMap<String, Account> accounts) {
		this.accounts = accounts;
	}
	
	public HashMap<String, Account> getAccounts() {
		return accounts;
	}

	//Setters och getters
	public void setPNbr (String pNbr) {
		this.pNbr = pNbr;
	}
	
	public String getPNbr () {
		return pNbr;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	//Instansmetod - skapar konto - tilldelar inte a som ägare, ger stack overflow
	public void addAccount (Account a) {
		accounts.put(a.getNbr(), a);
	}
	

}
