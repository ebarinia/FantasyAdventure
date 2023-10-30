package Weapons;

import Enemies.Enemy;

public class Axe implements IWeapon{

    @Override
    public void attack(Enemy enemy) {
        enemy.damageTaken(30);
    }
}
