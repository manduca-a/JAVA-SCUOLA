class Fattura 
{
	private final int percIva = 22;
	
	private ProgFattura destinatario;
	
	public int numeroOrdine;
	public String descrizione;
	public int qta;
	public double prezzoUnitario;
	
	public Fattura(ProgFattura dest)
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
		System.out.println("---------------------");
		System.out.println("Ordine:  " + numeroOrdine);
		System.out.println("Quantità articoli:  " + qta);
		System.out.println("Descrizione:  " + descrizione);
		System.out.println("Percentuale Iva:  " + percIva + "%");
		System.out.println("Imponibile:  " + calcolaImponibile());
		double totale = totaleFattura();
		System.out.println("Totale fattura:  " + totale);
		System.out.println("---------------------");
	}
}