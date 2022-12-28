/*Problem Statement:Design a class ‘Complex ‘with data members for real and imaginary part. Provide default and Parameterized constructors. Write a program to perform arithmetic operations of two complex numbers.
*/
public class chit1 {
    int real, image;

    public chit1(int r, int i) {
        this.real = r;
        this.image = i;
    }

    public void showC() {
        System.out.print(this.real + "+i" + this.image);
    }

    public static chit1 add(chit1 n1, chit1 n2) {
        chit1 res = new chit1(0, 0);
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }

    public static void main(String arg[]) {
        chit1 c1 = new chit1(5, 10);
        chit1 c2 = new chit1(13, 3);
        System.out.print("first Complex number: ");
        c1.showC();
        System.out.print("\nSecond Complex number: ");
        c2.showC();
        chit1 res = add(c1, c2);
        System.out.println("\nAddition is :");
        res.showC();
    }
}