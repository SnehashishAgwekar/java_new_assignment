import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The numbers after swapping are "+a+" and "+b);
    }
}
