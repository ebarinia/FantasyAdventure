package Enemies;

import Players.Player;

public class Orc extends Enemy{

    public Orc(int healthPoints) {
        super(healthPoints);
    }

    @Override
    public void attack(Player player){
        player.damageTaken(40);
    }
}
