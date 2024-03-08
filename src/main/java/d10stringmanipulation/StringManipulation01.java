package d10stringmanipulation;
public class StringManipulation01 {

    public static void main(String[] args) {

        //String data type: is used to store sentences, words, symbols etc...


        //Example: Check the given string and calculate total number of characters in string....
        String s = "Java is so easy!";

        int numOfChars = s.length();
        System.out.println("numOfChars = " + numOfChars); //numOfChars = 16
        //-------------------------------------------------------------------

        //Example: in the String above, fetch first and last character then print on the console....
        //use charAt() method to fetch characters by using index
        // "Java is so easy!"
        char firstChar = s.charAt(0);
        System.out.println("firstChar = " + firstChar); //firstChar = J

        //fetch last character
        // "Java is so easy!"

        char lastChar = s.charAt(15);
        System.out.println("lastChar = " + lastChar); //lastChar = !

        //dynamic way: recommended
        char lastChar1 = s.charAt(s.length() - 1);
        System.out.println("lastChar1 = " + lastChar1); //lastChar1 = !

        //in String variables, all the characters locating in an index number....
        //Index is zero-based characteristic...
        //First character is in index 0 everytime...
        //And index number increase from left to right one by one....
    }

}