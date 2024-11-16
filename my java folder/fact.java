public class fact {
    public static void main(String[] args) {
        int fact=1;
        int n=12;
        while(n>1){
            fact=fact*n;
            n--;
        }
        System.out.println("the factorial of 12 is "+fact);
    }
    
}
