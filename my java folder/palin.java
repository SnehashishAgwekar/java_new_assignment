import java.util.Scanner;
public class palin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=n1;
        int n3=0;
        while(n2>0){
            n3=n2%10;
            n2=n2/10;
            n3=n3*10+n3;

        }
        if(n3==n1){
            System.out.println("It is a Palindrome number");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
