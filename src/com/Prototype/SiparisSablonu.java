package com.Prototype;

import com.FactoryMethod.*;
import java.util.ArrayList;
import java.util.List;

public class SiparisSablonu implements Cloneable
{
	private String musteriAdi;
	private String adres;
	private List<Urun> urunler;
	
	public SiparisSablonu(String musteriAdi1, String adres1, List<Urun> urunler1)
	{
		this.musteriAdi = musteriAdi1;
		this.adres = adres1;
		this.urunler = urunler1;
	}
	
	public String getMusteriAdi()
	{
		return musteriAdi;
	}
	public String getAdres()
	{
		return adres;
	}
	public List<Urun> getUrunler()
	{
		return urunler;
	}
	
	//Shallow Copy
	public SiparisSablonu clone() 
	{
        try
        {
            return (SiparisSablonu) super.clone();
        } 
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError(e);
        }
    }
	
	//Deep Copy
	public SiparisSablonu deepClone()
	{
		List<Urun> yeniUrunler = new ArrayList<>();
		for (Urun u : this.urunler)
		{
			yeniUrunler.add(u.cloneUrun()); // Urun'ün cloneUrun() metodu çağrılır
	    }
	        return new SiparisSablonu(this.musteriAdi, this.adres, yeniUrunler);
	}
}
