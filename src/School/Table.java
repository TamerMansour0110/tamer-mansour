/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School;

import java.util.ArrayList;

/**
 *
 * @author tm2
 */
public class Table {

    private int id;
    private ArrayList<Lecture> lectures;
    private SClass sClass;
    private int arraylecture;

    public Table(int id, SClass sClass) {

        this.id = id;
        this.sClass = sClass;

        lectures = new ArrayList<Lecture>();
        arraylecture = 0;
    }

    public void addLectures(Lecture lecTures) {
        lectures.add(lecTures);
    }

    public int getId() {
        return id;
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public SClass getSClass() {
        return sClass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLectures(ArrayList<Lecture> lecture) {
        this.lectures = lecture;
    }

    public void setSClass(SClass sClass) {
        this.sClass = sClass;
    }

    public String toString() {
        return " Tabel ID is : " + id + "," + " Lecture : " + lectures + "," + "School Class : " + sClass + ".";
    }

}
