class Num {
    protected int number;
    public Num(int number) {
        this.number = number;
    }
    public void shownum() {
        System.out.println("Number in decimal: " + number);
    }
}
class HexNum extends Num {
    public HexNum(int number) {
        super(number); 
    }
    @Override
    public void shownum() {
        System.out.println("Number in decimal: " + number);
        System.out.println("Number in hexadecimal: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Number in octal: " + Integer.toOctalString(number));
    }
}
public class NumTest {
    public static void main(String[] args) {
        Num num = new Num(255);
        System.out.println("Base class output:");
        num.shownum();
        System.out.println();
        HexNum hexNum = new HexNum(255);
        System.out.println("Derived class output:");
        hexNum.shownum();
    }
}
