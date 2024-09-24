class Student{
    String name;int age;int marks;
    Student(String name,int age,int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
}
class paraconst {
    public static void main(String[] args) {
        
        Student o1=new Student("Sneh",20,99);
        System.out.println("the name is "+o1.name+"the age is "+o1.age+"the marks are "+o1.marks);
        
    }
}
