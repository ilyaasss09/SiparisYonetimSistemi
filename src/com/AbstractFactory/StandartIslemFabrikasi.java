package com.AbstractFactory;

public class StandartIslemFabrikasi implements IslemFabrikasi
{
	public OdemeYontemi odemeYontemiUret()
	{
		return new KrediKartiOdeme();
	}

	public GonderimTipi gonderimTipiUret()
	{
		return new StandartGonderim();
	}
}
