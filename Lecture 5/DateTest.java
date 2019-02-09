public class Date {
 
    private int monthdate;
    private int daydate;
    private int yeardate;
     
    public Date (int month, int day, int year) {
        monthdate = month;
        daydate = day;
        yeardate = year;
    }
     
    public void setMonth (int month) {
        monthdate = month;
    }
     
    public int getMonth() {
        return monthdate;
    }
     
    public void setday (int day) {
        daydate = day;
    }
     
    public int getDay() {
        return daydate;
    }
     
    public void setYear (int year ) {
        yeardate = year;
    }
     
    public int getYear() {
        return yeardate;
    }
     
    public void displayDate () {
        System.out.printf ("%d/%d/%d\n", getMonth(), getDay(), getYear());
    }
 
}

import java.util.Scanner;
 
public class DateTest {
    public static void main (String [] args) {
         
        Date display = new Date (0,0,0);
 
        Scanner input = new Scanner (System.in);
         
        int month;
        int day;
        int year;
         
        System.out.print ("Enter Month: ");
        month = input.nextInt();
        display.setMonth(month);
         
        System.out.println ();
         
        System.out.print ("Enter Day: ");
        day = input.nextInt();
        display.setday(day);
         
        System.out.println ();
         
        System.out.print ("Enter Year: ");
        year = input.nextInt();
        display.setYear(year);
         
        System.out.println ();
         
        display.displayDate();
 
    }
}
