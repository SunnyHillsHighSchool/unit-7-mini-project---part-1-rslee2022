//Mini-Project part 1
//Programmer - Rachel Lee

import java.util.ArrayList;

public class Loan
{
  //instance variables
  private int ID; //loan ID number
  private double loanAmount; //value of the loan
  private String country; //country the loan is from
  private int daysToFund; //number of days it took to fund the loan
  private int numLenders; //number of lenders for the loan

  //constructor
  public Loan(int ID, double loanAmount, String country, int daysToFund, int numLenders)
  {
    //intialize private instance variables
    this.ID = ID;
    this.loanAmount = loanAmount;
    this.country = country;
    this.daysToFund = daysToFund;
    this.numLenders = numLenders;
  }

  //accessor methods
  public int getID()
  {
    return ID;
  }

  public double getLoanAmount()
  {
    return loanAmount;
  }

  public String getCountry()
  {
    return country;
  }

  public int getDaysToFund()
  {
    return daysToFund;
  }

  public int getNumLenders()
  {
    return numLenders;
  }

  public String toString()
  {
    return "ID: " + ID + " loan amount: " + loanAmount + " country: " + country + " days to fund: " + daysToFund + " num lenders: " + numLenders;
  }

  //modifier methods
  public void setID(int ID)
  {
    this.ID = ID;
  }

  public void setLoanAmount(double loanAmount)
  {
    this.loanAmount = loanAmount;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public void setDaysToFund(int daysToFund)
  {
    this.daysToFund = daysToFund;
  }

  public void setNumLenders(int numLenders)
  {
    this.numLenders = numLenders;
  }
}