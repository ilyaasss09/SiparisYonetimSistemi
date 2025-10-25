package com.FactoryMethod;

public class ElektronikUrunFabrikasi extends UrunFabrikasi
{
	public Urun urunOlustur(String ad, double fiyat, String ozellik)
	{
		return new ElektronikUrun(ad, fiyat, ozellik);
	}
}
