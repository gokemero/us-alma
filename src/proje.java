import java.util.Scanner;
public class proje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınıcak sayıyı giriniz :");
        int x = input.nextInt();
        System.out.print("Üssünü giriniz :");
        int y = input.nextInt();
        int a = 1;
        for(int i = 1;i<=y;i++){
            a *= x;

        }
        System.out.println(a);
    }
}