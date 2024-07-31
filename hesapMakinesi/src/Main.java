import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  double n1,n2;
  int select;

  Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz:");
        n1 = inp.nextDouble();
        System.out.print("İkinci sayıyı giriniz:");
        n2 = inp.nextDouble();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz:");
        select = inp.nextInt();
        switch(select){
            case 1:
                System.out.println("Toplam:" +(n1+n2));
            break;
            case 2:
                System.out.println("Fark:" +(n1-n2));
                break;
            case 3:
                System.out.println("Çarpım:" + (n1*n2));
                  break;
            case 4:
                if(n2 != 0){
                System.out.println("Bölüm:" + (n1 / n2));
                }
                else {
                    System.out.println("Bir sayı sıfıra bölünemez.");
                }
                break;

            default:
                System.out.println("Yanlış seçim yaptınız...");
        }
    }
}