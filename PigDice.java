
public class PigDice extends PairOfDice {
	
	
	public PigDice() {
		
	}
	
	public int roll() {
		return super.roll();
	}
	
	public String toString() {
		if (super.getDie1() != 1 && super.getDie2() != 1) {
			return Integer.toString(super.roll());
		} else if ((super.getDie1() == 1 && super.getDie2() != 1) || (super.getDie1() != 1 && super.getDie2() == 1)) {
			return "0";
		} else {
			return "LOSE!";
		}
	}
}
