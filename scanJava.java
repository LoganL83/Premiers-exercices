package fr.logan.exercices;

import java.util.Scanner;

public class scanJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Veuillez taper un chiffre : ");
		Scanner var = new Scanner (System.in);
		int a = var.nextInt();
		System.out.println("le chiffre magique : " + a);
	}

}
