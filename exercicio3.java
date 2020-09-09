package lista_de_exercicios;
import java.util.Scanner;
public class exercicio3{	
	public Scanner sc;	public static void main (String args[])
	{
		int idade;
		char novo='s';		
		Scanner read = new Scanner (System.in);		
		while (novo=='s') {			
			System.out.println("Digite sua idade");
			idade = read.nextInt();
			while (idade<0 || idade>115) {
				System.out.println("Ops!!!\nVamos tentar novamente!\nDigite sua idade");
				idade = read.nextInt();
			}			
			read.nextLine();			
			if (idade>9 && idade<15){
				System.out.println("Categoria Infantil (10 - 14)");
			}
			if(idade>=15 && idade<18) {
				System.out.println("Categoria Juvenil (15 - 17)");
			}
			if (idade>=18 && idade<=25){
				System.out.println("Categoria Adulto (18 - 25)");
			}
			if (idade<10 || idade>25){
				System.out.println("Idade não categorizada!");
			}
			System.out.println("Nova categorização?\ns - sim\nqualquer outra tecla - não");			
			novo = read.next().charAt(0);
		}
		System.out.println("Finalizado");
	}
}