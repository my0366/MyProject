package Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player p1 = new Player();
        Monster m1 = new Monster();
        int num;
        System.out.println("어서오세요");
        System.out.println("이름 : " + p1.name);

        System.out.println("1. 전투 / 2. 회피 ");
        num = sc.nextInt();
        if (num == 1) {
            for (int i = 0; i < 100 ; i ++){
                System.out.println("턴 진행 (리턴 입력)");
                sc.nextLine();
                if (p1.isLive) {
                    p1.checkHP();
                }
                if (m1.isLive) {
                    m1.checkHP();
                    int damage;
                    damage = m1.attack();
                    System.out.println(m1.commonMob + "가 공격력 " + damage + "으로 공격합니다.");
                    System.out.println(p1.name +"의 남은 체력 : " + p1.hp);
                    System.out.println(m1.commonMob +"의 남은 체력 : " + m1.hp);
                    if (m1.isLive) {
                        m1.hp = m1.hp - p1.atkDefault;
                    }
                    if (p1.isLive) {
                        p1.hp = p1.hp - m1.damage;
                    }
                } else {
                    System.out.println(m1.commonMob + "를 처치했습니다.");
                    p1.money += 100;
                    System.out.println(p1.money);
                    System.out.println("게임 종료");
                }
            }
        } else {
            System.out.println("게임 종료");
        }
    }
}
