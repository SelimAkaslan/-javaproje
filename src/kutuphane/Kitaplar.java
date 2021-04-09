package kutuphane;

public class Kitaplar {
	/*KÜTÜPHANE PROGRAMI 
	Müşterileriler kütüphaneleri için bir kitap yönetim sistemi tasarlamanızı istiyorlar. 
	1.Bu programda kitaplar, Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler içerebilmelidir.
	2. Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermelidir. 
	3. Kullanıcı sisteme Kitap eklemeyebimeli, silebilmeli,  arama ve tüm kitapları listeleme gibi  işlemleri yapabilmelidir.  
	4. Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır ve Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir. 
				
	========= KİTAP PROGRAMI =============
		1: Kitap ekle 
		2: Numara ile kitap sil
		3. Numara ile kitap ara
		4: Tüm kitapları listele
		5: Bitir
		*/
	public String kitapAdi;
	public String yazarAdi;
	public int yayinYili;
	public int fiyat;
	
	public Kitaplar (String kitapAdi,String yazarAdi,int yayinYili,int fiyat) {
		super();
		this.kitapAdi = kitapAdi;
		this.yazarAdi=yazarAdi;
		this.yayinYili=yayinYili;
		this.fiyat=fiyat;
		
		
	}
	
	
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	public int getYayinYili() {
		return yayinYili;
	}
	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	

}
