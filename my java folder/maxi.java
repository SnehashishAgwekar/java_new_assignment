import java.util.Scanner;
public class maxi {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();int maxi;
        if(n1>n2 && n1>n3){
            maxi=n1;
        }
        else if(n2>n1 && n2>n3){
            maxi=n2;
        }
        else{
            maxi=n3;
        }
        System.out.println("the maximum number is "+maxi);
    }

}
