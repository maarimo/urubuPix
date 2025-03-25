package Program;
import java.util.Locale;
import java.util.Scanner;
import Entities.Vitima;
import Entities.Ladrao;




public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quanto deseja depositar?");
		System.out.println("$100.00 -----> $200.00");
		System.out.println("$200.00 -----> $400.00");
		System.out.println("$300.00 -----> $600.00");
		
		Entities.Vitima vitima = new Entities.Vitima();
		vitima.saida = sc.nextDouble();
		
		System.out.println("Saldo da vitima: ");
		double saldoVitima = vitima.saldo();
		System.out.printf("$%.2f", saldoVitima);
		System.out.println();
		
		System.out.println("Saldo do Urubu: ");
		Entities.Ladrao ladrao = new Entities.Ladrao();
		double saldoLadrao = ladrao.saldo();
		System.out.printf("$%.2f", saldoLadrao);
		
		

	}

}
