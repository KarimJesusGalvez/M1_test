package Implementations;

import Interfaces.input;
import Interfaces.print_options;

import java.util.Scanner;

public class input_books_imp implements input, print_options {

        /**
         * Provides the scanner implementation
         * for writing a book type entry in BD
         *
         * @return
         *  with the deleteall() method
         */
        public String[] input(int length) {

            // TODO FIX!!! array length
            Scanner rawinput = new Scanner(System.in);
            String[] atrib_array = new String[length];
            for (int a = 0;a < length;a++) {

                atrib_array[a] = rawinput.nextLine(); // String
                rawinput.reset();
            }

            rawinput.close();

            return atrib_array;
        }

    /**
     * This Interfaces.input iterates a print/Interfaces.input pair to fill an array
     * @param type The array with the Strings describing
     *             the data to be inputted in each iteration
     * @return atrib_array The String array
     *             with the data passed in the inputs
     */
    public String[] input( String[] type) {

        Scanner rawinput = new Scanner(System.in);
        String[] atrib_array = new String[type.length];
        for (int a = 0;a < type.length;a++) {
            System.out.println(type[a]);
            atrib_array[a] = rawinput.nextLine(); // String
        }

        rawinput.close();

        return atrib_array;
    }


    /**
     * Prints the menu for writing the type data
     */
        public void print() {
            System.out.println("What kind of media do you want to add?");
            System.out.println("Select an option");
            System.out.println(" ");
            System.out.println("Option 1 - (G)eneral non defined entry ");
            System.out.println("Option 2 - (B)ook ");
            System.out.println("Option 3 - (A)udiobook");
            System.out.println("Option 4 - (M)ovie ");
            System.out.println("Option 5 - (R)ecorded music/audio ");
            System.out.println("Option 6 - (N)otated music ");
            System.out.println("Option 7 - (W)ebpage ");
            // System.out.println("Option -1 - Add a new type of media to the list");
            System.out.println(" ");
        }

    public void print_authors() {

    }

    public void print_type(String type) {

    }

    /**
     * Prints the Options to provide
     * nº of authors
     * then the names
     */
    public void print_type(){
            // TODO check white spaces with scanner
        System.out.println(" ");
        System.out.println("Introduce the Secondary author's name");


    }

    public void print_string(String[] printing_array) {

    }



    public String input() {

        Scanner rawinput = new Scanner(System.in);
        String option = rawinput.nextLine(); // String
        rawinput.reset();

        return option;
    }
}
