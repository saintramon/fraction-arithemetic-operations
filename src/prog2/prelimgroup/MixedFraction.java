package prog2.prelimgroup;

public class MixedFraction extends Fraction{

    private int wholeNum;

    public MixedFraction(){
        super();
        this.wholeNum = 0;
    }

    public MixedFraction(int numerator, int denominator, int wholeNum){
        super(numerator, denominator);
        this.wholeNum = wholeNum;
    }

    public void setWholeNum(int wholeNum){
        this.wholeNum = wholeNum;
    }

    //add

    //subtract

    //multiply

    //divide

    public Fraction toImproper(){
        int numAnswer = (wholeNum * super.getDenominator()) + super.getNumerator();
        int denAnswer = super.getDenominator();

        Fraction fractionAnswer = new Fraction(numAnswer, denAnswer);

        return fractionAnswer;
    }

    public String toString(){
        return wholeNum + " " + super.getNumerator() + "/" + super.getDenominator();
    }

    public double toDouble(){

        int numAnswer = (this.wholeNum * super.getDenominator()) + super.getNumerator();
        int denAnswer = super.getDenominator();

        Fraction fractionAnswer = new Fraction(numAnswer, denAnswer);

        return (double) fractionAnswer.getNumerator() / fractionAnswer.getDenominator();
    }
}
