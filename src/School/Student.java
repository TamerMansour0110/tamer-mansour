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
public class Student extends Person {

    SClass sClass;

    public Student(int id, String name, Date dateOfBirth, char gender, SClass sClass) {
        super(id, name, dateOfBirth, gender);
        this.sClass = sClass;
    }

}
