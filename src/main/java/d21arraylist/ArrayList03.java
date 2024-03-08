package d21arraylist;

import java.util.ArrayList;

public class ArrayList03 {
    public static void main(String[] args) {


        //Example: Create a String ArrayList and remove the elements containing "a"...
        //you can not decrease number of elements in Lists when using "for each loop"
        //If the size of the collection or array changes, it disrupts the consistency of the loop
        //Specifically, when an element is removed, the loop will still consider the old size...
        //..which can lead exceeding array boundaries...
        //Exception in thread "main" java.util.ConcurrentModificationException
        //Loop says we started looping with 4 elements,
        // but it is changing bcs of remove method and I cant run anymore..

        ArrayList<String> s = new ArrayList<>();
        s.add("Istanbul");
        s.add("Atina");
        s.add("Houston");
        s.add("Moscow");
        System.out.println(s); //[Istanbul, Atina, Houston, Moscow]

        /*
            for (String w : s){
                if(w.contains("a")){
                    s.remove(w);
                }

            }
        System.out.println("Updated= " + s);*/


        for (int i=0; i<s.size(); i++){ ///[Istanbul, Atina, Houston, Moscow]

            if(s.get(i).contains("a")){

                s.remove(i);

                i--;

            }
        }
        System.out.println("s latest= " + s);
            }
        }
       // System.out.println("s latest= " + s);





