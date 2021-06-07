package by.andervyd.syntax_introduction.operators.arithmetic_operators;

/*      Operator	Description
        +	        Adds op1 and op2; also used to concatenate strings
        -	        op1 - op2	Subtracts op2 from op1
        *	        op1 * op2	Multiplies op1 by op2
        /	        op1 / op2	Divides op1 by op2
        %	        op1 % op2	Computes the remainder of dividing op1 by op2
        ++
        --
*/

public class Example {
    public static void main(String[] args) {

        int op1 = 10;
        int op2 = 7;

        System.out.println("op1 + op2 = " + (op1 + op2));
        System.out.println("op1 - op2 = " + (op1 - op2));
        System.out.println("op1 * op2 = " + (op1 * op2));
        System.out.println("op1 / op2 = " + (op1 / op2));
        System.out.println("op1 % op2 = " + (op1 % op2));

        // ++op1 or op1++
        // --op2 or op2--
        System.out.println("++op1 = " + ++op1);
        System.out.println("--op2 = " + --op2);

    }
}
