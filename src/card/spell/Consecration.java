package card.spell;

import card.minion.Minion;

import java.util.ArrayList;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete Spell object Consecration
 *
 */

public class Consecration extends Spell {

	/**
	 * 
	 *Consecration constructor
	 *
	 */
	public Consecration() {
		super("Consecration", 4);
	}

	/**
	 * 
	 *Override of the cast method of Spell
	 *Deal 2 damages to all the minions of the enemy board
	 *
	 */
	@Override
	public boolean cast() {
		 ArrayList<Minion> ennemy_minions = getPlayer().getEnnemy_player().getBoard().getMinions();

		 for (int i =0; i<ennemy_minions.size();i++){
			 Minion m = ennemy_minions.get(i);
			 boolean b = m.getHealth()<=2;
			 m.takeDamage(2);

			 if (b){
			 	i--;
			 }
		}
		 getPlayer().getEnnemy_player().getHero().takeDamage(2);
		 return true;
	}
}
