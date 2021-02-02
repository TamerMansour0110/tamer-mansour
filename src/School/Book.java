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
class Book {

    private int id;
    private String name;
    private String authorName;
    private int numberOfPages;
    private int releaseYear;

    public Book(int id, String name, String authorName, int numberOfPages, int releaseYear) {

        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String toString() {
        return " Book ID is : " + id + "," + " Number Of Pages : " + numberOfPages + " Release Year : " + releaseYear + ".";
    }

}
