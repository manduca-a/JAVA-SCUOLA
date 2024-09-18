import java.io.*;
import javax.swing.*;
import java.util.*;


public class ContoCorrente 
{
	//dichiarazione attributi
	private int numeroConto;
	private String intestatario;
	private double saldo;
	
	//dichiarazione metodi costruttore
	public ContoCorrente(int numeroConto, String intestatario, double saldo)
	{
		//assegnazione agli attributi mediante auto-referenza
		this.numeroConto=numeroConto;
		this.intestatario=intestatario;
		this.saldo=saldo;		
	}
	
	public ContoCorrente(int numeroConto, String intestatario)
	//costruttore senza saldo
	{
		this.numeroConto=numeroConto;
		this.intestatario=intestatario;
		saldo=0;
	}
	
	//dichiarazione metodi accesso attributi
	public int getNumeroConto()
	{
		return numeroConto;
	}
	
	public String getIntestatario()
	{
		return intestatario;
	}
	
	public double getSaldo()
	{
		return saldo;
	}
}
