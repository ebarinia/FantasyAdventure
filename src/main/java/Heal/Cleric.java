package Heal;

import Players.Player;

public class Cleric extends Player implements IHeal{

    public Cleric(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public void heal(Player player) {
        player.healReceived(50);
    }
}
