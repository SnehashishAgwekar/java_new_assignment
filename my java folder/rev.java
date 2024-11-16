import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();int rev=0;
        while(num>0){
            int a=num%10;
            rev=rev*10+a;
            num=num/10;
        }
        System.out.println("the reversed number is "+ rev);
    }
}
