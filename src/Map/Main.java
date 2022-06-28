package Map;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player p1 = new Player();
        Monster m1 = new Monster_Common();
        Monster m2 = new Monster_Unique();
        Random r = new Random();
        ArrayList<Monster> MonsterList = new ArrayList<>();

        int monsterCount;

        int num;
        MonsterList.add(new Monster_Common());
        MonsterList.add(new Monster_Unique());
        monsterCount = MonsterList.size();
        for (int i = 0; i < MonsterList.size(); i++) {
            System.out.println(MonsterList.get(i).MobName);
        }
        System.out.println("어서오세요");
        System.out.println("이름 : " + p1.name);
        while (monsterCount >= 0) {
            Monster newMob = MonsterList.get(monsterCount - 1);
            System.out.println(newMob.MobName);
            System.out.println("1. 전투 / 2. 회피 ");
            num = sc.nextInt();
            if (num == 1) {
                for (int i = 0; i < 100; i++) {
                    System.out.println("턴 진행 (리턴 입력)");
                    sc.nextLine();
                    if (newMob.MobName == "몬스터 1") {
                        if (p1.isLive) {
                            p1.checkHP();
                        }
                        if (newMob.isLive) {
                            newMob.checkHP();
                            int Mdamage = newMob.attack();
                            int Pdamage = p1.attack();
                            if (newMob.isLive) {
                                System.out.println(p1.name + "가 공격력 " + Pdamage + "으로 공격합니다.");
                                newMob.hp = newMob.hp - Pdamage;
                            }
                            if (p1.isLive) {
                                System.out.println(newMob.MobName + "가 공격력 " + Mdamage + "으로 공격합니다.");
                                p1.hp = p1.hp - Mdamage;
                            }
                        } else {
                            newMob.checkHP();
                            p1.money += 100;
                            System.out.println(p1.money);
                            monsterCount--;
                            break;
                        }
                    } else if (newMob.MobName == "몬스터 2") {
                        if (p1.isLive) {
                            p1.checkHP();
                        }
                        if (newMob.isLive) {
                            newMob.checkHP();
                            int Mdamage = newMob.attack();
                            int Pdamage = p1.attack();
                            if (newMob.isLive) {
                                System.out.println(p1.name + "가 공격력 " + Pdamage + "으로 공격합니다.");
                                newMob.hp = newMob.hp - Pdamage;
                            }
                            if (p1.isLive) {
                                System.out.println(newMob.MobName + "가 공격력 " + Mdamage + "으로 공격합니다.");
                                p1.hp = p1.hp - Mdamage;
                            }
                        } else {
                            newMob.checkHP();
                            p1.money += 100;
                            System.out.println(p1.money);
                            monsterCount--;
                            break;
                        }
                    }
                }
            } else if (num == 2) {
                System.out.println("회피로 간주해 체력이 감소합니다.");
                p1.hp -= 50;
                p1.checkHP();
                monsterCount--;
            } else {
                System.out.println("게임 클리어 ");
            }
        }

//        System.out.println("스테이지 2");
//        System.out.println("1. 전투 / 2. 회피 ");

    }
}
