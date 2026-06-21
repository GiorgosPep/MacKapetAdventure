package MacKapetAdventures.character;

import MacKapetAdventures.enemies.bots.Enemy;
import MacKapetAdventures.universe.IActions;

public abstract class Character implements IActions {

    protected String name;
    protected int hp;
    protected int mp;
    protected int attack;

    public Character(String name, int hp, int mp, int attack) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
    }

    public void attack(Enemy enemy) {
        enemy.hp -= attack;
        System.out.println(name + " attacks " + enemy.name);
    }

    public boolean isAlive() {
        return hp > 0;
    }
}