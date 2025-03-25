package Entities;
import Entities.Vitima;

public class Ladrao {
	Entities.Vitima vitima = new Entities.Vitima();
	public double saldoInicial = 300.00;
	
	public double saldo() {
		return this.vitima.saida + this.saldoInicial;
	}

}
