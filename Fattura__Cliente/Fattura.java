class Fattura 
{
	private final int percIva = 20;
	
	private Cliente destinatario;
	
	public int numeroOrdine;
	public String descrizione;
	public int qta;
	public double prezzoUnitario;
	
	public Fattura(Cliente dest)
	{
		destinatario = dest;
	}
	
	private double calcolaImponibile()
	{
		return (qta * prezzoUnitario);
	}
	
	private double calcolaImposta()
	{
		double imp = calcolaImponibile();
		return (imp * percIva) / 100;
	}
	
	public double totaleFattura()
	{
		double totale;
		totale = calcolaImponibile() + calcolaImposta();
		return totale;
	}
	
	public void emettiFattura()
	{
		System.out.println("Ordine:  " + numeroOrdine);
		System.out.println("Quantità articoli:  " + qta);
		System.out.println("Descrizione:  " + descrizione);
		System.out.println("Percentuale Iva:  " + percIva + "%");
		System.out.println("Imponibile:  " + calcolaImponibile());
		double totale = totaleFattura();
		System.out.println("Totale fattura:  " + totale);
		destinatario.addebita(totale);
		destinatario.stampaSituazione();
	}
}