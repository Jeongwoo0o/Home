package i_inherit3;

public class Main {
    public static void main(String[] args) {
        Item[] i = method();
        for(int j = 0; j < i.length; j++){
            i[j].output();  // * 다형성
        }
    }

    static Item[] method() {
        Book b = new Book("0", "가", "나", "다");
        Dvd d = new Dvd("1", "A", "B", "C");
        Cd c = new Cd("2", "ㄱ", "ㄴ");

        Item[] i = new Item[3];
        i[0] = b;
        i[1] = d;
        i[2] = c;
        return i;
    }
}
