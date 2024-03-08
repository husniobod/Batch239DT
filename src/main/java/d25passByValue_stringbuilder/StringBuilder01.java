package d25passByValue_stringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
1) The "StringBuilder" class is also a class that produces Strings.
2) We use the "String" class to create Strings. Why did Java also create the StringBuilder class?
   The "String" class produces "immutable" (unchangeable) Strings,
   while the StringBuilder class produces "mutable" (changeable) Strings.
3) Being "immutable" means preserving the original value, being unchangeable.
   Being "mutable" means the original value can be changed.
4) Therefore, when you need to frequently add, remove, or modify text,
   using StringBuilder can be a more efficient and performant option.
5) StringBuilder includes various methods and functions for adding, removing, changing, or reversing text data.
   Among these are commonly used methods like append, delete, insert, and replace.

          */

        //String Builder - Mutable - (changeable)
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);
        sb1.append("!");
        System.out.println(sb1);

        //StringBuilder sb2 = "Java"; using class name without new keyword is special to String only.

        //Example: When I assign concatenated data into existing container, what happens to original data?
        String a = "Money";
        System.out.println(a);// Money
        a = a + " More";
        System.out.println(a);// Money More

        /*
        1) If you assign a String to the same String variable after modifying it, Java creates a new container.
        2) The modified value is placed inside this new container,
        and the pointer that was pointing to the old container is redirected to the new container.
        3) Consequently, the old container becomes addressless and is deleted by the "Garbage Collector" which removes
        containers without addresses. GC prevents memory leaks. GC is a key feature that makes Java a safe and efficient
        language for many applications. Data does not linger(stay) in memory unowned and insecurely.
        4) The timing of the GC's operation is completely controlled by the JVM (Java Virtual Machine) and is independent of
        the application.
        */

    }
}
