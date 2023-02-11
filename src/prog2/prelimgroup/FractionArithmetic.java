/**
 * GROUP NUMBER: 8
 * GROUP MEMBERS:
 *     Guzman, Sanchie Earl Manalo
 *     Jasmin, Ramon Emmiel
 *     Lacanilao, Patrick
 *     Leung, Leonhard
 *
 * ALGORITHM:
 *     1. Instantiate an object of Fraction named fraction1 and fraction2
 *     2. Declare and initialize a variable named userAnswer to hold the answer of the user. (set it to 0)
 *     3. Greet the user by invoking the greetUser method.
 *     4. Using a do-while loop,
 *        4.1. Invoke the showFirstMenu method.
 *        4.2. Read the input of the user and store it in userAnswer.
 *        4.3. Use switch statements to invoke certain methods following the contents of the first menu.
 *             - For case 1:
 *                  Invoke the enterFraction method to obtain the value for fraction1.
 *             - For case 2:
 *                  Invoke the enterFraction method to obtain the value for fraction2.
 *             - For case 3:
 *                  Display an ending statement
 *        4.4. Repeat the loop if the user's answer is not equal to 3 and if the numerator and denominator are 0.
 *     5. Set the answer of the user to 0.
 *     6. Using a do-while loop,
 *        6.1. Invoke the showSecondMenu method.
 *             6.2. Read the input of the user and store it in userAnswer.
 *             6.3. Use switch statements to invoke certain methods following the contents of the second menu.
 *                  - For case 1:
 *                       Invoke the showFractions method with the parameters being fraction1 and fraction2 respectively.
 *                  - For case 2:
 *                       Invoke the enterFraction method to obtain the value of fraction1
 *                  - For case 3:
 *                       Invoke the enterFraction method to obtain the value of fraction2
 *                       // to be doneS
 *             6.4. Repeat the loop if the user's answer is not equal to 9.
 *
 *
 *
 * */

package prog2.prelimgroup;

import java.lang.*;
import java.util.Scanner;

public class FractionArithmetic {
    public static void main(String[] args) {
        FractionArithmetic runProgram = new FractionArithmetic();
    }

    /**
     * Default constructor of the FractionArithmetic that immediately calls the run method
     * */
    public FractionArithmetic(){
        run();
    }
    /**
     * Method that includes the whole process of the program
     * */
    public void run(){
        Scanner runScanner = new Scanner(System.in);

        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();


        int userAnswer = 0;

        greetUser();

        do {

            showFirstMenu();

            userAnswer = Integer.parseInt(runScanner.nextLine());

            switch (userAnswer){
                case 1:
                    fraction1 = enterFraction("*FRACTION 1*");
                    break;
                case 2:
                    fraction2 = enterFraction("*FRACTION 2*");
                    break;
                case 3:
                    System.out.println("Thank you for using our program");
                    System.out.println("Exiting...");
                    return;
            }

        }while(userAnswer != 3 && (fraction1.getNumerator() == 0) || (fraction2.getNumerator() == 0));

        userAnswer = 0;

        do {

            showSecondMenu();

            userAnswer = Integer.parseInt(runScanner.nextLine());

            switch (userAnswer){
                case 1:
                    showFractions(fraction1, fraction2);
                    break;
                case 2:
                    fraction1 = enterFraction("*FRACTION 1*");
                    break;
                case 3:
                    fraction2 = enterFraction("*FRACTION 2");
                    break;
                case 4:
                    addition(fraction1, fraction2);
                    break;
                case 5:
                    subtraction(fraction1, fraction2);
                    break;
                case 6:
                    multiplication(fraction1, fraction2);
                    break;
                case 7:
                    division(fraction1, fraction2);
                    break;
                case 8:
                    reduceFraction(fraction1, fraction2);
                    break;
                case 9:
                    System.out.println("THANK YOU FOR USING OUR PROGRAM");
                    System.out.println("HAVE A GOOD DAY!");
                    return;
            }

        }while (userAnswer != 9);

    }

    /**
     * Method that shows a prompt message that will greet the user before using the program
     * */
    public void greetUser(){
        Scanner greetUserScanner = new Scanner(System.in);

        System.out.println("Good Day User!");
        System.out.println("This program will allow you to enter 2 fractions and perform arithmetic operations.");
        System.out.println();
        System.out.println("Press ENTER to continue...");
        greetUserScanner.nextLine();
    }

    /**
     * Method that shows the first menu in which the user will input the desired process
     * */
    public void showFirstMenu(){
        System.out.println("**********************************************");
        System.out.println("* ENTER THE NUMBER OF YOUR DESIRED OPERATION *");
        System.out.println("*    1. Enter value of Fraction 1            *");
        System.out.println("*    2. Enter value of Fraction 2            *");
        System.out.println("*    3. Exit                                 *");
        System.out.println("*********************************************");
        System.out.println();
    }

    /**
     * Method that shows the second menu in which the user will choose their desired operation
     * */
    public void showSecondMenu(){
        System.out.println();
        System.out.println("************************************************");
        System.out.println("*  ENTER THE NUMBER OF YOUR DESIRED OPERATION  *");
        System.out.println("*     1. Show Current Fractions                *");
        System.out.println("*     2. Change Fraction 1                     *");
        System.out.println("*     3. Change Fraction 2                     *");
        System.out.println("*     4. Add Fractions                         *");
        System.out.println("*     5. Subtract Fractions                    *");
        System.out.println("*     6. Multiply Fractions                    *");
        System.out.println("*     7. Divide Fractions                      *");
        System.out.println("*     8. Reduce a Fraction                     *");
        System.out.println("*     9. Exit                                  *");
        System.out.println("************************************************");
    }

    /**
     * Method that shows the current fractions given by the user
     * */
    public void showFractions(Fraction fraction1, Fraction fraction2){

        Scanner showFractionsScanner = new Scanner(System.in);

        System.out.println();
        System.out.println("* CURRENT FRACTIONS *");
        System.out.println();
        System.out.println("*********************");
        System.out.println("FRACTION 1: " + fraction1.toString());
        System.out.println("FRACTION 2: " + fraction2.toString());
        System.out.println("*********************");
        System.out.println();

        System.out.println("Press ENTER to continue...");
        showFractionsScanner.nextLine();
    }

    /**
     * Method in which the user will be given a prompt message to input their desired fractions
     * */
    public Fraction enterFraction(String promptMessage){
        Scanner enterFractionScanner = new Scanner(System.in);

        int numerator;
        int denominator;

        System.out.println(promptMessage);
        System.out.print("NUMERATOR: " );
        numerator = Integer.parseInt(enterFractionScanner.nextLine());
        System.out.print("DENOMINATOR: ");
        denominator = Integer.parseInt(enterFractionScanner.nextLine());
        Fraction fraction = new Fraction(numerator, denominator);

        System.out.println();

        System.out.println("ENTERED FRACTION: " + fraction.toString());

        System.out.println();

        System.out.println("Press ENTER to continue...");
        enterFractionScanner.nextLine();

        return fraction;
    }

    /**
     * Method that adds the fractions using the add() method from Fraction class
     * */
    public void addition(Fraction fraction1, Fraction fraction2){
        Scanner additionScanner = new Scanner(System.in);

        Fraction fractionAnswer = new Fraction();

        fractionAnswer = fraction1.add(fraction2);

        System.out.println();
        System.out.println("************");
        System.out.println("* ADDITION *");
        System.out.println("************");
        System.out.println();
        System.out.println(fraction1.toString() + " + " + fraction2.toString());
        System.out.println();
        System.out.println("************************************");
        System.out.println("ORIGINAL RESULT: " + fractionAnswer.toString());
        System.out.println("REDUCED RESULT: " + fractionAnswer.reduceFraction().toString() + " or " + fractionAnswer.toDouble());
        System.out.println("************************************");
        System.out.println();

        System.out.println("Press ENTER to continue...");
        additionScanner.nextLine();
    }

    /**
     * Method that subtracts the fractions using the subtract() method from the Fraction class
     * */
    public void subtraction(Fraction fraction1, Fraction fraction2){
        Scanner subtractionScanner = new Scanner(System.in);

        Fraction fractionAnswer = new Fraction();

        fractionAnswer = fraction1.subtract(fraction2);

        System.out.println();
        System.out.println("***************");
        System.out.println("* SUBTRACTION *");
        System.out.println("***************");
        System.out.println();
        System.out.println(fraction1.toString() + " - " + fraction2.toString());
        System.out.println();
        System.out.println("************************************");
        System.out.println("ORIGINAL RESULT: " + fractionAnswer.toString());
        System.out.println("REDUCED RESULT: " + fractionAnswer.reduceFraction().toString() + " or " + fractionAnswer.toDouble());
        System.out.println("************************************");
        System.out.println();

        System.out.println();

        System.out.println("Press ENTER to continue...");
        subtractionScanner.nextLine();
    }
    /**
     * Method that multiplies the fractions using the multiplyBy() method from the Fraction class
     * */
    public void multiplication(Fraction fraction1, Fraction fraction2){
        Scanner multiplicationScanner = new Scanner(System.in);

        Fraction fractionAnswer = new Fraction();

        fractionAnswer = fraction1.multiplyBy(fraction2);

        System.out.println();
        System.out.println("******************");
        System.out.println("* MULTIPLICATION *");
        System.out.println("******************");
        System.out.println();
        System.out.println(fraction1.toString() + " * " + fraction2.toString());
        System.out.println();
        System.out.println("************************************");
        System.out.println("ORIGINAL RESULT: " + fractionAnswer.toString());
        System.out.println("REDUCED RESULT: " + fractionAnswer.reduceFraction().toString() + " or " + fractionAnswer.toDouble());
        System.out.println("************************************");
        System.out.println();

        System.out.println();

        System.out.println("Press ENTER to continue...");
        multiplicationScanner.nextLine();
    }
    /**
     * Method that divides the fractions using the divideBy() from the Fraction class
     * */
    public void division(Fraction fraction1, Fraction fraction2){
        Scanner divisionScanner = new Scanner(System.in);

        Fraction fractionAnswer = new Fraction();

        fractionAnswer = fraction1.divideBy(fraction2);

        System.out.println();
        System.out.println("************");
        System.out.println("* DIVISION *");
        System.out.println("************");
        System.out.println();
        System.out.println("("+fraction1.toString()+")" + " / " + "("+fraction2.toString()+")");
        System.out.println();
        System.out.println("************************************");
        System.out.println("ORIGINAL RESULT: " + fractionAnswer.toString());
        System.out.println("REDUCED RESULT: " + fractionAnswer.reduceFraction().toString() + " or " + fractionAnswer.toDouble());
        System.out.println("************************************");
        System.out.println();



        System.out.println();

        System.out.println("Press ENTER to continue...");
        divisionScanner.nextLine();
    }

    /**
     * Method that reduces the fractions using the reduceFraction() method from the Fraction class
     * */
    public static void reduceFraction(Fraction fraction1, Fraction fraction2){

        Scanner reduceFractionScanner = new Scanner(System.in);

        System.out.println("************************************************");
        System.out.println("*  ENTER THE NUMBER OF YOUR DESIRED OPERATION  *");
        System.out.println("*     1. Reduce Fraction 1                     *");
        System.out.println("*     2. Reduce Fraction 2                     *");
        System.out.println("*     3. Back                                  *");
        System.out.println("************************************************");
        int userPromptAnswer = Integer.parseInt(reduceFractionScanner.nextLine());

        switch (userPromptAnswer){
            case 1:
                System.out.println();
                System.out.println("*************************************");
                System.out.println("ORIGINAL FRACTION 1: " + fraction1.toString());
                System.out.println("REDUCED FRACTION 1: " + fraction1.reduceFraction().toString());
                System.out.println("*************************************");
                break;
            case 2:
                System.out.println();
                System.out.println("*************************************");
                System.out.println("ORIGINAL FRACTION 2: " + fraction2.toString());
                System.out.println("REDUCED FRACTION 2: " + fraction2.reduceFraction().toString());
                System.out.println("*************************************");
                break;
            case 3:
                break;
        }

        System.out.println();

        System.out.println("Press ENTER to continue...");
        reduceFractionScanner.nextLine();
    }
}
