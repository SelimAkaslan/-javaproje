package kutuphane;

import java.util.ArrayList;


public class VeriGirisi implements IKitaplar {
	
	ArrayList<Kitaplar> kitap = new ArrayList<Kitaplar>();

	@Override
	public void kitapKaydet(Kitaplar kitaplar) {
		kitap.add(kitaplar);
		
	}

	@Override
	public void kitapSil(int id) {
		kitap.remove(id);
		
	}

	@Override
	public void kitapGuncelleme(int id, Kitaplar kitaplar) {
		kitap.add(id, kitaplar);
		
	}

	@Override
	public void kitapGoruntuleme() {
		if(kitap.isEmpty()) {
			System.out.println("Listede herhangi bir kayit bulunmamaktadir");
		}
		for (Kitaplar eser : kitap) {
			
			System.out.println("Kitap Adi: " +eser.kitapAdi +"\nYazar: " +eser.yazarAdi + "\nYil:" +eser.yayinYili
			+ "\nFiyat"+eser.getFiyat()+ "\n_________________________");

			
		}
		
	}
	
	
	
	

}
