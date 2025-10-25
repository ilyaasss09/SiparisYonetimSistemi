package com.Builder;

import com.FactoryMethod.*;
import com.AbstractFactory.*;
import java.util.ArrayList;
import java.util.List;

public class StandartSiparisBuilder implements SiparisBuilder
{
	private String siparisNo;
    private String musteriAdi;
    private String adres;
    private List<Urun> urunler = new ArrayList<>();
    private OdemeYontemi odemeYontemi;
    private GonderimTipi gonderimTipi;
    private String indirimKodu;
    private String notlar;
    
    public StandartSiparisBuilder()
    {
    	this.odemeYontemi = new KrediKartiOdeme();
    	this.gonderimTipi = new StandartGonderim();
    }
    
    public SiparisBuilder siparisNo(String siparisNo1)
    {
    	this.siparisNo = siparisNo1;
    	return this;
    }

    public SiparisBuilder musteriAdi(String musteriAdi1)
    {
    	this.musteriAdi= musteriAdi1;
    	return this;
    }
    
    public SiparisBuilder adres(String adres1)
    {
    	this.adres = adres1;
    	return this;
    }
    
    public SiparisBuilder urunler(List<Urun> urunler1)
    {
    	this.urunler = urunler1;
    	return this;
    }
    
    public SiparisBuilder odemeYontemi(OdemeYontemi odemeYontemi1)
    {
    	this.odemeYontemi = odemeYontemi1;
    	return this;
    }
    
    public SiparisBuilder gonderimTipi(GonderimTipi gonderimTipi1)
    {
    	this.gonderimTipi = gonderimTipi1;
    	return this;
    }
    
    public SiparisBuilder indirimKodu(String indirimKodu1)
    {
    	this.indirimKodu = indirimKodu1;
    	return this;
    }
    
    public SiparisBuilder notlar(String notlar1)
    {
    	this.notlar = notlar1;
    	return this;
    }
    
    //Sipariş Kontrol
    public Siparis build()
    {
        if (siparisNo == null || musteriAdi == null || adres == null || urunler == null || urunler.isEmpty())
        {
            throw new IllegalStateException("siparisNo, musteriAdi, adres ve urunler (en az 1) zorunludur.");
        }
        return new Siparis(siparisNo, musteriAdi, adres, urunler, odemeYontemi, gonderimTipi, indirimKodu, notlar);
    }  
}
