package Defense;

import Defense.IDefend;
import Enemies.Enemy;

public class Ogre implements IDefend {

    private int damageValue;

    public Ogre() {
        this.damageValue = 30;
    }

    @Override
    public void defend(Enemy enemy) {
        enemy.damageTaken(this.damageValue);
    }
}
