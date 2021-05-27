package com.company;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Ejemplo 1");
		int edad=0;
		do {
		System.out.println("Dame tu edad");
		Scanner sc = new Scanner(System.in);
		edad = sc.nextInt();

		} while ((edad < 0) || (edad > 125));

		System.out.println("Dame tu provincia");
		Scanner sc = new Scanner(System.in);
		String provincia = sc.nextLine();


		if ((!provincia.equals("Almeria")) & (!provincia.equals("Granada")))
		{
			while ((!provincia.equals("Almeria")) & (!provincia.equals("Granada")))
			{
				System.out.println("Dame tu provincia");
				sc = new Scanner(System.in);
				provincia = sc.nextLine();

			}

		}

		if (edad < 18) System.out.println("Eres menor de edad");
		else System.out.println("Tu provincia es: "+ provincia + " y tu edad es " + edad);


	}

}