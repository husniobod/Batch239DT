package d24datetime_stringbuilder;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //Date Data Type (Class)

        //Example1: now() => returns date info from your computer system...
        LocalDate myDate = LocalDate.now(); //now() is a static method.
        System.out.println(myDate); //2024-03-06

        System.out.println(LocalDate.now());//also this works


        //Example2: Lets fetch only month element from date
        System.out.println(myDate.getMonthValue());//3 => getMonthValue() returns number of the month (1-12)
        //in Java, Month is Enum type data.
        //Constant data(day names, month names, country names) is stored in Enum

        Month monthName = myDate.getMonth();
        System.out.println("monthName = " + monthName); //monthName = MARCH

        //How to fetch just year element from date
        int year = myDate.getYear();
        System.out.println("year = " + year); //year = 2024

        //System.out.println(Year.now());
        System.out.println(myDate.getDayOfYear()); //66. day of the year today

        //fetch day of the month
        int dayOfMonth = myDate.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);

        //fetch day of the week
        DayOfWeek dayOfWeek = myDate.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek); //dayOfWeek = WEDNESDAY


        //Example2: How to go to a future time
        //plusDays() =>  it goes to future day based on the specified day number in method parenthesis
        //plusMonths() =>  it goes to future month based on the specified month number in method parenthesis
        //plusYears() => it goes to future year based on the specified year number in method parenthesis
        //Those methods, don't change original data. creates new day, month and year components...

        LocalDate futureDate = myDate.plusYears(1).plusMonths(2).plusDays(5);
        System.out.println("futureDate = " +futureDate);


        //Example3: How to go to a date in the past
        //minusYears() =>This subtracts the specified number from the year of LocalDate or LocalDateTime
        //minusMonths() => This subtracts the specified number from the month of LocalDate or LocalDateTime
        //minusDays() => This subtracts the specified number from the day of LocalDate or LocalDateTime
        //they return the date after subtraction

        System.out.println(myDate.minusYears(30).minusMonths(5).minusDays(7));



//minusYears() =>This subtracts the specified number from the year of LocalDate or LocalDateTime
//minusMonths() => This subtracts the specified number from the month of LocalDate or LocalDateTime
//minusDays() => This subtracts the specified number from the day of LocalDate or LocalDateTime
//they return the date after subtraction

        System.out.println(myDate.minusYears(28).minusMonths(5).minusDays(27));//1999-01-03

            //Example4: How to create a specific date
            //LocalDate.of() allows us to create a specific date


        LocalDate date1 = LocalDate.of(1980, 8, 7);
        LocalDate date2 = LocalDate.of(2010, 5, 4);
        System.out.println("Date1= " + date1 + " - Date2= " + date2); //Date1= 1980-08-07 - Date2= 2010-05-04

        //isAfter() => checks a date is after another date
        //isBefore() => checks a date is before another date


        boolean isAfter = date1.isAfter(date2);
        System.out.println(isAfter); //false

        boolean isBefore = date1.isBefore(date2);
        System.out.println(isBefore); //true


        //Example5: If the date entered by user is past date, print "Invalid date"
        //If user enters future date, print "You can enter time"

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter date components in the given order: year - month - day");

        int yearComp = input.nextInt();
        int monthComp = input.nextInt();
        int dayComp = input.nextInt();

        //combine the data to create a date in correct format

        LocalDate dateEntered = LocalDate.of(yearComp, monthComp, dayComp);
        System.out.println(dateEntered);

        if (dateEntered.isBefore(LocalDate.now())){
            System.out.println("Invalid date");
        }else {
            System.out.println("You can enter time!");
        }

        System.out.println("Enter your birthdate: year-month-day");

        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate birthDate = LocalDate.of(y,m,d);
        System.out.println(birthDate.getDayOfWeek());
    }

}