import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int cnt=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt<1){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("not Prime");
        }
    }
}
