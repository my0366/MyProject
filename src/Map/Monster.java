package Map;

import java.util.Random;
public abstract class Monster {
    Random r = new Random();
    String MobName = "";
    int hp = 100;
    boolean isLive = true;
    int damage = 3;

    public abstract int attack() ;

    public abstract void checkHP();
}
