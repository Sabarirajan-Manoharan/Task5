package Task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class UserBirthday {

    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your birthdate (yyyy-mm-dd): ");
            String birthdateInput = scanner.nextLine();


            LocalDate date = LocalDate.now();
            LocalDate date1 = LocalDate.parse(birthdateInput);

            int age = Period.between(date1, date).getYears();
            int month = Period.between(date1, date).getMonths();
            int days = Period.between(date1, date).getDays();

            System.out.println(age +" years, "+ month +" months, and "+ days + " days.");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
