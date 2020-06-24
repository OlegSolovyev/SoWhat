package com.company;

public class Book {
    private String title;
    private String genre;
    private Author[] authors;
    private int id;

    public Book(String title, String genre, Author author, int id){
        this.title=title;
        this.genre=genre;
        this.authors = new Author[]{author};
        this.id=id;
    }

    public Book(String title, String genre, Author[] authors, int id){
        this.title=title;
        this.genre=genre;
        this.authors = authors;
        this.id=id;
    }

    public String toString(){
        return "\""+title+"\", "+ authorToString() +"   genre: "+genre+"   id: "+id;
    }

    private String authorToString(){
        String str="";
        for(int i=0; i<authors.length;i++){
            str+=authors[i].toString()+((i != authors.length-1)? "||": "");
        }
        return str;
    }

    public String getTitle() {
        return title;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public String getGenre() {
        return genre;
    }

    public int getId() {
        return id;
    }
}
