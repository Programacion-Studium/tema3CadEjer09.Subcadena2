package es.Studium.Subcadena2;

import java.util.Scanner;

public class Subcadena2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase,subfrase;
		int longitud;
		System.out.println("indique una frase");
		frase=teclado.nextLine();
		for (int i= 0;i<frase.length();i++)
		{
			System.out.println(i+"*"+frase.charAt(i));
		}
			System.out.println("indique una Longitud de caracteres a extraer con longitud máxima de "+frase.length());
			longitud=teclado.nextInt();	
			subfrase=frase.substring((frase.length()-longitud), frase.length());
			
			System.out.println(subfrase);
			for (int i= 0;i<subfrase.length();i++)
			{
				System.out.println(i+"*"+subfrase.charAt(i));
			}
		teclado.close();
	}

}
