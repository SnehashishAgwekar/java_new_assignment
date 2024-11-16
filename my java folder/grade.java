import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int per=in.nextInt();
        if(per>=90){
            System.out.println("A grade");
        }
        else if(per>=80 && per<90){
            System.out.println("B grade");
        }
        else if(per>=70 && per<80){
            System.out.println("C grade");;
        }
        else if(per>=60 && per<70){
            System.out.println("D grade");
        }
        else{
            System.out.println("E grade");
        }
    }
}
