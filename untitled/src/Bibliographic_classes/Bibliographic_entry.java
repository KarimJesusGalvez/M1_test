package Bibliographic_classes;

import java.util.ArrayList;
import java.util.List;
import Implementations.*;

public class Bibliographic_entry {

    private String type;
    private String format;
    private String title;
    private String language;
    private String genre;
    private String length;
    private String date_published;
    private String main_author;
    private List<String> secondary_authors = new ArrayList<String>();


    /**
     * empty constructor
     * Assigns
     *      type;
     *      format;
     *      title;
     *      main_author;
     *      secondary_authors;
     */
    public Bibliographic_entry(String type){

        General_imp construct_gen = new General_imp();
        String[] input_print ={"format","title","language","main author","genre","length","date_published"};
        String[] ans_array = construct_gen.input(input_print);
        this.type = type;
        this.format = ans_array[0];
        this.title = ans_array[1];
        this.language = ans_array[2];
        this.main_author = ans_array[3];
        this.genre = ans_array[4];
        this.length = ans_array[5];
        this.date_published = ans_array[6];
        set_array("secondary_author");
    }

    public void set_array(String type) {
            // Calls >> setatribs >> setter
            while (true){

                General_imp construct = new General_imp();

                construct.print_type(type);
                String ans = construct.input();
                if (ans.equals("EXIT"))
                    break;
                setatribs(ans, type);
            }
        }

    /**
     * Empty constructor
     */
    public Bibliographic_entry(){

    }

    public void print_atrib() {
        String atribs = toString();
        String[] temp_array = atribs.split(";");
        for (int count = 0; count < temp_array.length;count++){
            System.out.println(temp_array[count]);
        }
    }

    /**
     * Overrides the print location in memory method
     * Use split(",") to print in lines
     */
    @Override
    public String toString() {
        return "Bibliographic_entry{" +
                "; type='" + type + '\'' +
                "; format='" + format + '\'' +
                "; title='" + title + '\'' +
                "; language='" + language + '\'' +
                "; genre='" + genre + '\'' +
                "; length='" + length + '\'' +
                "; date_published='" + date_published + '\'' +
                "; main_author='" + main_author + '\'' +
                "; secondary_authors=" + secondary_authors +
                '}';
    }

    public void setType(String type) {
        this.type = type;}
    public void setFormat(String format) {
        this.format = format;}
    public void setTitle(String title) {
        this.title = title;}
    public void setLanguage(String language) {
        this.language = language;}
    public void setMain_author(String main_author) {
        this.main_author = main_author;}
    public void setGenre(String genre) {
        this.genre = genre;}
    public void setLength(String length) {
        this.length = length;}
    public void setDate_published(String date_published) {
        this.date_published = date_published;}

    /**
     * Simple iter to add secondary authors
     * Examples: ilustrator
     * @param author
     */
    public void setSecondary_authors(String author) {

        General_imp construct_gen = new General_imp();

            System.out.println(secondary_authors);
            General_imp gen_construct = new General_imp();

            String atrib = "secondary_author";
            int ans = gen_construct.print_mod_array(atrib);
            if (ans >= 0 && ans < this.secondary_authors.size())
                this.secondary_authors.remove(ans);
            this.secondary_authors.add(author);
        }

    /**
     * Sets the new value for the atribute passed as arg
     * @param atrib new value of the atrib
     * @param type type of atribute to change
     */
    public void setatribs(String atrib, String type) {
        if (type.toLowerCase().contains("genre"))
            setGenre(atrib);
        else if (type.toLowerCase().contains("length"))
            setLength(atrib);
        else if (type.toLowerCase().contains("format"))
            setFormat(atrib);
        else if (type.toLowerCase().contains("date_published"))
            setDate_published(atrib);
        else if (type.toLowerCase().contains("title"))
            setTitle(atrib);
        else if (type.toLowerCase().contains("main"))
            setMain_author(atrib);
        else if (type.toLowerCase().contains("language"))
            setLanguage(atrib);
        else if (type.toLowerCase().contains("secondary_author"))
            setSecondary_authors(atrib);
        else
            System.out.println("No change made in parent's attributes");
    }
} // END class bibliographic entry
