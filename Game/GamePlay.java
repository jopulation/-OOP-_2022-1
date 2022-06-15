public class GamePlay {
    public static void main(String[] args) {
        GameCharacter player, monster;

        player = new GameCharacter("Foobar the Warrior");
        monster = new GameCharacter("Slime the Great");

        int round = 1;

        System.out.println("###############");
        System.out.println("### Game starts");
        System.out.println("###############");
        System.out.println();

        while(true) {
            System.out.println("### round "+ round);

            player.printStatus();
            monster.printStatus();

            /* player attacks monster */
            int damage = player.attack(monster);
            System.out.println(player.getName() + " attacks " + monster.getName());
            System.out.println(monster.getName() + " gets damage of " + damage);

            if(monster.isDead() == true) {
                System.out.println(player.getName() + " killed " + monster.getName() + "!");
                break;
            }

            /* monster attacks player */
            damage = player.attack(player);
            System.out.println(monster.getName() + " attacks " + player.getName());
            System.out.println(player.getName() + " gets damage of " + damage);

            if(player.isDead() == true) {
                System.out.println(monster.getName() + " killed " + player.getName() +"!");
                break;
            }
            round = round + 1;
            System.out.println();
        }
        System.out.println("### Game over at round " + round);
    }
}
