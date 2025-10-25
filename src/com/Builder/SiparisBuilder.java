package com.Builder;

import com.FactoryMethod.*;
import com.AbstractFactory.*;
import java.util.List;

public interface SiparisBuilder 
{	
	 SiparisBuilder siparisNo(String siparisNo);
	 SiparisBuilder musteriAdi(String musteriAdi);
	 SiparisBuilder adres(String adres);
	 SiparisBuilder urunler(List<Urun> urunler);
	 SiparisBuilder odemeYontemi(OdemeYontemi odemeYontemi);
	 SiparisBuilder gonderimTipi(GonderimTipi gonderimTipi);
	 SiparisBuilder indirimKodu(String indirimKodu);
	 SiparisBuilder notlar(String notlar);
	 Siparis build();


}
