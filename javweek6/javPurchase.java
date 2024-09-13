import java.util.*;

class Book {
    private String Name;
    private String Author;

    void setName(String Name, String Author) {
        this.Name = Name;
        this.Author = Author;
    }

    void display() {
        System.out.printf("THE NAME OF THE BOOK IS %s%n", Name);
        System.out.printf("NAME OF THE AUTHOR IS %s%n", Author);
    }
}

class Mcgrahill extends Book {
    int price;

    public void setPrice(int price) {
        this.price = price;
    }

    void display() {
        super.display();
        System.out.printf("THE PRICE OF THE BOOK IS %d%n", price);
    }
}

class Oxford extends Book {
    int price;

    public void setPrice(int price) {
        this.price = price;
    }

    void display() {
        super.display();
        System.out.printf("THE PRICE OF THE BOOK IS %d%n", price);
    }
}

public class Purchase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String Name, Author;

        System.out.println("Enter the details for Mcgrahill:");
        Name = sc.nextLine();
        Author = sc.nextLine();
        int price = sc.nextInt();
        sc.nextLine(); // Consume newline

        Mcgrahill M = new Mcgrahill();
        M.setName(Name, Author);
        M.setPrice(price);
        M.display();

        System.out.println("Enter the details for Oxford:");
        Name = sc.nextLine();
        Author = sc.nextLine();
        int prices = sc.nextInt();

        Oxford O = new Oxford();
        O.setName(Name, Author);
        O.setPrice(prices);
        O.display();

        sc.close();
    }
}
