package l_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex06_HashMap {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("javassem", "1111");
        map.put("kimssem", "1234");
        map.put("kimjava", "9999");
        map.put("kimbabo", "1234");
        map.put("javassem", "1234"); // 중복되면 기존 데이터를 덮어버림

        Scanner input = new Scanner(System.in);

        boolean stop = false;
        while (!stop) {
            System.out.println("아이디와 비밀번호 입력 : ");
            System.out.print("아이디 : ");
            String id = input.nextLine();
            System.out.print("비밀번호 : ");
            String pw = input.nextLine();

            // 1-1. 입력받은 아이디가 저장부분 key값에 있는지?
            if (map.containsKey(id)) {

                // 2-1. 해당 key값의 value값과 입력한 비밀번호가 같다면
                if ((map.get(id)).equals(pw)) {
                    System.out.println("로그인 성공!");
                    break;
                } else {
                    // 2-2. 비밀번호가 다르다면
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    continue;
                }
            } else {
                // 1-2. 입력받은 아이디가 저장 아이디에 없음
                System.out.println("존재하지 않는 아이디입니다.");
                continue;
            }
        }
    }
}
