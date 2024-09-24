class Box{
    int size;
    Box(int size){
        this.size=size;
    }
}
class Boxweight extends Box{
    int weight;

    Boxweight(int size,int weight){
        super(size);
        this.weight=weight;
        
    }
}
public class inherit {
    public static void main(String[] args) {
        Boxweight o1=new Boxweight(25,200);
        System.out.println(o1.size+" "+o1.weight);
    }
}
