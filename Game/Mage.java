public class Mage extends GameCharacter{
    private int magicPoint;

    public Mage(String name) {
        super(name);
        magicPoint = 50;
    }

    public void printStatus() {
        super.printStatus();
        System.out.println("Magic Point: " + getMagicPoint());
    }

    public int castSpell(GameCharacter opponent) {
        int damage;
        GamePlay g = getGame();
        damage = g.generateAttackHitPoint(getMagicPoint());

        opponent.setHealthPoint(opponent.getHealthPoint() - damage);
        return damage;
    }

    /* getter and setters */

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int updateMagicPoint) {
        magicPoint = updateMagicPoint;
    }

    public static void main(String[] args) {
        GameCharacter g = new GameCharacter("For Testing");
        Mage mage = new Mage("Mage the Magician");

        g.printStatus();
        System.out.println();
        mage.printStatus();
        System.out.println();
        System.out.println(mage);
    }
}
