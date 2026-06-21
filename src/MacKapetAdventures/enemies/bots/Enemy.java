package MacKapetAdventures.enemies.bots;

import MacKapetAdventures.character.Character;

public abstract class Enemy extends Character {
    public Enemy(String name, int hp, int mp, int attack) {
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

//TODO Make Enemy abstract class
