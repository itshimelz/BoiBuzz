
package model;

import javax.swing.Icon;

public class BookModel {
    
    private int bookID;
    private String bookName;
    private String writerName;
    private String publicationName;
    private double price;
    private Icon image;

    public BookModel(int bookID, String bookName, String writerName, String publicationName, double price, Icon image) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.writerName = writerName;
        this.publicationName = publicationName;
        this.price = price;
        this.image = image;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }
    
}
