package d12stringmanipulation;

public class StringManipulation01 {
    public static void main(String[] args) {

        //Example 2: Print initials of firstname and lastname of names entered by user...
// "    Mike   Tyson   "  => MT

//trim() => removes spaces from beginning and ending of string...does not touch the spaces in between
// split()

        String name =  "    Mike Tyson   ";

        char initialOfFirstName =  name.trim().charAt(0); //M
        System.out.println("initial Of FirstName= " + initialOfFirstName);

//initial of lastname
        char initialOfLastName=  name.trim().split(" ")[1].charAt(0);
        System.out.println("initial Of LastName = " + initialOfLastName); //T
        System.out.println("" + initialOfFirstName + initialOfLastName);


//        //initial of lastname
//        char initialOfLastName=  name.trim().split(" ")[1].charAt(0);
//        System.out.println("initial Of LastName = " + initialOfLastName); //T
//
//        System.out.println("" + initialOfFirstName + initialOfLastName); //MT
// System.out.println(initialOfFirstName + "" + initialOfLastName); //MT
        //without starting wcith string quotation, java will addition ASCII values from initials.
        // that is characteristic of charAt() method...


        //2. way:

        //indexOf() =>  it will give me first occurrence of the specified character
        //

        String email1 = "abcd@gmail.com";

        int startingIndex = email1.indexOf("@") + 1;

        int endingIndex = email1.indexOf("."); //domain1 = gmail

        String domain1  = email1.substring(startingIndex, endingIndex);

        System.out.println("domain1 = " + domain1);

        //lastIndexOf() =>  it will give me last occurrence of the specified character
//
        String email2 = "ab.cd@gmail.com";

        int startingIndexx = email2.indexOf("@") + 1;
// System.out.println("startingIndex = " + startingIndex); //
        int endingIndexx = email2.lastIndexOf("."); //domain1 = gmail
// System.out.println("endingIndex = " + endingIndex); //

        String domain2  = email2.substring(startingIndexx, endingIndexx);
        System.out.println("domain2 = " + domain2);
    }
}
