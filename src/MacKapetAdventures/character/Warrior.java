package MacKapetAdventures.character;

import MacKapetAdventures.enemies.bots.Enemy;

public class Warrior extends Character{
    public Warrior(String name, int hp, int mp, int attack) {
        super(name, hp, mp, attack);
    }

    @Override
    public void attack(Enemy enemy) {
        super.attack(enemy);
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }
}
