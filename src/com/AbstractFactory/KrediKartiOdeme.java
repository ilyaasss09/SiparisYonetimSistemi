package com.AbstractFactory;

public class KrediKartiOdeme implements OdemeYontemi
{
	public boolean odemeYap(double miktar)
	{
		System.out.println("Kredi Kartınızdan " + miktar + " TL tahsil edilmiştir.");
		return true;
	}
	
	public String adGetir()
	{ 
		return "Kredi Kartı"; 
	}
}
