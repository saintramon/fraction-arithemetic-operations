/**
 * FRACTION CLASS
 *
 * This is a reference class for a mathematical FRACTION, in which it contains the necessary attributes of a fraction such as the numerator and the denominator.
 * This class also contains the available arithmetic operations that can be performed within 2 Fractions.
 * */
package prog2.prelimgroup;

import prog2.midgroup01.MixedFraction;

public class Fraction {

    private int numerator;
    private int denominator;


    /**
     * Constructs a fraction with 0 as numerator and 0 as denominator
     * */
    public Fraction(){
        this.numerator = 0;
        this.denominator = 0;
    }

    /**
     * Constructs a fraction with numerator assigned to numerator, and denominator assigned to denominator
     * */
    public Fraction( int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Returns the numerator of the fraction
     * */
    public int getNumerator(){
        return numerator;
    }

    /**
     * Returns the denominator of the fraction
     * */
    public int getDenominator(){
        return denominator;
    }


    /**
     * Sets the numerator of the fraction
     * */
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    /**
     * Sets the denominator of the fraction
     * */
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    /**
     * Computes the Greatest Common Divisor(GCD) using Euclid's algorithm
     * */
    public int computeGCD(int firstNum, int secondNum){
        if (firstNum == 0)
            return secondNum;

        return computeGCD(secondNum % firstNum, firstNum);
    }

    /**
     * Returns a string showing the fraction
     * */
    public String toString(){
        return this.numerator + " / " + this.denominator;
    }

    /**
     * Returns the double value of the  fraction
     * */
    public double toDouble(){
        return (double) this.numerator / this.denominator;
    }


    /**
     * Method that adds the two fractions
     * */
    public Fraction add(Fraction fraction){

        int numAnswer = 0;
        int denAnswer = 0;

        denAnswer = (computeGCD(this.denominator, fraction.getDenominator()));

        denAnswer = (this.denominator * fraction.getDenominator()) / denAnswer;

        numAnswer  = ((this.numerator) * (denAnswer/this.denominator)) + (fraction.getNumerator() * (denAnswer / fraction.getDenominator()));

        Fraction additionAnswer = new Fraction(numAnswer, denAnswer);

        return additionAnswer;
    }

    /**
     * Method that subtracts the two fractions
     * */
    public Fraction subtract(Fraction fraction){

        int denAnswer = 0;
        int numAnswer = 0;

        denAnswer = (computeGCD(this.denominator, fraction.getDenominator()));

        denAnswer = (this.denominator * fraction.getDenominator()) / denAnswer;

        numAnswer  = ((this.numerator) * (denAnswer/this.denominator)) - (fraction.getNumerator() * (denAnswer / fraction.getDenominator()));

        Fraction subtractionAnswer = new Fraction(numAnswer, denAnswer);

        return subtractionAnswer;
    }

    /**
     * Method that multiplies the two fractions
     * */
    public Fraction multiplyBy(Fraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        numAnswer = (this.numerator * fraction.getNumerator());
        denAnswer = (this.denominator * fraction.getDenominator());

        Fraction multiplicationAnswer = new Fraction(numAnswer, denAnswer);

        return multiplicationAnswer;
    }

    /**
     * Method that divides the two fractions
     * */
    public Fraction divideBy(Fraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        numAnswer = (this.numerator * fraction.getDenominator());
        denAnswer = (this.denominator * fraction.getNumerator());

        Fraction divisionAnswer = new Fraction(numAnswer, denAnswer);

        return divisionAnswer;
    }


    /**
     * Reduces a fraction into its lowest form
     * */
    public Fraction reduceFraction(){
        int GCD = 0;

        GCD = computeGCD(this.numerator, this.denominator);

        Fraction reducedFraction = new Fraction((this.numerator / GCD), (this.denominator / GCD));

        return reducedFraction;
    }

    public MixedFraction toMixed(){

        Fraction reduced = this.reduceFraction();

        int numAnswer = reduced.getNumerator() % reduced.getDenominator();
        int denAnswer = reduced.getDenominator();
        int wholeNum = reduced.getNumerator() / reduced.getDenominator();

        MixedFraction mixedAnswer = new MixedFraction(numAnswer, denAnswer, wholeNum);

        return mixedAnswer;
    }
}
