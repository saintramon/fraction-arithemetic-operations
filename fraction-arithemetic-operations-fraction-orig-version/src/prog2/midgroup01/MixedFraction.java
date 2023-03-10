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
        this.wholeNum = 0;
    }

    public MixedFraction(int numerator, int denominator, int wholeNum){
        super(numerator,denominator);
        this.wholeNum = wholeNum;
    }

    /**
     * Since we inherited the setters of the Fraction class, we should then only create the setter for the wholeNum part
     *
     * SETTER: Gebreyl
     */

    /**
     * Since we inherited the getters of the Fraction class, we should then only create the getter for the wholeNum part
     *
     * GETTER: Lans
     */

    /**
     * toDouble() method should return the decimal form of the mixed Fraction
     *
     * toDouble: Jasper and Diamond
     */

    /**
     * toString() should return the mixed fraction object as a string
     *
     * toString(): AU
     */
}
