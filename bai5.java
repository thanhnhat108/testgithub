import java.util.Scanner;

public class bai5 {
    public static void main(String []args ){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>=b && a>=c){
            if(b>=c){
                System.out.println(b);
            }
            else System.out.println(c);
        }
        else {
            if(b>=c){
                if(a>=c){System.out.println(a);}
                else System.out.println(c);
            }
            else {
                if(a>=b){System.out.println(a);}
                else System.out.println(b);
            }
        }
        sc.close();
    }
}
