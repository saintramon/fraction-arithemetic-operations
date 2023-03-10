package prog2.midgroup01;

import prog2.prelimgroup.Fraction;

public class TestingPhase {
    public static void main(String[] args) {
        MixedFraction mf1 = new MixedFraction(1,2,3);
        MixedFraction mf2 = new MixedFraction(4,5,6);

        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(3,4);
        Fraction f3 = new Fraction(10,5);

        System.out.println(mf1.divideBy(mf2));
        System.out.println(mf1.divideBy(f1));
    }
}
