package Spells;

import Enemies.Enemy;

public class Blizzard implements ISpell{

    @Override
    public void cast(Enemy enemy) {
        enemy.damageTaken(50);
    }
}
