class Shapes{
    void surfacearea(){
        System.out.println("I am in shapes");
    }
    void volume(){
        System.out.println("I am in shapes");
    }
}
class cube extends Shapes{
    void surfacearea(int a){
        System.out.println("the surface area of cube is"+ 6*a*a);
    }
    void volume(int a){
        System.out.println("the volume of cube is"+a*a*a);
    }
}
class cone extends Shapes{
    void surfacearea(int r,int s){
        System.out.println("the surface arae of cone is "+3*r*r+r*s);
    }
    void volume(int r,int h){
        System.out.println("the volume of the cone is "+0.3*r*r*h);
    }
}
public class ride {
    public static void main(String[] args) {
        cube o1=new cube();
        o1.surfacearea(4);
        o1.volume(3);
        cone o2=new cone();
        o2.surfacearea(2,2);
        o2.volume(2,3);
        
    }
}
