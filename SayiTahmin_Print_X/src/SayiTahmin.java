import java.util.Random;
import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * Okul NO: N20130497
 *
 */
public class SayiTahmin {


	public static void main(String[] args) {
		
		Scanner tahminGiris = new Scanner(System.in);		//Kullanicidan girdi almak icin scanner sinifindan nesne olusturduk.
        Random rndm = new Random();							//Bilgisayardan random sayi almak icin random sinifinden nesne olsuturduk.


        System.out.print("1 ile 100 arasında bir sayı tuttum.\n");

        System.out.print("Tuttuğum Sayıyı Tahmin Edebilir misin?\n");

        System.out.print("Lütfen ilk tahmininizi girin :\n");

        int tahmin = tahminGiris.nextInt();				//kullanicinin tahminini alacagimiz degeri olusturduk

        int sayi = rndm.nextInt(101);					// rastgele verilecek olan sayiyi sayi degiskenine atadik.

        int count = 1;									//yapilacak tahmin sayisi icin sayac degeri tanimladik.

        String input;									// string tipinde veri tanimladik

        char repeat;									// char tipinde veri tanimladik

        do {
        	
            while(tahmin != sayi ){				// kullanicidan alinan tahmin sayi ile esit degilken
                count = count + 1;				// tahmin sayisini ogrenmek icin count degerini bir arttirdik.

                if (tahmin == -1){				// kullanicinin girdigi deger -1 e esitse program bitirilir.
                    System.out.println("Bu oyunu sonlandırdınız! Tuttuğum sayı : " + sayi);
                    return;
                }
                if (tahmin < 0 || tahmin > 100){					//kullanicinin girdigi deger sifirdan kucuk veya 100 den büyükse
                    System.out.println("1 ile 100 arasında bir değer giriniz : "); //hata mesaji verir
                    tahmin = tahminGiris.nextInt();							// yeni girdi ister
                }else if (tahmin < sayi){								// kullanicinin girdigi deger sayi dan kucukse
                    System.out.println("Düşük. Tekrar tahmin ediniz :");		//sayidan kucuk oldugunu bildirir 
                    tahmin = tahminGiris.nextInt();							//yeni deger ister
                }else {
                    System.out.println("Büyük. Tekrar tahmin ediniz :");		//kullanicinin girdigi deger sayidan buyukse
                    tahmin = tahminGiris.nextInt();								// yeni girdi ister
                }
            }//Kullanici dogru tahminde bulunursa ekrana tahmin edilen sayiyi ve kac kere tahmin ettigi yazdirilir.
            System.out.println("Doğru.\n" + "Tuttuğum " + sayi + " sayısını " + count + " tahminde buldun."); 

            System.out.println("\nYeni bir oyun oynamak istiyorsanız E karakterini girin : ");//tekrar oynamak isteyip istemedigi sorulur
            input = tahminGiris.next();  // karakter girmek icin String tipinde olan input degiskeni atanır.
            repeat = input.charAt(0);	// girilen karakter okumak icin char tipindeki repeat degiskeninde tutulur. 

            if (!(repeat == 'E' || repeat == 'e')) {				//kullanici e karakteri girmezse oyun biter ve mesaj verir
                System.out.println("Oyun için teşekkürler.");
            }else {													// E,e karakteri girerse oyun yeniden baslar.
                System.out.print("1 ile 100 arasında bir sayı tuttum.\n");

                System.out.print("Tuttuğum Sayıyı Tahmin Edebilir misin?\n");

                sayi = rndm.nextInt(101);
                
                System.out.print("Lütfen ilk tahmininizi girin :\n");
                
                tahmin = tahminGiris.nextInt();
               
                while(tahmin != sayi ){
                 
                	count = count + 1;

                    if (tahmin == -1){
                    
                    	System.out.println("Bu oyunu sonlandırdınız! Tuttuğum sayı : " + sayi);
                    
                    	return;
                    }
                   
                    if (tahmin < 0 || tahmin > 100){
                   
                    	System.out.println("1 ile 100 arasında bir değer giriniz : ");
                     
                    	tahmin = tahminGiris.nextInt();
                   
                    }else if (tahmin < sayi){
                   
                    	System.out.println("Düşük. Tekrar tahmin ediniz :");
                   
                    	tahmin = tahminGiris.nextInt();
                   
                    }else {
                    
                    	System.out.println("Büyük. Tekrar tahmin ediniz :");
                    
                    	tahmin = tahminGiris.nextInt();
                    }
                }
            }


        }while (repeat == 'E' || repeat == 'e');				// Kullanici E,e girdigi muddetce yukaridaki sartlar gerceklesir
        														// aksi halde dongu biter ve oyun sonlanir.
	}

}
