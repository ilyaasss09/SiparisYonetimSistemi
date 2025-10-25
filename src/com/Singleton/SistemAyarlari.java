package com.Singleton;

public class SistemAyarlari 
{
	private static SistemAyarlari instance;
	private double vergiOrani;
	private double kargoUcreti;
	private boolean gelistiriciModu;
	
	private SistemAyarlari()
	{
		this.vergiOrani = 0.18;
		this.kargoUcreti = 15;
		this.gelistiriciModu = false;
	}
	
	public static SistemAyarlari getInstance()
	{
		if(instance == null)
		{
			synchronized(SistemAyarlari.class)
			{
				if(instance == null)
				{
					instance = new SistemAyarlari();
				}
			}
		}
		
		return instance;
	}

	
	//getter & setter

	public double getVergiOrani()
	{
		return vergiOrani;
	}
	public void setVergiOrani(double vergiOrani1)
	{
		this.vergiOrani = vergiOrani1;
	}
	
	public double getKargoUcreti()
	{
		return kargoUcreti;
	}
	public void setKargoUcreti(double kargoUcreti1)
	{
		this.kargoUcreti = kargoUcreti1;
	}
	
	public boolean getGelistiriciModu()
	{
		return gelistiriciModu;
	}
	public void setGelistiriciModu(boolean gelistiriciModu1)
	{
		this.gelistiriciModu = gelistiriciModu1;
	}
}
