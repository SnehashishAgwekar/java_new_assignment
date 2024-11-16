import java.util.Scanner;
public class median {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[];int n=in.nextInt();int medi=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }   
        if(n%2==0){
            medi=(arr[n/2]+arr[n/1-1])/2;
        }
        else{int n2=n1%2;
            medi=arr[n2+1];
        }
    }  
}
