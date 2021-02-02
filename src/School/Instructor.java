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
public class Instructor extends Person {

    Lecture lectures;

    public Instructor(int id, String name, Date dateOfBirth, char gender, Lecture lectures) {
        super(id, name, dateOfBirth, gender);
        this.lectures = lectures;
    }

}
