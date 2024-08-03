package Javacorecode.jdk8;

import Javacorecode.jdk8.MathOperation;

/**
 * Java 8 functional programming
 */
public class AddSubract {
    public static void main(String[] args) {

        //An expressive static helper method
        MathOperation<Integer> calc = (x) -> MathOperation.init(5);

        MathOperation<Integer> complexOp = calc.add(6)
                .multiply(6)
                .subtract(1)
                .divide(5);

        complexOp.print();
    }
}
