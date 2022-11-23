//514 HW 2
//Nurdan Emin
//N22137478


import java.util.Scanner;

public class WYazdirma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Büyük W yazdırma programına hoş geldiniz.\n");
		System.out.println("Lütfen satır sayısı için 3 ile 15 arasında bir sayı giriniz:\n");
		int numberOfLines = scan.nextInt();
		System.out.println();
		
		while(numberOfLines<3 || numberOfLines>15){
			System.out.println("Geçerli olmayan bir satır sayısı girdiniz.");
			System.out.println("Lütfen satır sayısı için 3 ile 15 arasında bir sayı giriniz:\n");
			numberOfLines = scan.nextInt();
			System.out.println();
			
		}
			
		
		
		int spaceInsideoneV = (numberOfLines -3)*2 +3;  //We should think W as two V's. this number is the middle space between two stars in V character.
		
		int spaceBetweenTwoV =1;    //when we think w as two V, after the first line a space exists between V and V. It increases by two at each line 
		for (int i= 0; i<numberOfLines; i++) {
			String tempLine ="";                           //create a temporary string and modify it according to line number
			                                                       //and at the end of each for loop print it                         
			if (i==0) {                           //first and last lines are special because they only include 3 stars, different from others.
				tempLine +="*";
				for (int z=0; z<spaceInsideoneV; z++) {  
					tempLine +=" ";
				}
				tempLine += "*"; 
				for (int z=0; z<spaceInsideoneV; z++) {  //crate second space
					tempLine +=" ";
				}
				tempLine += "*"; 
				spaceInsideoneV -=2;  //the first line completed, decrease space by two for next step
			}
			
			
			else if (i==numberOfLines-1) {      //last line, special case
				for (int j=i; j>0; j--) {   //add first space from left hand side, number of spaces equal line number
					tempLine += " ";
				}
				tempLine += "*";
				for (int h=0; h<spaceBetweenTwoV; h++) { //max spaces between two tips of V
					tempLine += " ";
				}
				tempLine +="*";
			}
			
			else {
				for (int j=i; j>0; j--) {   //add first space from left hand side, as many as line number
					tempLine += " ";
				}
				tempLine += "*";
				
				for (int z=0; z<spaceInsideoneV; z++) {  //crate space inside left V
					tempLine +=" ";
				}
				tempLine += "*";   //add second star
				
				for (int h=0; h<spaceBetweenTwoV; h++) { //space between two V's.
					tempLine += " ";
				}
				spaceBetweenTwoV +=2;
				tempLine += "*"; 
				for (int z=0; z<spaceInsideoneV; z++) {  //crate space inside right V
					tempLine +=" ";
				}
				spaceInsideoneV -=2;
				tempLine += "*";   //add second star	
			}
			System.out.println(tempLine);
		}
		
			
		}

	
		
	}
	
			
			
	