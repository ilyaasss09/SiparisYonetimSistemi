package com.FactoryMethod;

public class ElektronikUrun implements Urun
{
	private String ad;
	private double fiyat;
	private String model;
	
	public ElektronikUrun(String ad1, double fiyat1, String model1)
	{
		this.ad = ad1;
		this.fiyat = fiyat1;
		this.model = model1;
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
		return "Elektronik: " + ad + " (" + model + ")";
	}
	
	public Urun cloneUrun()
	{
       return new ElektronikUrun(this.ad, this.fiyat, this.model);
    }
}
