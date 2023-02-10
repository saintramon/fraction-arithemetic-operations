/**
 * The reference class for the Fraction class
 * */
package prog2.prelimgroup;

public class Fraction {

    private int numerator;
    private int denominator;


    /**
     *
     * */
    public Fraction(){
        this.numerator = 0;
        this.denominator = 0;
    }

    //Sanchie
    public Fraction( int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Sanchie
    public int getNumerator(){
        return numerator;
    }
    //Sanchie
    public int getDenominator(){
        return denominator;
    }


    //Sanchie
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    //Sanchie
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    //Sanchie
    private int computeGCD(int firstNum, int secondNum){
        if (firstNum == 0)
            return secondNum;

        return computeGCD(secondNum % firstNum, firstNum);
    }

    //Sanchie
    public String toString(){
        return this.numerator + " / " + this.denominator;
    }
    //Sanchie
    public double toDouble(){
        return (double) this.numerator / this.denominator;
    }


    //Sanchie
    public Fraction add(Fraction fraction){

        int numAnswer = 0;
        int denAnswer = 0;

        denAnswer = (computeGCD(this.denominator, fraction.getDenominator()));

        denAnswer = (this.denominator * fraction.getDenominator()) / denAnswer;

        numAnswer  = ((this.numerator) * (denAnswer/this.denominator)) + (fraction.getNumerator() * (denAnswer / fraction.getDenominator()));

        Fraction additionAnswer = new Fraction(numAnswer, denAnswer);

        return additionAnswer;
    }
    //Sanchie
    public Fraction subtract(Fraction fraction){

        int denAnswer = 0;
        int numAnswer = 0;

        denAnswer = (computeGCD(this.denominator, fraction.getDenominator()));

        denAnswer = (this.denominator * fraction.getDenominator()) / denAnswer;

        numAnswer  = ((this.numerator) * (denAnswer/this.denominator)) - (fraction.getNumerator() * (denAnswer / fraction.getDenominator()));

        Fraction subtractionAnswer = new Fraction(numAnswer, denAnswer);

        return subtractionAnswer;
    }
    //Sanchie
    public Fraction multiplyBy(Fraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        numAnswer = (this.numerator * fraction.getNumerator());
        denAnswer = (this.denominator * fraction.getDenominator());

        Fraction multiplicationAnswer = new Fraction(numAnswer, denAnswer);

        return multiplicationAnswer;
    }
    //Sanchie
    public Fraction divideBy(Fraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        numAnswer = (this.numerator * fraction.getDenominator());
        denAnswer = (this.denominator * fraction.getNumerator());

        Fraction divisionAnswer = new Fraction(numAnswer, denAnswer);

        return divisionAnswer;
    }


    //Sanchie
    public Fraction reduceFraction(){
        int GCD = 0;

        GCD = computeGCD(this.numerator, this.denominator);

        Fraction reducedFraction = new Fraction((this.numerator / GCD), (this.denominator / GCD));

        return reducedFraction;
    }
}
