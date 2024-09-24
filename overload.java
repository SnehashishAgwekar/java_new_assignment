class Over{int rollno;int marks;
    Over(){
        this.rollno=60;
        this.marks=50;
    }
    Over(int rollno,int marks){
        this.rollno=rollno;
        this.marks=marks;
    }
}
public class overload {
    public static void main(String[] args) {
        Over s1=new Over(69,100);
        System.out.println("the roll no is "+s1.rollno +" the marks are "+s1.marks);
    }
}
