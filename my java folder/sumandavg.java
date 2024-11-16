import java.util.Scanner;
public class sumandavg{
    public static void main(String[] args) {
        int arr[]={2,3,5,6,7};
        int sum=0;int avg=0;
        for(int i=0;i<arr.size();i++){
            sum=sum+arr[i];
        }   
        avg=sum/arr.size();
        System.out.println("the sum is "+sum);
        System.out.println("the average is "+avg);
    }
}
