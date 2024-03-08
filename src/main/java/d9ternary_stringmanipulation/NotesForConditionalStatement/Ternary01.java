package d9ternary_stringmanipulation.NotesForConditionalStatement;

public class Ternary01 {
    public static void main(String[] args) {
//Example: If two numbers have the same sign, return multiplication of them
// if signs are different, print "I can not multiply the number with different sign!"

        int a = 4;
        int b = -5;
        Object result = (a*b) > 0 ? (a*b) : ("I cannot multiply the number with different sign!");
        System.out.println("result = " + result);

    }
}
