package prog2.prelimgroup;

public class TestingPhase {
    public static void main(String[] args) {
        Fraction properFraction = new Fraction(1,2);
        MixedFraction myMix = new MixedFraction(6,12, 1);
        MixedFraction myMix2 = new MixedFraction(1,2,3);

        System.out.println(myMix2.subtract(properFraction).reduceFraction().toDouble());
        System.out.println(properFraction.subtract(myMix2).reduceFraction().toDouble());
    }
}
