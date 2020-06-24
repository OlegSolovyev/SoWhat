package com.company;

public class Main {
    public static void main(String[] args) {

    Author a1=new Author("George", "Martin");
    Author a2=new Author("Someone Unknown");
    Author a3=new Author("Don't Care");
	Book b1= new Book("Hobbit","Adventure", new Author("John R.R.Tolkien"),234567);
	Book b2= new Book("Hamlet","Tragedie", new Author("William","Shakespear"),234568);
	Book b3= new Book("???","None",new Author[] {a2,a3} ,234569);
	Book b4= new Book("Hobbit","Adventure", new Author("John R.R.Tolkien"),234570);

	Book[] books=new Book[]{b1,b2,b3,b4};

	BooksArray booksArray = new BooksArray(10);
	booksArray.print();

	for(int i=0;i<books.length;i++){
        System.out.println(books[i].toString());
    }

		System.out.println("==========================================");
	BooksArray booksArray1 = new BooksArray(100);
	booksArray1.add(b1);
	//booksArray1.print();
	booksArray1.add((b3));
	//booksArray1.print();
	booksArray1.add(b1);
	booksArray1.add(b1);
	booksArray1.add(b1);
	booksArray1.add(b1);
	booksArray1.add(b1);
	booksArray1.add(b1);
	booksArray1.add(b1);
		booksArray1.print();
		System.out.println(booksArray1.getBook(2).toString());
	Author[] authors= new Author[]{a1,a2,a3};
    }
}
