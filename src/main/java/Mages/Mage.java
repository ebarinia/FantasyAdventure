package Mages;

import Defense.IDefend;
import Enemies.Enemy;
import Players.Player;
import Spells.ISpell;

public class Mage extends Player implements IDefend {

    private IDefend defender;
    private ISpell spell;

    public Mage(String name, int healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints);
        this.defender = defender;
        this.spell = spell;
    }

    public void setDefender(IDefend defender) {
        this.defender = defender;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void defend(Enemy enemy) {
        this.defender.defend(enemy);
    }

    public void cast(Enemy enemy) {
        this.spell.cast(enemy);
    }

}
