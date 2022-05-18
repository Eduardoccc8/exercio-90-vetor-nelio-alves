package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class program90 {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		Product[] vect = new Product[n]; // padrao para construir vetor
		
		for (int i=0; i<n; i++) {       // padrao para construir vetor
			
			sc.nextLine();               // esse comando para consumir uma linha
			
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name,price); //esse comando vai apontar pra os valores para nome, price		
					
		}
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma +=vect[i].getPrince(); //esse comando podemos fazer a soma total dos vetores!
			
		}
		
		double media = soma /n;
		System.out.printf("o valor medio é = %.2f%n", media);
		
		
		
		
		
		
		sc.close();

	}

}
