package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		Ask Name to user
		System.out.println("Dimmi il tuo Nome");
		String name = in.nextLine();
		
//		Ask Surname to user
		System.out.println("Dimmi il tuo Cognome");
		String surname = in.nextLine();
	
//		Ask pref color
		System.out.println("Dimmi il tuo colore preferito");
		String color = in.nextLine();
		
//		Ask day of birth
		System.out.println("Dimmi il tuo giorno di nascita");
		String dayOfBirth = in.nextLine();
		int intDayOfBirth = Integer.parseInt(dayOfBirth);
		
//		Ask month of birth
		System.out.println("Dimmi il tuo mese di nascita");
		String monthOfBirth = in.nextLine();
		int intMonthOfBirth = Integer.parseInt(monthOfBirth);
		
//		Ask year of birth
		System.out.println("Dimmi il tuo mese di nascita");
		String yearOfBirth = in.nextLine();
		int intYearOfBirth = Integer.parseInt(yearOfBirth);
		
		in.close();
		
		int sumDate = intDayOfBirth + intMonthOfBirth + intYearOfBirth;
		
		System.out.println("La tua password è " + name + "-" + surname + "-" + color + "-" + sumDate);
	}

}
