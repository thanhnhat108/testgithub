import java.util.Scanner;

public class bai11 {
    public static int giathua(int n){
        if(n%2==0){
            if(n==2) return 2;
            else return n*giathua(n-2);
        }
        else {
            if(n==1) return 1;
            else return n*giathua(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(giathua(n));
        sc.close();
        
    }
    
}
