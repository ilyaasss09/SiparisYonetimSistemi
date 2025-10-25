package com.FactoryMethod;

public class GiyimUrunu implements Urun
{
	private String ad;
	private double fiyat;
	private String beden;
		
	public GiyimUrunu(String ad1, double fiyat1, String beden1)
	{
		this.ad = ad1;
		this.fiyat = fiyat1;
		this.beden = beden1;
	}
		
		
	public double fiyatGetir()
	{
	return fiyat;
	}
		
	public String adGetir()
	{
		return ad;
	}
		
	public String urunAciklamasi()
	{
		return "Giyim: " + ad + " (Beden: " + beden + ")";
	}
	
	public Urun cloneUrun() 
	{
		return new GiyimUrunu(this.ad, this.fiyat, this.beden);
    }
}