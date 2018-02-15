package card.minion;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete object Minion RecrueDeLaMainDArgent
 *
 */
public class RecrueDeLaMainDArgent extends Minion {
	
	 /**
	 * RecrueDeLaMainDArgent constructor
	 */
	public RecrueDeLaMainDArgent() {
		super("RecrueDeLaMainDArgent", 1, 1, 0);
	}

	/**
	* @return a new RecrueDeLaMainDArgent
	*/
	public static Minion createRecrueDeLaMainDArgent(){
		return new RecrueDeLaMainDArgent();
	}

}
