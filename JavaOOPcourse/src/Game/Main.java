package Game;

import Game.Hero.Archer;
import Game.Hero.Knight;
import Game.Protection.WoodenShield;
import Game.Weapon.Bow;
import Game.Weapon.Knife;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        archers.addPersons(new Archer("Robin", 100, new Bow(20), new WoodenShield(2)))
                .addPersons(new Archer("Bobin", 100, new Bow(15), new WoodenShield(2)));
        knights.addPersons(new Knight("John", 150, new Knife(), new WoodenShield(2)))
                .addPersons(new Knight("Adam", 150, new Knife(), new WoodenShield(2)));
        Archer archer1 = new Archer("Robin", 100, new Bow(20), new WoodenShield(2));
        Archer archer2 = new Archer("Bobin", 100, new Bow(15), new WoodenShield(2));
        Battle fight = new Battle(archer1, archer2);
        fight.run();
    }
}