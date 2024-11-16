import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int cnt=0;
        while(num>0){
            num=num/10;
            cnt++;
        }
        System.out.println("The number of digits are "+cnt);
    }
}
