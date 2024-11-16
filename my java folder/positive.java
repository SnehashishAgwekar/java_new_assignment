import java.util.Scanner;
public class positive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        num=input.nextInt();
        if(num<0){
            System.out.println("number is negative");
        }
        else if(num>0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is zero");
        }
    }
    
}
