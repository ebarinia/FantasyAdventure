package Spells;

import Enemies.Enemy;

public class Fireball implements ISpell{

    @Override
    public void cast(Enemy enemy) {
        enemy.damageTaken(40);
    }
}
