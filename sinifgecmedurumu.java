import java.util.Scanner;
public class sinifgecmedurumu {
    public static void main(String[] args) {
        int turkce,mat,fizik,muzik, tarih;

        Scanner input = new Scanner(System.in);

        System.out.println("TürkÇe notunuz  : ");
        turkce = input.nextInt();

        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.println("Fizik notunuz");
        fizik = input.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik = input.nextInt();

        System.out.println("Tarih notunuz");
        tarih = input.nextInt();

        double avarage;
        if(turkce< 0 || turkce> 100){
            avarage = (mat+fizik+muzik+tarih) / 4 ;
        }
        if(mat < 0 || mat > 100){
            avarage = (turkce+fizik+muzik+tarih) / 4 ;
        }
        if (fizik < 0 || fizik > 100){
            avarage = (turkce+mat+muzik+tarih) / 4 ;
        }
        if (muzik < 0 || muzik>100){
            avarage = (turkce+mat+fizik+tarih) / 4 ;
        }
        if (tarih < 0 || tarih > 100){
            avarage = (turkce+mat+fizik+muzik) / 4 ;
        }
        else {
            avarage = (turkce+mat+fizik+muzik+tarih) / 5 ;
            System.out.println("Ortlama notunuz : " + avarage);
            if (avarage <= 55){
                System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere!");

            }else{
                System.out.println("Tebrikler, sınıfı geçtinizi !");

            }
        }






    }
}
