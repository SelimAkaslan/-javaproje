package kutuphane;

import java.util.Scanner;

public class KutuphaneRunner {

	public static void main(String[] args) {
		VeriGirisi veriGirisi = new VeriGirisi();

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yapmak istediginiz islemin numarasini giriniz :\n1 : Kitap ekle \n"
				+ "2 : Numara ile kitap sil\n" + "3 : Numara ile kitap ara\n" + "4 : Tüm kitapları listele\n"
				+ "5 : Bitir");
		int islem = scan.nextInt();
		scan.nextLine();

		if (islem == 1) {
			System.out.println("Kitap adi giriniz");
			String kitapAdi = scan.nextLine();

			System.out.println("Kitap yazarinin adini giriniz");
			String kitapYazari = scan.nextLine();

			System.out.println("Kitabin yayin yilini giriniz");
			int yayinYili = scan.nextInt();

			System.out.println("Kitabin fiyatini giriniz");
			int fiyat = scan.nextInt();

			Kitaplar yeniKitap = new Kitaplar(kitapAdi, kitapYazari, yayinYili, fiyat);

			veriGirisi.kitapKaydet(yeniKitap);

			String devam;
			do {
				System.out.println("Kitap eklemeye devam etmek istiyor musunuz? ");
				devam = scan.next();
			} while (devam.equalsIgnoreCase("e"));

			System.out.println("Lutfen yapmak istediginiz islemin numarasini giriniz :\n1 : Kitap ekle \n"
					+ "2 : Numara ile kitap sil\n" + "3 : Numara ile kitap ara\n" + "4 : Tüm kitapları listele\n"
					+ "5 : Bitir");

		} else if (islem == 2) {
			System.out.println("Silmek istediginiz kitap numarasini giriniz: ");
			int id = scan.nextInt();
			veriGirisi.kitapSil(id);

		} else if (islem == 3) {
			System.out.println("Guncellemek istediginiz kitap numarasini giriniz: ");
			int id = scan.nextInt();

			System.out.println("Kitap adi giriniz");
			String kitapAdi = scan.nextLine();

			System.out.println("Kitap yazarinin adini giriniz");
			String kitapYazari = scan.nextLine();

			System.out.println("Kitabin yayin yilini giriniz");
			int yayinYili = scan.nextInt();

			System.out.println("Kitabin fiyatini giriniz");
			int fiyat = scan.nextInt();

			Kitaplar yeniKitap = new Kitaplar(kitapAdi, kitapYazari, yayinYili, fiyat);

			veriGirisi.kitapGuncelleme(id, yeniKitap);

		} else if (islem == 4) {
			veriGirisi.kitapGoruntuleme();

		} else if (islem == 5) {
			System.out.println("Program sonlandirildi");

		}

	}

}
