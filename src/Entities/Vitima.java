package Entities;

public class Vitima {
				public double saida;
				public double saldoInicial = 1000;
				
				public double saldo() {
					return this.saida - this.saldoInicial;
				}

}
