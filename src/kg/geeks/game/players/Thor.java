package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean thor = RPG_Game.randomm.nextBoolean();
        if(thor){
            for (Hero hero: heroes) {
                hero.setHealth(hero.getHealth() + 30);
            }
            System.out.println("Thor stunned BOSS");
        }
    }
}
