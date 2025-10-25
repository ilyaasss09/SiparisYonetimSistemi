import java.util.ArrayList;
import java.util.List;

import com.AbstractFactory.GonderimTipi;
import com.AbstractFactory.IslemFabrikasi;
import com.AbstractFactory.OdemeYontemi;
import com.AbstractFactory.PremiumIslemFabrikasi;
import com.AbstractFactory.StandartIslemFabrikasi;
import com.Builder.Siparis;
import com.Builder.StandartSiparisBuilder;
import com.FactoryMethod.ElektronikUrunFabrikasi;
import com.FactoryMethod.GiyimUrunuFabrikasi;
import com.FactoryMethod.Urun;
import com.FactoryMethod.UrunFabrikasi;
import com.Prototype.SiparisSablonu;
import com.Singleton.SistemAyarlari;


public class Main
{
	public static void main(String[] args)
	{
		// Singleton
		
		SistemAyarlari ayar = SistemAyarlari.getInstance();
		ayar.setGelistiriciModu(true);
		System.out.println("Sistem Ayarlari: " + ayar);
		
		// Factory Method
		
		UrunFabrikasi elektronikFabrika = new ElektronikUrunFabrikasi();
		UrunFabrikasi giyimFabrika = new GiyimUrunuFabrikasi();
		
		Urun telefon = elektronikFabrika.urunOlustur("Iphone", 80000, "15 Pro Max");
		Urun tshirt = giyimFabrika.urunOlustur("T-shirt", 750, "Polo Yaka");
		
		System.out.println("Ürünler: ");
		System.out.println(telefon);
		System.out.println(tshirt);
		
		// Abstract Factory 
		
		IslemFabrikasi standartIslem = new StandartIslemFabrikasi();
		IslemFabrikasi PremiumIslem = new PremiumIslemFabrikasi();
		
		OdemeYontemi odemeStandart = new StandartIslemFabrikasi().odemeYontemiUret();
		GonderimTipi gonderimStandart = new StandartIslemFabrikasi().gonderimTipiUret();
		
		OdemeYontemi odemePremium = new PremiumIslemFabrikasi().odemeYontemiUret();
		GonderimTipi gonderimPremium = new PremiumIslemFabrikasi().gonderimTipiUret();
		
        System.out.println("Standart islem: " + odemeStandart.adGetir() + ", " + gonderimStandart.adGetir());
        System.out.println("Premium islem: " + odemePremium.adGetir() + ", " + gonderimPremium.adGetir());
        
        // Builder 
        
        List<Urun> urunler = new ArrayList<>();
        urunler.add(telefon);
        urunler.add(tshirt);
        
        Siparis siparis = new StandartSiparisBuilder()
                .siparisNo("SIP-001")
                .musteriAdi("Ahmet Yilmaz")
                .adres("Konya, Türkiye")
                .urunler(urunler)
                .indirimKodu("KGTU10")
                .notlar("Hızlı teslimat istiyorum.")
                .build();
        
        System.out.println("Oluşan Sipariş:");
        System.out.println(siparis);
        
        // Prototype 
        
        List<Urun> sablonUrunler = new ArrayList<>();
        sablonUrunler.add(telefon);
        sablonUrunler.add(tshirt);
        SiparisSablonu normalSablon = new SiparisSablonu("Normal Musteri", "Ankara", sablonUrunler);
        
        //Shallow clone
        SiparisSablonu shallow = normalSablon.clone();
        shallow.getUrunler().get(0);
        
        //Deep clone 
        SiparisSablonu deep = normalSablon.deepClone();
        
        System.out.println("Orijinal şablon ürünler adresi: " + normalSablon.getUrunler().hashCode());
        System.out.println("Shallow kopya ürünler adresi: " + shallow.getUrunler().hashCode());
        System.out.println("Deep kopya ürünler adresi: " + deep.getUrunler().hashCode());
        
        System.out.println("=== Shallow değişiklik testi ===");
        shallow.getUrunler().remove(0);
        
        System.out.println("Orijinal urun sayisi (shallow etkiledi): " + normalSablon.getUrunler().size());

        System.out.println("=== Deep değişiklik testi ===");
        System.out.println("Deep urun sayisi (değişmedi): " + deep.getUrunler().size());

	}
}
