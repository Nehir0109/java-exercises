import java.util.Scanner;

// Telefon numarası biçimlendirme:
public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("On haneli telefon numaranızı girin: ");
        String telefonNo= get.nextLine();

        if( telefonNo.length() == 10) {
            String yeniNo = "(" + telefonNo.substring(0,3) + ")" + telefonNo.substring(3,6) + "-" + telefonNo.substring(6,10);
            System.out.println("Biçimlendirilmiş no: "+ yeniNo);
        }else {
            System.out.println("Hata! Lüten 10 haneli bir telefon numarası girin.");
        }

    }
}