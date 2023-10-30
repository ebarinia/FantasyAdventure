import Enemies.Enemy;
import Enemies.Orc;
import Enemies.Troll;
import Weapons.Axe;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponsTest {

    Enemy enemy;
    Axe axe;
    Sword sword;

    @Before
    public void before() {
        axe = new Axe();
        sword = new Sword();
    }

    @Test
    public void canDamageWithAxe(){
        enemy = new Orc(100);
        axe.attack(enemy);
        assertEquals(70, enemy.getHealthPoints());
    }

    @Test
    public void canDamageWithSword(){
        enemy = new Troll(80);
        sword.attack(enemy);
        assertEquals(60, enemy.getHealthPoints());
    }

}
