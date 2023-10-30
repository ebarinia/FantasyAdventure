import Enemies.Enemy;
import Enemies.Orc;
import Enemies.Troll;
import Heal.Cleric;
import Players.Knight;
import Weapons.IWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Knight knight;
    Cleric cleric;
    IWeapon sword;
    Enemy enemy;

    @Before
    public void before(){
        enemy = new Orc(100);
        sword = new Sword();
        knight = new Knight("LeRelou", 300, sword);
        cleric = new Cleric("LaMeuf", 220);
    }

    @Test
    public void canTakeDamage(){
        enemy.attack(knight);
        enemy.attack(knight);
        assertEquals(220, knight.getHealthPoint());
    }

    @Test
    public void canHeal(){
        enemy = new Troll(80);
        enemy.attack(knight);
        enemy.attack(knight);
        cleric.heal(knight);
        assertEquals(250, knight.getHealthPoint());
    }
}
