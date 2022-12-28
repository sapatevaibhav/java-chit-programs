import java.text.DecimalFormat;
//import not necessary if you don't want to format the value at the end of main class
//~Identify commonalities and differences between Publication, Book and Magazine classes. Title, Price, Copies are common instance variables and saleCopy is common method. The differences are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue, receiveissue().Write a program to find how many copies of the given books are ordered and display total sale of publication

class Publication {
    String title;
    double price;
    int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public int saleCopy() {
        if (copies > 0) {
            copies--;
            return 1;
        }
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getCopies() {
        return copies;
    }
}

class Book extends Publication {
    String author;

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    public int orderCopies(int numCopies) {
        copies += numCopies;
        return numCopies;
    }
}

class Magazine extends Publication {
    int currentIssue;

    public Magazine(String title, double price, int copies, int currentIssue) {
        super(title, price, copies);
        this.currentIssue = currentIssue;
    }

    public int orderQty(int numCopies) {
        copies += numCopies;
        return numCopies;
    }

    public int receiveIssue(int issueNumber) {
        currentIssue = issueNumber;
        return issueNumber;
    }
}

public class chit2 {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1", 10.99, 50, "Author 1");
        Book book2 = new Book("Book 2", 12.99, 40, "Author 2");
        Magazine magazine1 = new Magazine("Magazine 1", 5.99, 100, 1);
        Magazine magazine2 = new Magazine("Magazine 2", 6.99, 200, 2);

        int numBook1Orders = book1.orderCopies(10);
        int numBook2Orders = book2.orderCopies(20);
        int numMagazine1Orders = magazine1.orderQty(30);
        int numMagazine2Orders = magazine2.orderQty(40);

        double totalSales = (numBook1Orders * book1.getPrice()) + (numBook2Orders * book2.getPrice()) +
                (numMagazine1Orders * magazine1.getPrice()) + (numMagazine2Orders * magazine2.getPrice());

        DecimalFormat df = new DecimalFormat("#.00");
        String roundedValue = df.format(totalSales);
        System.out.println("Total sales: ₹ " + roundedValue);
    }
}
