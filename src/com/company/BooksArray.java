package com.company;

public class BooksArray {
    private int size=0;
    private int capacity;
    private Book[] books = new Book[capacity];

    public BooksArray(Book[] books){
        this.books=books;
    }

    public BooksArray(int capacity){
        this.capacity=capacity;
        books=new Book[capacity];
    }

    public void add(Book book){
        if(books!=null) {
            if (size < capacity) {
                books[size] = book;
                size++;
            } else {
                capacity = books.length * 2;
                Book[] books1 = new Book[capacity];
                for (int i = 0; i < books.length; i++) {
                    books1[i] = books[i];
                }
                books1[size] = book;
                books = books1;
                size++;
            }
        }
    }

    public void add(Book[] books){
        if (books!=null) {
            for (Book book : books) {
                add(book);
            }
        }
    }

    public void print(){
        System.out.println(this.toString());
    }

    public Book getBook(int index){
        if((index>=size)||(index<0)){
            return null;
        }
        return books[index];
    }

    public int getSize() {
        return size;
    }

    public String toString(){
        String res="";
        for(int i=0;i<size;i++){
            res+=books[i].toString()+'\n';
        }
        return res+"\n capacity:"+books.length +"\n size:"+size;
    }

}
