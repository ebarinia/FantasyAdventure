package Mages;

import Defense.IDefend;
import Spells.ISpell;

public class Wizzard extends Mage{
    public Wizzard(String name, int healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints, defender, spell);
    }
}
