package MacKapetAdventures.enemies.bots;

import MacKapetAdventures.character.Character;

public class Goblin extends Enemy {
    public Goblin(String name, int hp, int mp, int attack) {
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
