package ArrayHomeworks;
import java.util.Scanner;
public class SayiTahmin {
    public static void main(String[] args) {

        int sayi = (int)(Math.random()*101);
        System.out.println(sayi);

        int turn = 5;
        int tahmin;

        Scanner input = new Scanner(System.in);

        while(turn != 0){
            System.out.print("Tahmin sayınızı giriniz: ");
            tahmin = input.nextInt();
            turn--;
            if(tahmin != sayi){
                if(tahmin < sayi){
                    System.out.println("Tahmininiz random sayıdan küçüktür.");
                    System.out.println("Kalan hakkınız: " + turn);
                }
                else{
                    System.out.println("Tahmininiz random sayıdan büyüktür.");
                    System.out.println("Kalan hakkınız: " + turn);
                }
            }
            else{
                System.out.println("Tebrikler oyunu " + turn + ". turda bitirdiniz.");
                break;
            }
            if(turn == 0){
                System.out.println("Ne yazık ki 5 turda da doğru tahmin yapamadınız, kaybettiniz.");
            }
        }
    }
}