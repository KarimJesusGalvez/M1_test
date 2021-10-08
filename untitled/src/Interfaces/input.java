package Interfaces;

public interface input extends print_options{

    /*
    Always use input(String[])
     */
    // TODO Change all String input() to String[] input(1)

    public String input();

    public String[] input(int length); // Not used
    public String[] input(String[] print_pattern);

}
