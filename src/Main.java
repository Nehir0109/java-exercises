import java.util.Scanner;

//Basit Hesaplamalar:
/*public class Main{
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
}*/

//Sınav Notu hesaplayıcı

/*public class Main{
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.println("Sınav Notunuzu Giriniz: ");
        Integer not = get.nextInt();

        if(not >=0 && not <= 100) {
            if(not >=50){
                System.out.println("Başarılı, Tebrikler!");
            }else {
                System.out.println("Başarısız :(");
            }
        }else {
            System.out.println("Hata! Lütfen geçerli bir not giriniz.");
        }

    }
}*/

//Dört işlem hesaplayıcı
public class Main{
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.println("Birinci sayıyı girin: ");
        Double num1 = get.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi girin: (+, - , x , /");
        char islem = get.next().charAt(0);

        System.out.println("İkinci Sayıyı giriniz: ");
        Double num2 = get.nextDouble();

        Double sonuc= 0.0;
        switch(islem){
            case '+': sonuc= num1 + num2;break;
            case '-': sonuc= num1-num2; break;
            case 'x': sonuc= num1 * num2; break;
            case '/': sonuc= num1/ num2; break;
        }
        System.out.printf("%f %s %f = %f",num1, islem, num2, sonuc);

    }
}