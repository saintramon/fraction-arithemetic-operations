package prog2.prelimgroup;

public class TestingPhase {
    public static void main(String[] args) {
        Fraction myFraction = new Fraction(3, 2);

        System.out.println(myFraction.toString());

        System.out.println(myFraction.toMixed());

        System.out.println(myFraction.toMixed().toImproper());
    }
}
