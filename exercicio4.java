package lista_de_exercicios;
import java.util.Scanner;
import java.lang.Math;
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado. 
		 */
		float n=0;
		double raiz=0, pot=0;
		Scanner read = new Scanner (System.in);
		System.out.println("Digite um numero qualquer");
		n = read.nextFloat();
		if (n<0){
			System.out.println("Voce digitou um negativo. Não há raiz de "+n+" em Reais.");
		}
		else if((10*n)%2==0){
			raiz = Math.sqrt(n);
			//n = (float) Math.sqrt(n);
			System.out.println("Voce digitou um numero par.\nA raiz quadratica de "+n+" é: "+raiz+".");
		}else {
			//n = (float) Math.pow(n, 2);
			pot = Math.pow(n, 2);
			System.out.println("Voce digitou um numero impar.\nA segunda potencia de "+n+" é: "+pot+".");			
		}
	}

}
