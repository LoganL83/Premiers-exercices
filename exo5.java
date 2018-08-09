package fr.logan.exercices;

public class exo5 {

	public static int multiplication (int a, int b) {
	int multi = a * b;
	return multi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int chiffre1 = 25;
		int chiffre2 = 5;
		int resultat;
		
		resultat = multiplication (chiffre1, chiffre2);
		System.out.println(chiffre1 + " * " + chiffre2 + " = " + resultat);
	}

}
