import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int yr;
        System.out.println("Enter the year : ");
        yr=in.nextInt();
        if(yr%4==0){
            System.out.println("The year is a Leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }
    }
    
}
