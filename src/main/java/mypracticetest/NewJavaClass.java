package mypracticetest;

public class NewJavaClass {
    public static void main(String[] args) {




        String city = "Miami";


        int indexM = city.indexOf('m');

        if (indexM != -1) {
            String result = city.substring(0, indexM);
            System.out.println(result);

        } else {
            System.out.println("No characters before 'm' found.");



        }
    }
}
