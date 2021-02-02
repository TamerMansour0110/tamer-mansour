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
public class SClass {

    private int id;
    private ArrayList<Table> table;
    private int roomNumber;
    private ArrayList<Book> books;
    private ArrayList<Student> students;//dic
    private String classManager;
    private int arrayTabel;
    private int arrayStudent;
    private int arrayBook;

    public SClass(int id, int roomNumber, String classManager) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.classManager = classManager;
        table = new ArrayList<Table>();
        arrayTabel = 0;//inish
        books = new ArrayList<Book>();
        arrayBook = 0;
        students = new ArrayList<Student>();
        arrayStudent = 0;
    }

    public void addTable(Table TaBle) {
        table.add(TaBle);
    }

    public void addBook(Book BOok) {
        books.add(BOok);
    }

    public void addStudent(Student sTudent) {

        students.add(sTudent);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int roomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public ArrayList<Table> getTabel() {

        return table;
    }

    public void setTable(ArrayList<Table> table) {
        this.table = table;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;

    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudent(ArrayList<Student> Students) {
        this.students = Students;
    }

    public String getClassManager() {
        return classManager;
    }

    public void setClassManager(String classManager) {
        this.classManager = classManager;
    }

    public String toString() {
        return "  School Class ID is : " + id + "," + " RoomNumber : " + roomNumber + ".";
    }
}
