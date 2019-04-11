//********************************************************************
//  PairOfDice.java       Author: Alex Hapgood
//
//  Represents two dice with faces showing values
//  between 1 and 6 for both.
//********************************************************************
import javafx.scene.image.Image;

public class PairOfDice 
{
	private Die die1; // instantiating die1 object of Die class
	private Die die2; // instantiating die2 object of Die class
	
	//-----------------------------------------------------------------
	//constructor- initializes die1 and die2 by calling Die() constructor
	//-----------------------------------------------------------------
	public PairOfDice() 
	{
		die1 = new Die();
		die2 = new Die();
	}
	
	//-----------------------------------------------------------------
	//(accessor) gets the current face value of die1
	//-----------------------------------------------------------------
	public int getDie1() 
	{
		return die1.getFaceValue();
	}
	
	//-----------------------------------------------------------------
	//(accessor) gets the current face value of die2
	//-----------------------------------------------------------------
	public int getDie2() 
	{
		return die2.getFaceValue();
	}
	
	//-----------------------------------------------------------------
	//mutate face value of die1. @val is integer for new face value
	//-----------------------------------------------------------------
	public void setDie1(int val) 
	{
		die1.setFaceValue(val);
	}
	
	//-----------------------------------------------------------------
	//mutate face value of die2. @val is integer for new face value
	//-----------------------------------------------------------------
	public void setDie2(int val) 
	{
		die2.setFaceValue(val);
	}
	
	//-----------------------------------------------------------------
	//rolls both die1 and die2 using Die.roll() method and returns sum 
	//of face values post-roll.
	//-----------------------------------------------------------------
	public int roll() 
	{
		return die1.roll() + die2.roll();
	}
	
	//-----------------------------------------------------------------
	//returns a string representation of the pair of dice.
	//-----------------------------------------------------------------
	public String toString() 
	{
		return "die1: " + die1.getFaceValue() + " die2: " + die2.getFaceValue()
		+ " sum: " + Integer.toString(die1.getFaceValue() + die2.getFaceValue());
	}
	
	//
	//
	//
	public Image getDie1Image() 
	{
		return die1.getDieImage();
	}
	
	//
	//
	//
	public Image getDie2Image() 
	{
		return die2.getDieImage();
	}
}