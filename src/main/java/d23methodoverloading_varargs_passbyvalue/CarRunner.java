package d23methodoverloading_varargs_passbyvalue;

public class CarRunner {
    public static void main(String[] args) {

        //4) create an instance/object from Car class....

        //8) we entered the data into constructor parenthesis
        Car c1 = new Car("BMW", "M6", 2021, false); //(String brand, String model, int year, boolean sunroof)
        c1.action();
        c1.stop();

        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.engineType);
        System.out.println(c1.year);
        System.out.println(c1.sunroof);

        //5) get back to Car class and create constructor....

        // 9)
        Car c2 = new Car("Audi", "A5", 2019, false);
        System.out.println(c1);
        System.out.println(c2);
       // Car{brand='BMW', model='M6', year=2021, engineType='Hybrid', sunroof=false}
       // Car{brand='Audi', model='A5', year=2019, engineType='Hybrid', sunroof=false}


    }

}

