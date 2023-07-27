package kg.geeks.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, ability, name);
    }
    private int increaseDamage;

    public Magic(int health, int damage, int increaseDamage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
        this.increaseDamage = increaseDamage;
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero: heroes) {
            if(hero.getAbility() != SuperAbility.REHEAL) {
                hero.setDamage(hero.getDamage() + this.increaseDamage);
            }
        }
    }
}
