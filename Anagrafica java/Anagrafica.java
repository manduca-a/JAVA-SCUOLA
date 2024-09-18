package progetti_scuola;

public class Anagrafica {

		public String nome;
		public String cognome;
		private String matricola;
		private String email;
		private boolean registrata;
		
		public void registraEmail(String email)
		{
			this.email=email;
			registrata=true;
			
		}
		public void registraMatricola(String matricola)
		{
			this.matricola=matricola;
			
		}
		public void stampaDati()
		{
			System.out.println("Nome  = "+ nome );
			System.out.println("Cognome = "+ cognome);
			System.out.println("matricola= "+ matricola );
			if(registrata)
			{
				 System.out.println("Email = "+ email);
				 
			}
			else
			{
				System.out.println("Email non registrata");
			}
		}
}
