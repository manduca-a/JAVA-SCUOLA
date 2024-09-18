import java.util.ArrayList;

public class ProgFattura {

	public static void main(String[] args) 
	{	
		ArrayList<String> clienti = new ArrayList<String>();
		clienti.add("ComputerSPA");
		clienti.add("Casalinghi Discount");
		
		ArrayList<String> partiteIva = new ArrayList<String>();
		partiteIva.add("01122334455");
		partiteIva.add("02381653701");
		
		double saldo = 0;
		double importo = 0;
		
		Fattura ordine1 = new Fattura(null);
		Fattura ordine2 = new Fattura(null);
		Fattura ordine3 = new Fattura(null);
		Fattura ordine4 = new Fattura(null);
		
		ordine1.numeroOrdine = 1;
		ordine1.descrizione = "Mouse";
		ordine1.qta = 28;
		ordine1.prezzoUnitario = 17.5;
		ordine1.emettiFattura();
		System.out.print("Cliente: ");
		System.out.println(clienti.get(0));
		System.out.print("Partita Iva: ");
		System.out.println(partiteIva.get(0));
		
		ordine2.numeroOrdine = 2;
		ordine2.descrizione = "Monitor";
		ordine2.qta = 7;
		ordine2.prezzoUnitario = 328.99;
		ordine2.emettiFattura();
		System.out.print("Cliente: ");
		System.out.println(clienti.get(0));
		System.out.print("Partita Iva: ");
		System.out.println(partiteIva.get(0));
		
		ordine3.numeroOrdine = 3;
		ordine3.descrizione = "Scope";
		ordine3.qta = 10;
		ordine3.prezzoUnitario = 5;
		ordine3.emettiFattura();
		System.out.print("Cliente: ");
		System.out.println(clienti.get(1));
		System.out.print("Partita Iva: ");
		System.out.println(partiteIva.get(1));
		
		ordine4.numeroOrdine = 4;
		ordine4.descrizione = "Ace Gentile";
		ordine4.qta = 47;
		ordine4.prezzoUnitario = 4;
		ordine4.emettiFattura();
		System.out.print("Cliente: ");
		System.out.println(clienti.get(1));
		System.out.print("Partita Iva: ");
		System.out.println(partiteIva.get(1));
		System.out.println("---------------------");
	}
}
