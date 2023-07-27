package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Samurai extends Hero {
    public Samurai(int health, int damage, String name) {
        super(health, damage, SuperAbility.SURIKENS, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean suriken = RPG_Game.random.nextBoolean();
        if(suriken){
            boss.setHealth(boss.getHealth() + 70);
            System.out.println("Samurai used good surikens");
        }else{
            boss.setHealth(boss.getHealth() - 50);
            System.out.println("Samurai used bad surikens");
        }
    }
}
