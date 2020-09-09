package lista_de_exercicios;
import java.util.*;
public class exercicio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = new int[3];
		int[] x= new int[3];
		int i, maior=0;
		for (i=0;i<3;i++) {
			Scanner leitura = new Scanner (System.in);
			System.out.print("Digite o numero\n"+(i+1)+"/3 = ");
			v[i] = leitura.nextInt();
			if(v[i]>maior) {
				maior=v[i];
			}
			x[i]=v[i];
		}
		Arrays.sort(x);
		for(i=0;i<3;i++){
				System.out.print("["+x[i]+"]");
		}
	}
}
