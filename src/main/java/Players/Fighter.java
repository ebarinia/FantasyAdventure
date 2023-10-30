package Players;

import Enemies.Enemy;
import Weapons.IWeapon;

public abstract class Fighter extends Player{

    private IWeapon weapon;

    public Fighter(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void attack(Enemy enemy){
        this.weapon.attack(enemy);
    }
}
