package com.Builder;

import com.AbstractFactory.*;
import com.FactoryMethod.*;
import java.util.ArrayList;
import java.util.List;


public class Siparis
{
	private String siparisNo;
	private String musteriAdi;
	private String adres;
	private List<Urun> urunler;
	
	private OdemeYontemi odemeYontemi;
	private GonderimTipi gonderimTipi;
	private String indirimKodu;
	private String notlar;
	
	Siparis(String siparisNo1, String musteriAdi1, String adres1, List<Urun> urunler1, OdemeYontemi odemeYontemi1, GonderimTipi gonderimTipi1,
			String indirimKodu1, String notlar1)
	{
		this.siparisNo = siparisNo1;
		this.musteriAdi = musteriAdi1;
		this.adres = adres1;
		this.urunler = urunler1;
		this.odemeYontemi = odemeYontemi1;
		this.gonderimTipi = gonderimTipi1;
		this.indirimKodu = indirimKodu1;
		this.notlar = notlar1;
	}
	

}
