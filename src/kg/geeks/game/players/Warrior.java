package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(5) + 2;
        boss.setHealth(boss.getHealth() - coeff * this.getDamage());
        System.out.println("Warrior " + this.getName()
                + " hits critically " + coeff * this.getDamage());
    }
}
