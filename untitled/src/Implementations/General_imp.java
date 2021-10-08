package Implementations;

import Bibliographic_classes.Bibliographic_entry;
import Interfaces.input;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class General_imp implements input {

    /**
     * general Interfaces.input
     * a string type input
     * @return The inputted String
     * Should be evaluated with evaluate()
     */
    public String input(){

        String option = "temp";

        try {
            Scanner rawinput = new Scanner(System.in);
            option = rawinput.nextLine(); // String
            rawinput.reset();

        }
        catch(NoSuchElementException e){
            System.out.println(" ");
            e.printStackTrace(System.out);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");

            option = "7";
        }

        return option;
    }

    /**
     * An iterator input
     * The method print should be invoked before this call
     * @param length nº of inputs to pass
     * @return an array with the inputs
     */
    public String[] input(int length) {

        Scanner rawinput = new Scanner(System.in);
        String[] atrib_array = new String[length];
        for (int a = 0; a < length; a++) {

            System.out.println("No trailing white spaces");
            atrib_array[a] = rawinput.nextLine(); // String
            rawinput.reset();
        }
        return atrib_array;
    }

    /**
     *Saves input and matches them to the types provided
     * @param type An array of Strings to print before the input
     * @return an array with the inputs matching the type indexes
     */
    public String[] input(String[] type) {
        Scanner rawinput = new Scanner(System.in);
        String[] atrib_array = new String[type.length];
        for (int a = 0; a < type.length; a++) {

            System.out.println("Please insert: "+ type[a]);

            atrib_array[a] = rawinput.nextLine(); // String
            rawinput.reset();
        }
        return atrib_array;
    }

    /**
     * Simple input
     * @param length placehoder to avoid @override of other methods
     * @return An int
     */
    public int input(short length){
        int option = 0;

        try {
            Scanner rawinput = new Scanner(System.in);
            option = rawinput.nextInt(); // Int
            rawinput.reset();

        }
        catch(NoSuchElementException e){
            System.out.println(" ");
            e.printStackTrace(System.out);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");

        }
        return option;
    }


    public void print(List<Bibliographic_entry> registries){
        if (registries.isEmpty() ) {
            System.out.println("No registries to print");
        }
        else{
            for (Bibliographic_entry media : registries) {

                media.print_atrib();
                System.out.println("===");
            }
        }

    }
    public void print(){
        System.out.println("");
        System.out.println("Select an option");
        System.out.println("");
        System.out.println("Option 1 - (P)rint all registries");
        System.out.println("");
        System.out.println("Option 2 - (C)heck a registry");
        System.out.println("");
        System.out.println("Option 3 - (A)dd registry");
        System.out.println("Option 4 - (M)odify a registry");
        System.out.println("");
        System.out.println("Option 5 - (E)rase registry");
        System.out.println("Option 6 - (D)elete the Database");
        System.out.println("");
        System.out.println("Option 7 - (S)hutdown");
        System.out.println("");
        // System.out.println("Option -1 - (T)est");
    }


    public void print_type(String type){

        System.out.println(" ");
        System.out.println("Introduce " +  type);
        System.out.println("Enter EXIT to stop adding names");

    }
    public int print_mod_array(String atrib){
        System.out.println("Select the index of the" + atrib + " to replace");
        System.out.println("or -1 to annex it to the list, if empty enter any number");

        General_imp construct_gen = new General_imp();
        short placeholder = 0; // Allow
        int ans = construct_gen.input(placeholder);
        return ans;
    }

} // END of class
