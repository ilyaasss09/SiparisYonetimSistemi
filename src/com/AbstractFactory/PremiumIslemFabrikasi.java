package com.AbstractFactory;

public class PremiumIslemFabrikasi implements IslemFabrikasi
{
	public OdemeYontemi odemeYontemiUret()
	{
		return new HavaleOdeme();
	}
	
	public GonderimTipi gonderimTipiUret()
	{
		return new HizliGonderim();
	}

}
