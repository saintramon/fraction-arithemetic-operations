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

    public int getWholeNum(){
        return this.wholeNum;
    }


    public Fraction add(MixedFraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        denAnswer = computeGCD(super.getDenominator(), fraction.getDenominator());

        denAnswer = (super.getDenominator() * fraction.getDenominator()) / denAnswer;

        numAnswer = (super.getDenominator() * this.wholeNum + super.getNumerator()) * (denAnswer/super.getDenominator())
                +
                ((fraction.getDenominator() * fraction.getWholeNum() + fraction.getNumerator()) * (denAnswer / fraction.getDenominator()));

        Fraction fractionAnswer = new Fraction(numAnswer, denAnswer);

        return fractionAnswer;
    }
    public Fraction add(Fraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        denAnswer = computeGCD(super.getDenominator(), fraction.getDenominator());

        denAnswer = (super.getDenominator() * fraction.getDenominator()) / denAnswer;

        numAnswer = (super.getDenominator() * this.wholeNum + super.getNumerator()) * (denAnswer/super.getDenominator())
                +
                (fraction.getNumerator() * (denAnswer / fraction.getDenominator()));

        Fraction fractionAnswer = new Fraction(numAnswer, denAnswer);

        return fractionAnswer;
    }

    public Fraction subtract(MixedFraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        denAnswer = computeGCD(super.getDenominator(), fraction.getDenominator());

        denAnswer = (super.getDenominator() * fraction.getDenominator()) / denAnswer;

        numAnswer = (super.getDenominator() * this.wholeNum + super.getNumerator()) * (denAnswer/super.getDenominator())
                -
                ((fraction.getDenominator() * fraction.getWholeNum() + fraction.getNumerator()) * (denAnswer / fraction.getDenominator()));

        Fraction fractionAnswer = new Fraction(numAnswer, denAnswer);

        return fractionAnswer;
    }
    public Fraction subtract(Fraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        denAnswer = computeGCD(super.getDenominator(), fraction.getDenominator());

        denAnswer = (super.getDenominator() * fraction.getDenominator()) / denAnswer;

        numAnswer = (super.getDenominator() * this.wholeNum + super.getNumerator()) * (denAnswer/super.getDenominator())
                -
                (fraction.getNumerator() * (denAnswer / fraction.getDenominator()));

        Fraction fractionAnswer = new Fraction(numAnswer, denAnswer);

        return fractionAnswer;
    }

    public Fraction multiplyBy(MixedFraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        numAnswer = (super.getDenominator() * this.wholeNum + super.getNumerator()) * (fraction.getDenominator() * fraction.getWholeNum() + fraction.getNumerator());
        denAnswer = super.getDenominator() * fraction.getDenominator();

        Fraction fractionAnswer = new Fraction(numAnswer, denAnswer);

        return fractionAnswer;
    }
    public Fraction multiplyBy(Fraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        numAnswer = (super.getDenominator() * this.wholeNum + super.getNumerator()) * fraction.getNumerator();
        denAnswer = super.getDenominator() * fraction.getDenominator();

        Fraction fractionAnswer = new Fraction(numAnswer, denAnswer);

        return fractionAnswer;
    }

    public Fraction divideBy(MixedFraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        numAnswer = (super.getDenominator() * this.wholeNum + super.getNumerator()) * fraction.getDenominator();
        denAnswer = super.getDenominator() * (fraction.getDenominator() * fraction.getWholeNum() + fraction.getNumerator());


        Fraction fractionAnswer = new Fraction(numAnswer, denAnswer);

        return fractionAnswer;
    }
    public Fraction divideBy(Fraction fraction){
        int numAnswer = 0;
        int denAnswer = 0;

        numAnswer = (super.getDenominator() * this.wholeNum + super.getNumerator()) * fraction.getDenominator();
        denAnswer = super.getDenominator() * fraction.getNumerator();

        Fraction fractionAnswer = new Fraction(numAnswer, denAnswer);

        return fractionAnswer;
    }

    public Fraction toImproper(){

        int numAnswer = 0;
        int denAnswer = 0;

        numAnswer = (this.wholeNum * super.getDenominator()) + super.getNumerator();
        denAnswer = super.getDenominator();

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
