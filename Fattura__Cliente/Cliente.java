class Cliente 
{
	private String nome;
	private String partitaIva;
	private double saldo;
	
	public Cliente(String nome, String partitaIva)
	{
		this.nome = nome;
		this.partitaIva = partitaIva;
		saldo = 0;
	}
	
	public void addebita(double importo)
	{
		saldo += importo;
	}
	
	public void paga(double importo)
	{
		saldo -= importo;
	}
	
	public void stampaSituazione()
	{
		System.out.println("---------------------");
		System.out.println("Cliente:  " + nome);
		System.out.println("Partita Iva:  " + partitaIva);
		System.out.println("Saldo:  " + saldo);
		System.out.println("---------------------");
	}
}