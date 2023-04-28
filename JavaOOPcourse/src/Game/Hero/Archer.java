package Game.Hero;

import Game.Weapon.Throwing;
import Game.Protection.Shields;

public class Archer extends Warrior<Throwing, Shields> {
    public Archer(String name, int hp, Throwing weapon, Shields shield) {
        super(name, hp, weapon, shield);
    }

    public int getRange(){
        return Warrior.rand.nextInt(weapon.getDistance()+1);
    }

    @Override
    public String toString() {
        return "Game.Hero.Archer{" +
                super.toString()+
                '}';
    }
}
