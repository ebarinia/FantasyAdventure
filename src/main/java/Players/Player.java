package Players;

public abstract class Player {

    private String name;
    private int healthPoints;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoints;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoints = healthPoint;
    }

    public void damageTaken(int value){
        this.healthPoints -= value;
    }

    public void healReceived(int value){
        this.healthPoints += value;
    }

}
