import java.util.Scanner;

//Basit Hesaplamalar:
public class Main{
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.println("Birinci Sayıyı Girin: ");
        Double num1 = get.nextDouble();

        System.out.println("İkinci Sayıyı Girin: ");
        Double num2 = get.nextDouble();

        Double toplama = num1+ num2;
        Double cikarma = num1- num2;
        Double carpma= num1 * num2;
        Double bolme = num1 / num2;

        System.out.printf(" %f + %f = %f \n", num1, num2, toplama);
        System.out.printf(" %f - %f = %f \n", num1, num2, cikarma);
        System.out.printf(" %f x %f = %f \n", num1, num2, carpma);
        System.out.printf(" %f / %f = %f \n", num1, num2, bolme);
        
    }
}