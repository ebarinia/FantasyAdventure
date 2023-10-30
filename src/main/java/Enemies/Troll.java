package Enemies;

import Players.Player;

public class Troll extends Enemy{

    public Troll(int healthPoints) {
        super(healthPoints);
    }

    @Override
    public void attack(Player player){
        player.damageTaken(50);
    }
}
