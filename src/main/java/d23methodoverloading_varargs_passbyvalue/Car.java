package d23methodoverloading_varargs_passbyvalue;

public class Car {

    //when we create a data structure or helper class, we don't need main method...
    //But If we develop an independent program, we might need to create main method...
    //in Real projects, there are going to be many classes, and there will be one single class with main method.
    //And "Runner" annotation is appended to class name to the class with main method...

    //1) Let's create variables(passive characteristics)
    String brand = "Honda";
    String model = "Accord";

    int year = 2024;

    String engineType = "Hybrid";

    boolean sunroof = true;

    //2) let's create some methods (active characteristics)
    public void action() {
        System.out.println(brand + " reaches 100km/h in 7 seconds");
    }

    public void stop() {
        System.out.println(brand + " stops in 20 meters at maximum speed");
    }

    //3) Then create Main method in CarRunner class....


    /* 6) Create a constructor for Car class...
            What is constructor:
            It is a structure allowing us to create instance/object from Class
            When we create a class, Java is creating constructor in background automatically
            Those constructors are named "default constructor".
            default constructor ==> Car()

            But in the scenario in notes above, Class will give us the same data all the time.
            We can assign new data by the way. So we create our own constructor for Class and
            Java deletes the default one....

     */
    //Create constructor here...
    //access modifier + ClassName() + {}
    public Car(String brand, String model, int year, boolean sunroof) {
        this.brand = brand; //we will assign new data to local "brand" variable (this.brand)
        //new data will be assigned from Runner class by using class constructor and parameter
        this.model = model;
        this.year = year;
        this.sunroof = sunroof;
    }

    //7) Go to Runner class and enter 4 different data into parameters through class constructor parenthesis
    //(Java deleted default constructor now our constructor is on)

    //11) create two more constructors
    public Car(String brand, String model) { //right click, generate, constructor, select the data to update
        this.brand = brand;
        this.model = model;
    }

    public Car(String engineType) {
        this.engineType = engineType;
    }

    public Car(boolean sunroof) {
        this.sunroof = sunroof;
    }


// 10) toString()


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engineType='" + engineType + '\'' +
                ", sunroof=" + sunroof +
                '}';
    }
}
