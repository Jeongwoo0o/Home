package i_inherit2;

import java.util.Scanner;

public class Imsi {
    public static void main(String[] args) {
        
        Book b = null;
        Dvd d = null;
        Cd c = null;

        Scanner in = new Scanner(System.in);
        System.out.print("상품(1.책 2.DVD 3.CD) -> ");
        int sel = in.nextInt();

        switch(sel) {
            case 1: b = new Book(); break;
            case 2: d = new Dvd(); break;
            case 3: c = new Cd(); break;
        }

        // 출력
        switch(sel) {
            case 1: b.output(); break;
            case 2: d.output(); break;
            case 3: c.output(); break;
        }
    }
}
