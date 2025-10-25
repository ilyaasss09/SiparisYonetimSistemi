package com.AbstractFactory;

public class HavaleOdeme implements OdemeYontemi
{
	public boolean odemeYap(double miktar)
	{
		System.out.println("Havale talimatı oluşturuldu " + miktar + " TL.");
		return true;
	}
	
    public String adGetir() 
    { 
    	return "Havale"; 
    }


}
