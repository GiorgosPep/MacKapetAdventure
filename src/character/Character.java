package character;

public abstract class Character {

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

    public void attack(Character target) {
        target.hp -= attack;
        System.out.println(name + " attacks " + target.name);
    }

    public boolean isAlive() {
        return hp > 0;
    }
}