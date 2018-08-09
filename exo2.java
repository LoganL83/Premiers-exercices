package fr.logan.exercices;

public class exo2 {
	
	public static int addition (int a, int b, int c, int d, int e, int f) {
	int sum = a + b + c + d + e + f;
	return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 74;
		int b = 36;
		int c = 5;
		int d = 10;
		int e = 15;
		int f = 10;
		int somme;
		
		somme = addition (a, b, c, d, e, f);
		System.out.println(somme);
	}

}
