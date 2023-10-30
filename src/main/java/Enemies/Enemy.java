package Enemies;

public abstract class Enemy implements IEnemyAttack {

    private int healthPoints;

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void damageTaken(int value){
        this.healthPoints -= value;
    }

}
