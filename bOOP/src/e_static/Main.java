package e_static;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        System.out.println("책 개수 : " + b1.count);
        System.out.println("책 개수 : " + b2.count);
        System.out.println("책 개수 : " + b3.count);
    }
}
