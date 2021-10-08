
import Database.*;
import Static_classes.Print_logo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DB database1 = new DB();
        Print_logo.print_logo();
        System.out.println("\n");
        System.out.print(database1.getCreation_date().substring(0,10));
        System.out.println(" Welcome to the DataBase");
        System.out.println("...");
        System.out.println("......");

        boolean close_validation = false;

        while ( !close_validation ) {
           boolean[] check_call = database1.query1.startup();
           database1.update_reg();
           if (check_call[5]){
               database1 = new DB();
           }
           if (check_call[6]){
                close_validation = database1.close();
            }

        }

        System.out.print("Closing the Main application");
        Print_logo.print_logo();
        System.out.print(" Copyright ");
        System.out.println(database1.getCreation_date().substring(0,4));
        System.out.println("...");
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.println("......");

    }
} // END of Class
