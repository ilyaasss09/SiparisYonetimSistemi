package com.AbstractFactory;

public class HizliGonderim implements GonderimTipi
{
	public double gonderimMaliyetiHesapla(double toplamTutar, double kargoUcreti)
	{
		double maliyet = Math.max(kargoUcreti, 0.15 * toplamTutar) + 10;
		return maliyet;
	}
	
	public int tahminiTeslimSuresi()
	{
		return 2;
	}
	
	public String adGetir()
	{ 
		return "Hızlı Gönderim"; 
	}
}
