package com.AbstractFactory;

public interface GonderimTipi
{
	public double gonderimMaliyetiHesapla(double toplamTutar, double kargoUcreti);
	int tahminiTeslimSuresi();
    String adGetir();
}
