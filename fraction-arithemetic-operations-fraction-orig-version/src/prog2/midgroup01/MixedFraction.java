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

    public void setWholeNum(int wholeNum){
        this.wholeNum = wholeNum;
    }

    public int getWholeNum(){
        return this.wholeNum;
    }

    public double toDouble(){
        return (this.wholeNum + 1.0 * getNumerator() / getDenominator());
    }

    public String toString(){
        if (getWholeNum() == 0){
            return (getNumerator() + "/" + getDenominator());
        }
        if (getDenominator() == 1){
            return ("" + (getWholeNum() + getNumerator()));
        }else {
            return (getWholeNum() + " " + getNumerator() + "/" + getDenominator());
        }
    }

    public MixedFraction reciprocal(){
        var reciprocal = new MixedFraction();
        reciprocal.setNumerator(getDenominator());
        reciprocal.setDenominator(getNumerator());
        return reciprocal;
    }

    public void toImproper(){
        setNumerator(getWholeNum()*getDenominator()+getNumerator());
        setDenominator(getDenominator());
        setWholeNum(0);
    }

    public void toMixed(){
        setWholeNum(getNumerator() / getDenominator());
        setNumerator(getNumerator() % getDenominator());
    }

    public MixedFraction add(Fraction fraction){

        int numAnswer;
        int denAnswer;

        toImproper();

        if (getDenominator() == fraction.getDenominator()){
            denAnswer = getDenominator();
            numAnswer = getNumerator() + fraction.getDenominator();
        }else {
            denAnswer = computeGCD(this.getDenominator(), fraction.getDenominator());
            numAnswer = denAnswer / getDenominator() * getNumerator() + denAnswer / fraction.getDenominator() * fraction.getNumerator();
        }

        toMixed();

        var sumAnswer = new MixedFraction();
        sumAnswer.setNumerator(numAnswer);
        sumAnswer.setDenominator(denAnswer);
        sumAnswer.reduceFraction();
        sumAnswer.toMixed();

        return sumAnswer;
    }

    public MixedFraction add(MixedFraction mixedFraction){
        int numAnswer;
        int denAnswer;

        toImproper();
        mixedFraction.toImproper();


    }


}
