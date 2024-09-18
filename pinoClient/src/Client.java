import java.io.*;
import java.net.*;

public class Client 
{
	Socket mioSocket = null;
	
	int porta = 5555;  //porta del server
	
	DataInputStream in;
	DataOutputStream out;
	
	BufferedReader tastiera;
	
	public void Comunica()
	{
		try 
		{
			tastiera = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("[2]- Messagio da inviare al server :");
			String messaggio = tastiera.readLine();
			System.out.println("[3]- Invio: " + messaggio);
			out.writeBytes(messaggio + "\n");
			System.out.println("[4]- In attesa di risposta...");
			String ricevuta = in.readLine();
			System.out.println("[5]- Risposta ricevuta:" + ricevuta);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public Socket Connetti()
	{
		try 
		{
			System.out.println("[0]- Prova di connessione al server...");			
			Socket mioSocket = new Socket (InetAddress.getLocalHost(), porta);
			System.out.println("[1]- Connesso!");
			in = new DataInputStream(mioSocket.getInputStream());
			out = new DataOutputStream(mioSocket.getOutputStream());
		}
		
		catch (UnknownHostException e) 
		{
			System.err.println("Host non raggiungibile");
		}  
		
		catch (Exception e)
		{
			System.err.println("Impossibile connettersi!!");
		}
		return mioSocket;
	}
	
	public static void main(String[] args)
	{
		Client peppe = new Client();
		peppe.Connetti();
		peppe.Comunica();
	}

}
