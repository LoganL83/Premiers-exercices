package fr.logan.exercices;

import java.util.Scanner;

public class tableauexo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] tab = new char [5];
		tab [0] = 'a';
		tab [1] = 'v';
		tab [2] = 'i';
		tab [3] = 'o';
		tab [4] = 'n';
		
		System.out.println("Entrez une lettre");
		
		Scanner reader = new Scanner (System.in);
		
		for (int pos = 0; pos < 5; pos ++) {
		if (tab [pos] == 'a') {
		System.out.println("Vous avez gagné, félicitations");
		}
		else {
		System.out.println("Vous avez perdu, nouvelle chance");
		}
	}
}
}