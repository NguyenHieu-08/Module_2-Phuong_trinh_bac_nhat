import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        
        System.out.print("Nhap a: ");
        int a = getInputNumber();
        System.out.print("Nhap b: ");
        int b = getInputNumber();
        System.out.print("Nhap c: ");
        int c = getInputNumber();

        if(a != 0) {
            System.out.println("Chuong trinh co mot nghiem: " + (double)((c-b)/a));
        } else {
            if(b == c) {
                System.out.println("Chuong trinh co vo so nghiem");
            } else {
                System.out.println("Chuong trinh vo nghiem");
            }
        }
    }

    public static int getInputNumber() {
        int n;
        
        Scanner nhapPhim = new Scanner(System.in);
        n = nhapPhim.nextInt();
        
        return n;
    }
}

