package Arithmetic.Arithmetic.project;

import java.util.function.BiFunction;
45
public class BasicCalculatorAndTextMerger {

    //  two integers using a BiFunction<Integer, Integer, Integer>
    public static int calculate(int num1, int num2, BiFunction<Integer, Integer, Integer> operation) {
        return operation.apply(num1, num2);
    }

    //  length using a BiFunction<String, String, Integer>
    public static int mergeAndAnalyze(String str1, String str2, BiFunction<String, String, Integer> mergeFunction) {
        return mergeFunction.apply(str1, str2);
    }

    public static void main(String[] args) {
        //  calculator
        int operand1 =918;
        int operand2 = 98;
        System.out.println("Addition: " + calculate(operand1, operand2, (a, b) -> a + b));
        System.out.println("Subtraction: " + calculate(operand1, operand2, (a, b) -> a - b));
        System.out.println("Multiplication: " + calculate(operand1, operand2, (a, b) -> a * b));
        System.out.println("Division: " + calculate(operand1, operand2, (a, b) -> a / b));


        String text1 = "AWSED";
        String text2 = "SWADER";
        System.out.println("Total length of merged strings: " +
                mergeAndAnalyze(text1, text2, (s1, s2) -> s1.length() + s2.length()));
    }
}
