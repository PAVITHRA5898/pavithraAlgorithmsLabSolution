package com.services;

public class NotesCount {
	
	public void notesCountImplementation(int notes[], int amount) {
		int[] notesCounter = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					notesCounter[i] = amount / notes[i];
					amount = amount - notesCounter[i] * notes[i];
				}
			}
			if(amount > 0) {
				System.out.println("amount cannot be given with the highest denomination");	
			}else {
				System.out.println("Your payment approach in order to give minimum no of notes wiil be");
       
				for (int i = 0; i < notes.length; i++) {
					if (notesCounter[i] != 0) {
						System.out.println(notes[i] + " : " + notesCounter[i]);
					}
				}
			}
		
		} catch(ArithmeticException e) {
			System.out.println(e+ "notes of denomination 0 is not valid");
		}
	}
}