package MacKapetAdventures.universe;

import MacKapetAdventures.character.Character;
import MacKapetAdventures.enemies.bots.Enemy;

public interface IActions {
    void attack(Enemy enemy);
    boolean isAlive();
//    void search();
//    boolean levelup();
//    void getXP();
}
