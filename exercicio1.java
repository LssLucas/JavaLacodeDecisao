package lista_de_exercicios;
import java.util.Scanner;
public class exercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = new int[3];
		int i, maior=0;
		for (i=0;i<3;i++) {
			Scanner leitura = new Scanner (System.in);
			System.out.println("Digite o numero\n"+(i+1)+"/3 = ");
			v[i] = leitura.nextInt();
			if(v[i]>maior) {
				maior=v[i];
			}
		}
		System.out.print("O maior numero digitado eh: "+maior+".");
	}
}
