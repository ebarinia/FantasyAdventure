package Defense;

import Enemies.Enemy;

public class Dragon implements IDefend{

    private int damageValue;

    public Dragon() {
        this.damageValue = 70;
    }

    @Override
    public void defend(Enemy enemy) {
        enemy.damageTaken(this.damageValue);
    }
}
