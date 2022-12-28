//~Create a class Student having abstract member functions to get name, SSC marks, HSC marks, create 3 classes Harish, Jayant and Vijay who extend Student class and implement the abstract methods and print the student details.

abstract class Student {
    // abstract method to get the name of the student
    public abstract String getName();

    // abstract method to get the SSC marks of the student
    public abstract int getSSCmarks();

    // abstract method to get the HSC marks of the student
    public abstract int getHSCmarks();
}

class Harish extends Student {
    // implementation of the abstract methods
    public String getName() {
        return "Harish";
    }

    public int getSSCmarks() {
        return 85;
    }

    public int getHSCmarks() {
        return 90;
    }
}

class Jayant extends Student {
    // implementation of the abstract methods
    public String getName() {
        return "Jayant";
    }

    public int getSSCmarks() {
        return 80;
    }

    public int getHSCmarks() {
        return 95;
    }
}

class Vijay extends Student {
    // implementation of the abstract methods
    public String getName() {
        return "Vijay";
    }

    public int getSSCmarks() {
        return 75;
    }

    public int getHSCmarks() {
        return 88;
    }
}

public class chit22 {
    public static void main(String[] args) {
        Student harish = new Harish();
        Student jayant = new Jayant();
        Student vijay = new Vijay();

        System.out.println("Name: " + harish.getName() + ", SSC marks: " + harish.getSSCmarks() + ", HSC marks: "
                + harish.getHSCmarks());
        System.out.println("Name: " + jayant.getName() + ", SSC marks: " + jayant.getSSCmarks() + ", HSC marks: "
                + jayant.getHSCmarks());
        System.out.println("Name: " + vijay.getName() + ", SSC marks: " + vijay.getSSCmarks() + ", HSC marks: "
                + vijay.getHSCmarks());
    }

}
