package d17loops_arrays;

public class PracticeArrays {
    public static void main(String[] args) {

        int [ ] items = {2, 7, 3, 5, 8, 9};
        int funny = items[0];
        for (int i = 0; i < items.length; i++)
        {
            if (items[ i ] > funny)
                funny = items[ i ];
        }
        System.out.print(funny);

        System.out.println("----------------------------");
        int [ ] numbers = { 1, 2, 3, 4, 5, 6, 7,  8, 9, 10};
        for (int j = 0; j < numbers.length; j++)
            System.out.print(numbers[ j ] + " ");

        System.out.println("________________________");

        int [ ] a = new int [5];
        a[0] = 5;
        a[1] = 4;
        a[2] = 3;
        System.out.print(a[0] + a[1] + a[4]);

        System.out.println("______________________");

        int [ ] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < 4; i++)
            System.out.print(array[i] + " ");

        System.out.println("______________________");

        int [ ] dedo = { 1, 3, 6, 9, 2, 5, 7};
        int que = dedo[0];
        for (int k = 0; k < dedo.length; k++)
        {
            if (dedo[k] < que)
                que = dedo[k];
        }
        System.out.print(que);
        System.out.println("__________________");

        int [ ] array1 = { 2, 4, 6, 8, 1, 3, 5, 7};
        int george = 0;
        for (int i = 0; i < array.length; i++)
            george += array[i];
        System.out.println(george);
        System.out.println("____________________");

        String [ ] name = { "Joe", "Sue", "Tom", "Jill", "Patty"};
        for (int i = 0; i < name.length; i = i + 2)
            System.out.print(name[i] + " ");
    }
}
