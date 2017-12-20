
import java.util.Scanner;


public class sinif {

      public static void main(String[] args) {
        
            Scanner giris=new Scanner(System.in);
        System.out.println("İsim Giriniz:");
        String isim=giris.nextLine();
        for (int i = 0; i <=isim.length(); i++) {
          
            for (int j = 0; j <isim.length()-i; j++) { //her satırda azaltarak boşluk attık
                System.out.print(" ");
            }
          
            for (int j = 0; j < i; j++) {
                System.out.print(isim.charAt(j)+" ");
            }
            System.out.println("");
        }

      }

}