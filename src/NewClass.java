import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        //전역변수
        String name;
        int choice;
        int health = 100;
        int monster = 50;
        int weaponChoice;
        String[] weapon = {"폭탄", "칼"};

        //이름 설정
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        name = sc.next();
        System.out.println("이름 : " + name);

        // 스토리
        System.out.println("도라에몽이 여행을 떠난다..");
        System.out.println("가다가 퉁퉁이를 만났다.");
        System.out.println("1. 싸운다 / 2. 도망간다 / 3.웅크리기");
        choice = sc.nextInt();
        if (choice == 1) {
            for(int i = 0 ;i < 10; i ++) {
                monster -= 5;
                System.out.println("퉁퉁이 체력 : " + monster);
            }
            System.out.println("승리");
        } else if (choice == 2) {
            System.out.println(Arrays.toString(weapon));
            System.out.println("1. 폭탄 / 2. 칼");
            weaponChoice = sc.nextInt();
            if (weaponChoice == 1) {
                System.out.println("폭탄를 사용 합니다");
                health = 0;
                monster = 0;
                System.out.println("나의 체력 : " + health);
                System.out.println("퉁퉁이 체력 : " + monster);
                System.out.println("실패");
            } else if (weaponChoice == 2) {
                System.out.println("칼을 사용합니다");
                monster = 0;
                System.out.println("나의 체력 : " + health);
                System.out.println("퉁퉁이 체력 : " + monster);
                System.out.println("성공");
            }
        } else if (choice == 3) {
            System.out.println("방어 합니다");
            for(int i = 0 ;i < 20; i ++) {
                health -= 5;
                System.out.println("나의 체력 : " + health);
            }
            System.out.println("방어만 하다 사망");
        }
    }
}
