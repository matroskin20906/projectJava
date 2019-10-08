package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	    Library x = new Library();
	    int i;
	    int k=0;
	    int booksCount=0;
	    String author;
	    String bookName;
	    int a;
	    do {
            System.out.println("Добавить книгу или взять? Если взять нажмите 1, если добавить 2");
            a = s.nextInt();
            if (a == 1) {
                if(booksCount!=0) {
                    for (i = 0; i < x.MAX_SIZE; i++) {
                        if (x.books[i] == null) {
                        } else {
                            System.out.println(x.books[i].bookName);
                            System.out.println(x.books[i].Author);
                            System.out.println(x.books[i].bookID);
                        }
                    }
                    System.out.println("какую книгу?");
                    a = s.nextInt();
                    x.take(a);
                    booksCount--;
                } else {
                    System.out.println("Книг нет!");
                }
            } else {
                System.out.println("введите параметры книги: название книги");
                bookName = s.next();
                System.out.println("введите параметры книги: автор");
                author = s.next();
                for (i = 0; i < x.MAX_SIZE; i++) {
                    if (x.books[i] == null) {
                        Book temp = new Book();
                        temp.Author = author;
                        temp.bookName = bookName;
                        x.add(temp);
                        booksCount++;
                        break;
                    }
                }
            }
            System.out.println("хотите закончить? введите 1");
            k = s.nextInt();
        } while(k!=1);
    }
}
