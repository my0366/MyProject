package Map;

import java.util.Random;
public class Monster_Common extends Monster{
    Random r = new Random();
    public Monster_Common() {
        this.MobName = "몬스터 1";
        this.hp = 100;
        this.damage = 3;
    }

    public String toString() {
        return "야생의 " + this.MobName + "가 나타났다!";
    }
    @Override
    public int attack() {
        return this.damage + r.nextInt(damage);
    }

    @Override
    public void checkHP() {
        if (this.hp < 1) {
            System.out.println(this.MobName + "이(가) 죽었습니다.");
            this.isLive = false;
            this.hp = 0;
        } else {
            System.out.println(this.MobName + "님의 남은 체력 : " + this.hp);
        }
    }
}
