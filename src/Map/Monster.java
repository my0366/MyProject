package Map;

public class Monster {
    String commonMob = "몬스터 1";
    int hp = 100;
    boolean isLive = true;
    int damage = 3;

    public int attack() {
        return this.damage;
    }

    public void checkHP() {
        if (this.hp < 1) {
            System.out.println(this.commonMob + "이(가) 죽었습니다.");
            this.isLive = false;
            this.hp = 0;	// 사망시 HP 마이너스 된 값 0으로 보정.
        }
    }
}
