import java.io.*;
import java.net.*;

public class Server 
{
	ServerSocket server = null;
	Socket socketClient = null;
	
	int porta = 5555;  //porta del server
	
	DataInputStream in;
	DataOutputStream out;
	
	public void Comunica()
	{
		try 
		{
			System.out.println("[3]- Aspetto un messaggio...");
			String letto = in.readLine();
			System.out.println("[4]- Messaggio ricevuto:" + letto);
			String risposta = letto.toUpperCase();
			System.out.println("[5]- La mia risposta sarà: " + risposta);
			out.writeBytes(risposta + "\n");
			socketClient.close();  //chiusura connessione
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Socket aspetta()
	{
		try 
		{
			System.out.println("[0]- Server Attivo");
			//si inizializza il servizio
			server = new ServerSocket (porta);
			
			System.out.println("[1]- Server in ascolto sulla porta: " + porta);
			//si mette in ascolto sulla porta aperta
			socketClient = server.accept();
			
			System.out.println("[2]- Connessione effettuata correttamente con un client");
			server.close();
			
			in = new DataInputStream(socketClient.getInputStream());
			out = new DataOutputStream(socketClient.getOutputStream());
			
			
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return socketClient;
	}
	
	public static void main(String[] args)
	{
		Server pino = new Server();
		pino.aspetta();
		pino.Comunica();
	}
	
}
