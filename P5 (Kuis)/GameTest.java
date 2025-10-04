public class GameTest {
    public static void main(String[] args) {
        Player kevin = new Player("Kevin", 120, 20, 5);
        Monster m1 = new Monster("Goblin", 80, 15, "Goblin");
        Monster m2 = new Monster("Dragon", 200, 30, "Dragon");
        BossMonster boss = new BossMonster("Overlord", 300, 40, "Demon");

        Character[] enemies = {m1, m2, boss};

        System.out.println("=== Battle Start ===");
        int turn = 1;

        while (kevin.isAlive() && anyAlive(enemies)) {
            System.out.println("\n-- Turn " + turn + " --");

            Character target = firstAlive(enemies);
            if (target != null) {
                kevin.attack(target);
                if (!target.isAlive()) {
                    System.out.println(target.getName() + " has been defeated!");
                }
            }

            if (!anyAlive(enemies)) break;

            for (Character enemy : enemies) {
                if (enemy.isAlive()) {
                    enemy.attack(kevin);
                    if (!kevin.isAlive()) break;
                }
            }

            if (kevin.isAlive() && kevin.getHealth() <= 30) {
                kevin.heal(40);
            }

            turn++;
        }

        System.out.println("\n=== Battle End ===");
        if (kevin.isAlive()) {
            System.out.println(kevin.getName() + " wins the battle!");
        } else {
            System.out.println(kevin.getName() + " was defeated. Better luck next time!");
        }
    }

    private static boolean anyAlive(Character[] arr) {
        for (Character c : arr) {
            if (c.isAlive()) return true;
        }
        return false;
    }

    private static Character firstAlive(Character[] arr) {
        for (Character c : arr) {
            if (c.isAlive()) return c;
        }
        return null;
    }
}
