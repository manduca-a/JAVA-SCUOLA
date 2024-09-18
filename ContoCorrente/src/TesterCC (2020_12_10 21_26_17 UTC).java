import java.io.*;
import javax.swing.*;
import java.util.*;

public class TesterCC {

	public static void main(String[] args) 
	{
		// istanza di due oggetti di classe ContoCorrente
		ContoCorrente Antonio = new ContoCorrente(1, "Antonio Manduca", 22000);
		
		//istanza con due parametri, senza saldo
		ContoCorrente Domenico = new ContoCorrente(2, "Domenico Iozzo");
		
		//visualizzazione numero, intestatario e saldo primo oggetto
		System.out.println("Numero conto: " + Antonio.getNumeroConto() + " Intestatario: " + Antonio.getIntestatario() + " Saldo: " + Antonio.getSaldo());
		//visualizzazione numero, intestatario e saldo secondo oggetto
		System.out.println("Numero conto: " + Domenico.getNumeroConto() + " Intestatario: " + Domenico.getIntestatario() + " Saldo: " + Domenico.getSaldo());
		
	}

}
