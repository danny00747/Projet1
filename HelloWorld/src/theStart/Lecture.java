package theStart;

import java.util.Scanner;

public class Lecture {

	public static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {

		lettre();
		lettre();
		carre();
		clavier.close();
	}

	public static void carre() {
		int nbr;
		System.out.print("Enter a number:");
		 nbr = clavier.nextInt();
		System.out.println("le carre de" + " " + nbr + " " + "est" + " " + (nbr * nbr));
	}

	public static void lettre() {
		String text;
		System.out.print("Enter a text:");
		text = clavier.nextLine();
		System.out.println("vous avez tapé" + " " + text);
	}
}
