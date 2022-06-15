public class GameCharacter {
    private String name;

    private int healthPoint;
    private int strength;

    private GamePlay game;

    /* Constructors */
    public GameCharacter(String characterName) {
        name = characterName;
        healthPoint = 50;
        strength = 50;
    }

    /* Method */

    public void printStatus() {
        System.out.println("Name: "+ name);
        System.out.println("Health point: " + healthPoint);
        System.out.println("Strength: " + strength);
    }

    public int attack(GameCharacter opponent) {
        int damage = game.generateAttackHitPoint(strength);

        opponent.setHealthPoint(opponent.getHealthPoint() - damage);

        return damage;
    }
    public boolean isDead() {
        return (healthPoint <= 0);
    }
    /* getters and setters */

    public String getName() {
        return name;
    }

    public void setName(String updateName) {
        name = updateName;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public GamePlay getGame() {
        return game;
    }

    public void setGame(GamePlay g) {
        game = g;
    }
}
