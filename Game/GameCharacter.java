public class GameCharacter {
    private String name;

    private int healthPoint;
    private int strength;

    /* Constructors */
    public GameCharacter(String characterName) {
        name = characterName;
        healthPoint = 50;
        strength = 50;
    }

    /* Method */

    public void printStatus() {
        System.out.println("# Character information: ");
        System.out.println("Name: "+ name);
        System.out.println("Health point: " + healthPoint);
        System.out.println("Strength: " + strength);
        System.out.println();
    }
    private int randomGenerator(int size) {
        return (int)(Math.random() * (size+1));
    }
    private int generateAttackHitPoint() {
        return randomGenerator(strength);
    }
    public int attack(GameCharacter enemy) {
        int hitPoint = generateAttackHitPoint();
        enemy.setHealthPoint(enemy.getHealthPoint() - hitPoint);
        return hitPoint;
    }
    public boolean isDead() {
        return (healthPoint <= 0);
    }
    /* getters and setters */

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getStrength() {
        return strength;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}
