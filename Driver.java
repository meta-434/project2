//********************************************************************
//  Driver.java       Author: Alex Hapgood
//
//  tests all methods of the PairOfDice class.
//********************************************************************
public class Driver 
{
	public static void main(String[] args) 
		{
		PairOfDice testPair = new PairOfDice(); //Instantiate and assign new PairOfDice named testPair
		
		System.out.print("die1 should be 1, is: " + testPair.getDie1()); //tests the PairOfDice.getDie1()
		System.out.println(". die2 should be 1, is: " + testPair.getDie2()); //tests the PairOfDice.getDie2()
		
		testPair.setDie1(3); //tests the PairOfDice.setDie1(X)
		testPair.setDie2(4); //tests the PairOfDice.setDie2(X)
		System.out.print("die1 should be 3, is: " + testPair.getDie1());
		System.out.println(". die2 should be 4, is: " + testPair.getDie2());
		
		System.out.println("fresh roll sum is " + testPair.roll() + " = "
				+ testPair.getDie1() +" (die1) + "+ testPair.getDie2()+" (die2)"); //tests the PairOfDice.roll() method.
	
		System.out.println("current status: " + testPair.toString()); //tests the PairOfDice.toString() method
	}
}