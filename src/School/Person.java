/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School;

import java.util.Date;

/**
 *
 * @author tm2
 */
public class Person {

    private int id;//
    private String name;
    private Date dateOfBirth;
    private char gender;

    /**
     *
     * @param id
     * @param name
     * @param dateOfBirth
     * @param gender
     */
    public Person(int id, String name, Date dateOfBirth, char gender) {

        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return " Name is : " + name + " (" + gender + ") " + "Date Of Birth is : " + getDateOfBirth() + ".";
    }

}
