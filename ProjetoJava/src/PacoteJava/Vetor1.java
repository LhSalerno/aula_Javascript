package PacoteJava;

import java.util.Scanner;

public class Vetor1 {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [] arrayUm = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int [] arrayDois = {11, 22, 33, 44, 55};
		
		float [] nota=new float[5];
		
		//tamanho array
		if (arrayDois.length >8) {
			System.out.println("Tamanho do ArrayDois - Maior que 8!");
		} else {
			System.out.println("Tamanho do ArrayDois - menor que 8!");
		}
		System.out.println("\nTamanho ArrayUm =" +arrayUm.length);
		
		//utilização do for-each
		String [] cars = {"Fusca", "", "Opala", "Brasilia"};
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		//populando um Array
		for(int i=0; i<5;i++) 
		{
			System.out.println("Entre com uma nota: ");
			nota[i]=entrada.nextFloat();
		}
		//apresentando um Array
		for(int i=0;i<5;i++) 
		{
			System.out.println("Nota "+ i + 1+"="+nota[i]);
		}   
    }
}