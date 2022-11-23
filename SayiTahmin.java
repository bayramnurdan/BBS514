//BBS 514 HW part 2
//Nurdan Emin
//N22137478


import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char newGame ='E';
		
GameStart:  while(newGame =='E') {         //Since I used two nested while loops I labeled them so that continue statements works correctly.
	
			Random rand = new Random();
			int randomNumber = rand.nextInt(100);
			randomNumber++;
			  
			//System.out.println("Rasgale Sayı: "+randomNumber);
			System.out.println("1 ile 100 arasında bir sayı tuttum. Tuttuğum sayıyı tahmin edebilir misiniz?");
			System.out.println("Lütfen ilk tahmini girin (oyunu sonlandırmak için -1):");
			int userAnswer = scan.nextInt();
			int NumberOfGuesses = 1;
			
			
AnswerCheck:	while (userAnswer !=-1) {   //checking user answers, nested while loops
	
				if (userAnswer==randomNumber) {
					System.out.println("DOĞRU TAHMİN.\n"
							+ "Tuttuğum " + randomNumber + " sayısını " + NumberOfGuesses  + " tahminde buldunuz.");
					System.out.println("Yeni bir oyun oynamak istiyorsanız E karakteri girin:");
					newGame= scan.next().charAt(0);
					continue GameStart;         //skip the rest and turn back to beginning of game
					
				}else if (userAnswer > randomNumber) {
					System.out.println("Tuttuğum sayı daha KÜÇÜK. Tekrar tahmin ediniz(oyunu sonlandırmak için -1):");
					userAnswer =scan.nextInt();
					NumberOfGuesses ++;
					continue AnswerCheck;	
					
				}else if (userAnswer < randomNumber) {
					System.out.println("Tuttuğum sayı daha BÜYÜK. Tekrar tahmin ediniz(oyunu sonlandırmak için -1):");
					userAnswer =scan.nextInt();
					NumberOfGuesses ++;
					continue AnswerCheck;
		}
				
		}

			if (userAnswer == -1) {
				System.out.println("Bu oyunu sonlandırdınız. Tuttuğum sayı " + randomNumber + "ti.");
				System.out.println("Yeni bir oyun oynamak istiyorsanız E karakteri girin:");
				newGame= scan.next().charAt(0);
			}
			
		}

if (newGame !='E') {
	System.out.println("Oyun için teşekkürler.");
}


	}	
	}


