package Weapons;

import Enemies.Enemy;

public class Sword implements IWeapon{

    @Override
    public void attack(Enemy enemy) {
        enemy.damageTaken(20);
    }
}
