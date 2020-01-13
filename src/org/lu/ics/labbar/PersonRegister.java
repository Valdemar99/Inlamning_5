package org.lu.ics.labbar;
import java.util.HashMap;

public class PersonRegister {
	//Skapar en instansvariabel - dvs. en ArrayList som håller objekt av typen Person.
	//Listan heter personer.
	private HashMap<String, Person> personer  = new HashMap<String, Person>();
	
	public HashMap<String, Person> getPersoner() {
		return personer;
	}

	public void setPersoner(HashMap<String, Person> personer) {
		this.personer = personer;
	}

	//Lägg till ny person
	public void addPerson (Person p) {
		personer.put(p.getPNbr(), p);
	}
	
	//Hitta person med hjälp av ett personnummer
	public Person findPerson (String pNbr) {
		return personer.get(pNbr);
	}
	
	//Ta bort en person givet ett personnummer
	public Person removePerson(String pNbr) {
		return personer.remove(pNbr);
	}
}

	

