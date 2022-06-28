package Map;

import java.util.Random;
public class Monster_Unique extends Monster{
    Random r = new Random();

    public Monster_Unique() {
        this.MobName = "몬스터 2";
        this.hp = 130;
        this.damage = 13;
    }

    public String toString() {
        System.out.print(this.MobName);
        return super.toString();
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
