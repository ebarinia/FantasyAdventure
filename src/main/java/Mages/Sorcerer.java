package Mages;

import Defense.IDefend;
import Spells.ISpell;

public class Sorcerer extends Mage{
    public Sorcerer(String name, int healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints, defender, spell);
    }
}
