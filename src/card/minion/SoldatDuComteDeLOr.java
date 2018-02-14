package card.minion;

import card.minion.decorator.MinionTauntDecorator;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete object Minion SoldatDuComteDeLOr
 *
 */

public class SoldatDuComteDeLOr extends Minion {

	 /**
	 * SoldatDuComteDeLOr constructor
	 */
	public SoldatDuComteDeLOr() {
		super("SoldatDuComteDeLOr", 1, 2, 1);
	}

	/**
	* @return a new SoldatDuComteDeLOr
	*/
  public static Minion createSoldatDuComteDeLOr(){
	  return new MinionTauntDecorator(new SoldatDuComteDeLOr());
  }

}
