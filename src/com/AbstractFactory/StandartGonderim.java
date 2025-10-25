package com.AbstractFactory;

public class StandartGonderim implements GonderimTipi
{
	public double gonderimMaliyetiHesapla(double toplamTutar, double kargoUcreti)
	{
		double maliyet = Math.max(kargoUcreti, 0.15 * toplamTutar);
		return maliyet;
	}
	
	public int tahminiTeslimSuresi()
	{
		return 5;
	}
	
    public String adGetir()
    { 
    	return "Standart Gönderim"; 
    }

}
