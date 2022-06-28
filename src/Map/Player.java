package Map;

import java.util.Random;
import java.util.Scanner;
public class Player {
    Random r = new Random();
    Scanner s = new Scanner(System.in);

    public String name = "플레이어 1";
    public int hp = 100;
    public int money = 50;
    boolean isLive = true;
    public int atkDefault = 15;

    public int attack() {
        return this.atkDefault + r.nextInt(atkDefault);
    }

    public void checkHP() {
        if (this.hp < 1) {
            System.out.println(this.name + "이 죽었습니다.");
            this.isLive = false;
            this.hp = 0;
        } else {
            System.out.println(this.name +" 님의 남은 체력 : " + this.hp);
        }
    }
}
