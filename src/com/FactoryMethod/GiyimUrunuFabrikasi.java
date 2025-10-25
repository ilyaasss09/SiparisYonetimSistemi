package com.FactoryMethod;

public class GiyimUrunuFabrikasi extends UrunFabrikasi
{
	public Urun urunOlustur(String ad, double fiyat, String ozellik)
	{
		return new GiyimUrunu(ad, fiyat, ozellik);
	}

}
