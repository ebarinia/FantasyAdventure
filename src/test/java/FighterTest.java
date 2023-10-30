import Enemies.Enemy;
import Enemies.Orc;
import Enemies.Troll;
import Players.Barbarian;
import Players.Knight;
import Weapons.Axe;
import Weapons.IWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Enemy enemy;
    Knight knight;
    Barbarian barbarian;
    IWeapon sword;
    IWeapon axe;
    Orc orc;

    @Before
    public void before(){
        enemy = new Orc(100);
        sword = new Sword();
        axe = new Axe();
        knight = new Knight("Guustave", 300, sword);
        barbarian = new Barbarian("Ada", 320, axe);
    }

    @Test
    public void canDamageWithKnight(){
        knight.attack(enemy);
        assertEquals(80, enemy.getHealthPoints());
    }

    @Test
    public void canDamageWithBarbarian(){
        barbarian.attack(enemy);
        assertEquals(70, enemy.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        knight.setWeapon(axe);
        knight.attack(enemy);
        assertEquals(70, enemy.getHealthPoints());
    }

    @Test
    public void canReceiveDamageFromEnemy(){
        orc = new Orc(100);
        orc.attack(knight);
        assertEquals(260, knight.getHealthPoint());
    }

}
