import java.io.*;

class ProgFatturazione 
{
	public static void main(String[] args) 
	{
		Cliente computerSpa = new Cliente("Computer SPA" , "01122334455");
		Cliente casalinghiDiscount = new Cliente("Casalinghi Discount" , "02381653701");
		
		Fattura ordine1 = new Fattura(computerSpa);
		Fattura ordine2 = new Fattura(computerSpa);
		Fattura ordine3 = new Fattura(casalinghiDiscount);
		Fattura ordine4 = new Fattura(casalinghiDiscount);
		
		ordine1.numeroOrdine = 1;
		ordine1.descrizione = "Mouse";
		ordine1.qta = 28;
		ordine1.prezzoUnitario = 17.5;
		ordine1.emettiFattura();
		
		ordine2.numeroOrdine = 2;
		ordine2.descrizione = "Monitor";
		ordine2.qta = 7;
		ordine2.prezzoUnitario = 328.99;
		ordine2.emettiFattura();
		
		ordine3.numeroOrdine = 3;
		ordine3.descrizione = "Scope";
		ordine3.qta = 10;
		ordine3.prezzoUnitario = 5;
		ordine3.emettiFattura();
		
		ordine4.numeroOrdine = 4;
		ordine4.descrizione = "Ace Gentile";
		ordine4.qta = 47;
		ordine4.prezzoUnitario = 4;
		ordine4.emettiFattura();
		
		double bonifico = 1000.0;
		System.out.println("Pagamento:  " + bonifico);
		computerSpa.paga(bonifico);
		computerSpa.stampaSituazione();
	}
}