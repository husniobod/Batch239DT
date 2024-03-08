package d22arraylist_methodcreation;

public class MethodCreation02 {
    public static void main(String[] args) {    /*
ACCESS MODIFIERS IN JAVA: i) Public ii) Protected iii)Default iv)Private

1) Public: Everyone can use. No restriction. Accessible from anywhere in project

2) Protected: Provides access to specific groups and subgroup of those groups
                Accessible within its own package
                And accessible from outside the package but only through the inheritance...
      => a subclass is located in a different package can access the protected members of its superclass

3) Default: Allows class members to be accessible within their own package.
            Less restrictive than private, but more restrictive than  protected and public

4) Private: Provide access only to the class members in which methods are created....

 */

        int result = multiplication(4, 6, 9);
        System.out.println(result);

        int result2 =multiplyAndAdd(12,34,56);
        System.out.println(result2);
    }

    private static int multiplication(int x, int y, int z) {
        int mult = x * y * z;
        return mult;


    }

    private static int multiplyAndAdd(int a, int b, int c) {
        int result = (12 * 34) + 56;
        return result;
    }


}