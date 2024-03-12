package i_inherit2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Item i = null;

        Scanner input = new Scanner(System.in);
        System.out.print("상품(1.책 2.DVD 3.CD) -> ");
        int sel = input.nextInt();

        switch(sel) {
            case 1: i = new Book(); break;
            case 2: i = new Dvd(); break;
            case 3: i = new Cd(); break;
        }

        // 출력
        i.output(); // ***** 다형성
    }
}
