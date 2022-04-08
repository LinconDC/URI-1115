package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira as coordenadas X e Y, ou zero para encerrar aplicação: ");
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while (X != 0 && Y != 0) {
			
			if (X > 0 && Y > 0) {
				System.out.println("primeiro");
			}
			else if (X < 0 && Y > 0) {
				System.out.println("segundo");
			}
			else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			System.out.print("Insira as coordenadas X e Y novamente: ");
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		
		sc.close();

	}

}
