/**
 * This class will be the MixedFraction class which will inherit the Fraction class
 */


/**
 * COMMENTING CONVENTION
 *
 * @author Juan Dela Cruz
 * *Describe the block of code that you entered/changed*
 *
 * e.g.
 * @author Juan Dela Cruz
 * A Setter method which will set the value for the wholNum
 *
 */

package prog2.midgroup01;

import prog2.prelimgroup.Fraction;

public class MixedFraction extends Fraction {

    private int wholeNum;

    public MixedFraction(){
        super();
    }

    public MixedFraction(int numerator, int denominator, int wholeNum){
        setNumerator(numerator);
        setDenominator(denominator);
        this.wholeNum = wholeNum;
    }

    public MixedFraction(int numerator, int denominator){
        setNumerator(numerator);
        setDenominator(denominator);
        this.wholeNum = 0;
    }

    public MixedFraction(Fraction fraction){
        super(fraction.getNumerator(), fraction.getDenominator());
        this.wholeNum = 0;
    }

    public void setWholeNum(int wholeNum){
        this.wholeNum = wholeNum;
    }

    public int getWholeNum(){
        return this.wholeNum;
    }

    public double toDouble(){
        return (this.wholeNum + 1.0 * this.getNumerator() / this.getDenominator());
    }

    public String toString(){
        return (this.wholeNum + " " + super.getNumerator() + "/" + super.getDenominator());
    }

    public MixedFraction reciprocal(){
        var reciprocal = new MixedFraction();
        reciprocal.setNumerator(getDenominator());
        reciprocal.setDenominator(getNumerator());
        return reciprocal;
    }

    public Fraction toImproper(){

        int numAnswer = this.getWholeNum() * this.getDenominator() + this.getNumerator();
        int denAnswer = this.getDenominator();

        Fraction improperFraction = new Fraction(numAnswer, denAnswer);

        return improperFraction;
    }

    public MixedFraction add(MixedFraction mixed){

        Fraction imp1 = this.toImproper();
        Fraction imp2 = mixed.toImproper();

        int denAnswer = imp1.getDenominator() * imp2.getDenominator();
        int numAnswer = (imp1.getNumerator() * (denAnswer/imp1.getDenominator())) + (imp2.getNumerator() * (denAnswer/imp2.getDenominator()));

        Fraction initialAnswer = new Fraction(numAnswer, denAnswer);

        MixedFraction sumAnswer = initialAnswer.toMixed();

        return sumAnswer;
    }

    public MixedFraction add(Fraction fraction){
        Fraction imp1 = this.toImproper();
        Fraction imp2 = fraction;

        int denAnswer = imp1.getDenominator() * imp2.getDenominator();
        int numAnswer = (imp1.getNumerator() * (denAnswer/imp1.getDenominator())) + (imp2.getNumerator() * (denAnswer/imp2.getDenominator()));

        Fraction initialAnswer = new Fraction(numAnswer, denAnswer);

        MixedFraction sumAnswer = initialAnswer.toMixed();

        return sumAnswer;
    }

    public MixedFraction subtract(MixedFraction mixed){
        Fraction imp1 = this.toImproper();
        Fraction imp2 = mixed.toImproper();

        int denAnswer = imp1.getDenominator() * imp2.getDenominator();
        int numAnswer = (imp1.getNumerator() * (denAnswer/imp1.getDenominator())) - (imp2.getNumerator() * (denAnswer/imp2.getDenominator()));

        Fraction initialAnswer = new Fraction(numAnswer, denAnswer);

        MixedFraction subtractAnswer = initialAnswer.toMixed();

        return subtractAnswer;
    }

    public MixedFraction subtract(Fraction fraction){
        Fraction imp1 = this.toImproper();
        Fraction imp2 = fraction;

        int denAnswer = imp1.getDenominator() * imp2.getDenominator();
        int numAnswer = (imp1.getNumerator() * (denAnswer/imp1.getDenominator())) - (imp2.getNumerator() * (denAnswer/imp2.getDenominator()));

        Fraction initialAnswer = new Fraction(numAnswer, denAnswer);

        MixedFraction subtractAnswer = initialAnswer.toMixed();

        return subtractAnswer;
    }

    public MixedFraction multiplyBy(MixedFraction mixed){
        Fraction imp1 = this.toImproper();
        Fraction imp2 = mixed.toImproper();

        int numAnswer = imp1.getNumerator()*imp2.getNumerator();
        int denAnswer = imp1.getDenominator()*imp2.getDenominator();

        Fraction initialAnswer = new Fraction(numAnswer, denAnswer);

        MixedFraction multiplyAnswer = initialAnswer.toMixed();

        return multiplyAnswer;
    }

    public MixedFraction multiplyBy(Fraction fraction){
        Fraction imp1 = this.toImproper();
        Fraction imp2 = fraction;

        int numAnswer = imp1.getNumerator()*imp2.getNumerator();
        int denAnswer = imp1.getDenominator()*imp2.getDenominator();

        Fraction initialAnswer = new Fraction(numAnswer, denAnswer);

        MixedFraction multiplyAnswer = initialAnswer.toMixed();

        return multiplyAnswer;
    }

    public MixedFraction divideBy(MixedFraction mixed){
        Fraction imp1 = this.toImproper();
        Fraction imp2 = mixed.toImproper();

        int numAnswer = imp1.getNumerator()*imp2.getDenominator();
        int denAnswer = imp1.getDenominator()*imp2.getNumerator();

        Fraction initialAnswer = new Fraction(numAnswer, denAnswer);

        MixedFraction divideAnswer = initialAnswer.toMixed();

        return divideAnswer;
    }

    public MixedFraction divideBy(Fraction fraction){
        Fraction imp1 = this.toImproper();
        Fraction imp2 = fraction;

        int numAnswer = imp1.getNumerator()*imp2.getDenominator();
        int denAnswer = imp1.getDenominator()*imp2.getNumerator();

        Fraction initialAnswer = new Fraction(numAnswer, denAnswer);

        MixedFraction divideAnswer = initialAnswer.toMixed();

        return divideAnswer;
    }

}
