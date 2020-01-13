package org.lu.ics.labbar;

import java.text.DecimalFormat;


/**
 * Nu testas de tre andra klasserna. Nu skapas två personer i personregistret
 * med två konton vardera. Det som är trixigt är att aggregatet är enkelriktat
 * från personregister till person, dvs. personregistret skapas först.
 * 
 * Dvs. personer kan inte existera utan ett personregister.
 * 
 * @author Administrator
 *
 */

public class Testmetod {

	public static void main(String[] args) {
		//Nu skapas ett decimalformat
		DecimalFormat avrundaTillKr = new DecimalFormat("#0.00");
		
		//Nu skapas ett personregister.
		PersonRegister bankReg = new PersonRegister();
		
		//Nu skapas två personer. 
		//Erik med personnummer 9405122261 och Anna med personnummer 9811215640.
		
		Person a = new Person();
		a.setName("Erik");
		a.setPNbr("9405122261");
		
		//Person läggs in personregistret
		bankReg.addPerson(a);
		
		//Nästa person
		Person b = new Person();
		b.setName("Anna");
		b.setPNbr("9811215640");
		
		bankReg.addPerson(b);
		
		//Nu skapas två konton för person a
		for (int i = 0; i<2; i++) {
			Account konto = new Account();
			konto.setNbr("000" + (i+1));
			double saldo = 2350.4;
			konto.setBalance(saldo);
			
			//Kopplar person till konto och vice versa
			a.addAccount(konto);
			konto.setOwner(a);
		}
		
		//och två konton för person b
		for (int i=2; i<4; i++) {
			Account konto = new Account();
			konto.setNbr("000" + (i+1));
			double saldo = 34001;
			konto.setBalance(saldo);
			
			//Kopplar person till konto och vice versa
			b.addAccount(konto);
			konto.setOwner(b);
		}
		
		//Nu skrivs det ut
		
	
		//Nu tas kund a bort från registret och sökning görs på denne:
		bankReg.removePerson("9405122261");
		if (bankReg.findPerson("9405122261")==null) {
			System.out.println("Kunden finns inte i registret.");
		}
		else {
			System.out.println("Kunden heter " + bankReg.findPerson("9405122261").getName() + ".");
		}
		
		//Tar ut pengar från andra kunden (b):
		b.getAccounts().get("0003").withdraw(438.35);
		
		//Skriver ut
		System.out.println("Kontons saldo är nu " + b.getAccounts().get("0003").getBalance() + " kr.");

	}

}
