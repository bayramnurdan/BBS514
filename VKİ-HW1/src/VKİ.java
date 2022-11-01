
//Nurdan Emin
 // N22137478



import java.util.Scanner;

public class VKİ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //create scanner object
		System.out.println("Vücut Kitle İndeksi Hesaplama Programı");
		System.out.println("Vücut Ağırlığınız (kg):\n");
		double weight = scan.nextDouble();                 //get height and weight as double from the prompt.
		System.out.println("Boy Uzunluğunuz (m):\n");
		double height = scan.nextDouble();
		double bodyMassIndex = weight/Math.pow(height, 2);          //math pow takes the given power of given number
		System.out.printf("Vücut Kitle İndeksiniz:  %5.2f\n", bodyMassIndex); //Vki will be printed with 5 character and there will be 2 digits after decimal
		                                                                    
		String classification ="";
		
		if (bodyMassIndex<20) {
			classification = "Zayıf";
			
		}else if (bodyMassIndex<25) {
			classification="Normal";
			
		}else if (bodyMassIndex<30) {
			classification ="Hafif Şişman";
			
		}else if(bodyMassIndex<35) {
			classification="Şişman-ObezI";
				
		}else if (bodyMassIndex<45) {
			classification = "Şişman-Obez II";
				
		}else {
			classification = "Şişman-Obez III";
		}
		
		
		System.out.println("Şişmanlık Sınıflandırmanız: "+ classification);
		
		
		
		
		
	}

}
