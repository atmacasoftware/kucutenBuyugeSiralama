import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int sayi1, sayi2, sayi3;

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sayıların alıması
        System.out.print("Birinci Sayı : ");
        sayi1 = input.nextInt();

        System.out.print("İkinci Sayı : ");
        sayi2 = input.nextInt();

        System.out.print("Üçüncü Sayı : ");
        sayi3 = input.nextInt();

        if((sayi1 < sayi2) && (sayi1 < sayi3)){
            if(sayi2 < sayi3){
                System.out.print("sayı 1 < sayı 2 < sayı 3");
            }else{
                System.out.print("sayı 1 < sayı 3 < sayı 2");
            }
        }else if((sayi1 > sayi2) && (sayi1 < sayi3)){
            if(sayi2 < sayi3){
                System.out.print("sayı 2 < sayı 1 < sayı 3");
            }else{
                System.out.print("sayı 3 < sayı 1 < sayı 2");
            }
        }
        else{
            if(sayi2 < sayi3){
                System.out.print("sayı 2 < sayı 3 < sayı 1");
            }else{
                System.out.print("sayı 3 < sayı 2 < sayı 1");
            }
        }

    }
}