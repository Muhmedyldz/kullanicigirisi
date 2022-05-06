import java.util.Scanner;

public class Kullanicigirisi1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String un,pas;
        System.out.println("Kullanici adinizi giriniz :");
        un=scan.nextLine();
        System.out.println("Sifreyi giriniz :");
        pas=scan.nextLine();
        if(un.equals("patika")){
            if (pas.equals("java123")){
                System.out.println("Basarili giris yaptiniz.");
            }
            else{
                    System.out.println("Sifre hatali, sifrenizi degistirmek istermisiniz(evet yada hayir) :");
                    String onay=scan.nextLine();
                    switch (onay){
                        case "evet":
                            System.out.println("yeni sifre giriniz :");
                            String yenisifre=scan.nextLine();
                            if(yenisifre.equals(pas)) {
                                System.out.println("demin girdiginle ayni tekrar gir :");
                                yenisifre=scan.nextLine();
                                System.out.println("yeni sifreniz :" + yenisifre);
                            }
                            else{
                                System.out.println("yeni sifreniz :" + yenisifre);
                            }
                            break;
                        case "hayir":
                            break;
                    }
            }
        }
        else{
            System.out.println("Kullanici adi ve sifre hatalidir.");
        }
    }
}
