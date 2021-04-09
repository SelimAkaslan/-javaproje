package kutuphane;



public interface IKitaplar {
	void kitapKaydet(Kitaplar kitaplar);
	void kitapSil(int id);
	void kitapGuncelleme(int id, Kitaplar kitaplar);
	void kitapGoruntuleme();

}
