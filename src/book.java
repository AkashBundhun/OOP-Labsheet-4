
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author corei5
 */
public class book  implements Serializable{
    private String title;
    private String author;
    private int year;
    private String ISBN;
    private double cost;

    public book(String title, String author, int year, String ISBN, double cost) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return ( title + " " + author + " " + year + " " + ISBN + " " + "Rs "+cost );
    }        
 }
