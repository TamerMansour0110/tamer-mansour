/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School;

/**
 *
 * @author tm2
 */
public class Lecture {

    private int id;
    private String name;
    private SClass sClass;
    private Book book;
    private int periods;

    public Lecture(int id, String name, SClass sClass, Book book, int periods) {

        this.id = id;
        this.name = name;
        this.sClass = sClass;
        this.book = book;
        this.periods = periods;
    }

    public int getId() {
        return id;
    }

    public int getPeriods() {
        return periods;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPeriods(int periods) {
        this.periods = periods;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return " Book ID is : " + id + "," + " periods : " + periods + ".";
    }
}
