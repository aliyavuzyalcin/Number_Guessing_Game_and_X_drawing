import java.util.Scanner;
/**
 * @author Ali Yavuz YALCIN
 * Okul No: N20130497
 *
 */
public class XYazdirma {

	
	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
        
		System.out.print("*****       B�y�k X yazd�rma program�na ho� geldiniz !      *****\n");
        
		System.out.print("L�tfen Sat�r Say�s� ��in 3 ile 21 Aras�nda Bir Poziif Tek Say� Giriniz : ");
        
		int n = number.nextInt();				//Kullanicidan bir n degeri alir.
       
            if (n == -1){						// n '-1' e esit ise program biter.
        
            	System.out.println("Program� bitirdiniz!");
            
            }else if (n % 2 == 0){					//degilse eger n in 2 ile bolumunden kalan 0 ise
            
            	if (n < 0){							// eger n sifirdan kucuk ise asag�daki ifadeyi yazar.
                
            		System.out.println("Negatif bir say� girdiniz!\nTekrar Deneyiniz!");
                
            	}else {								// eger 0 dan kucuk degil ama mod 2 esit sifir ise asagidaki ifade yaz�l�r.
                
            		System.out.println("�ift say� girdiniz!\nTekrar Deneyiniz.");
                }
            
            }else if (n >= 3 &  n <= 21 && n % 2 != 0) {		// eger -1 girilmemis ve yukaridaki ifadelerden hicbiri yazmadiysa
            													// n 3'e esit veya 3'ten buyuk ve n 21'den kucuk veya 21'e esit ise
            	//bir uzunluk degeri tanimladik				    //ve  n mod 2 esit degilse sifira
            	int length = n;								
                
                //bir genislik degeri tanimladik
            	int width = n;

                for (int i = 0; i < width; i++) {			//satir sayisini dondurecek olan for dongusudur
                
                	for (int j = 0; j < length; j++) {		//yildiz basacak olan for dongusudur.
                    
                		if (i == j || (i + j) % width == width - 1) {		//eger i j ye esit veya i ile j nin width ile modu
                															//width - 1 e esitse yildiz basar.
                			System.out.print("*");
                        
                		} else {										// degilse ekranda bosluk basilir
                        
                			System.out.print(" ");
                        }
                    }
                    
                	System.out.println();							//satir icin bosluk basar
                }
           
            }else{
             
            	System.out.println("3'ten k���k veya 21 den b�y�k bir say� girdiniz.\nTekrar Deneyiniz!");
            }

	}

}
