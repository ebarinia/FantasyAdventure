import Defense.Dragon;
import Defense.IDefend;
import Defense.Ogre;
import Enemies.Enemy;
import Enemies.Orc;
import Mages.Mage;
import Mages.Sorcerer;
import Spells.Blizzard;
import Spells.Fireball;
import Spells.ISpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MageTest {

    Enemy enemy;
    Mage mage;
    Sorcerer sorcerer;
    IDefend dragon;
    IDefend ogre;
    ISpell fireball;
    ISpell blizzard;

    @Before
    public void before(){
        enemy = new Orc(100);
        dragon = new Dragon();
        ogre = new Ogre();
        fireball = new Fireball();
        blizzard = new Blizzard();
        mage = new Mage("LeSalopard", 250, ogre, fireball);
        sorcerer = new Sorcerer("LeBandit", 230, dragon, blizzard);
    }

    @Test
    public void canCastSpell(){
        mage.cast(enemy);
        assertEquals(60, enemy.getHealthPoints());
    }

    @Test
    public void canChangeSpell(){
        mage.setSpell(blizzard);
        mage.cast(enemy);
        assertEquals(50, enemy.getHealthPoints());
    }

    @Test
    public void canSummonOgre(){
        mage.defend(enemy);
        assertEquals(70, enemy.getHealthPoints());
    }

    @Test
    public void canSummonDragon(){
        sorcerer.defend(enemy);
        assertEquals(30, enemy.getHealthPoints());
    }
}
