package es.studium.Cuadrante;

import java.util.Scanner;

public class Cuadrante 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		double x,y;
		System.out.println("Introduce un número:");
		x = teclado.nextDouble();
		System.out.println("Introduce otro número:");
		y = teclado.nextDouble();
		if (x>=0&&y>=0)
		{
			System.out.println("Pertenece al grupo I");
		}
		else if (x<0&&y>=0)
		{
			System.out.println("Pertenece al grupo II");
		}
		else if(x<0&&y<0)
		{
			System.out.println("Pertenece al grupo III");
		}
		else
		{
			System.out.println("Pertenece al grupo IV");
		}
		teclado.close();
	}

}
