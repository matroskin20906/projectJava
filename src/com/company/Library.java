package com.company;

import java.util.Random;

public class Library {
    final int MAX_SIZE = 200;
    Random s= new Random();
    Book[]books = new Book[MAX_SIZE];
    private int i, j;
    void add(Book x){
       for(i=0; i<MAX_SIZE; i++){
           if(books[i]==null){
               books[i]=x;
               x.bookID = s.nextInt(200);
               break;
           }
       }
    }
    void take(int bookID){
        for(i=0; i<MAX_SIZE; i++){
            if(books[i].bookID==bookID){
                for(j=i+1;j<MAX_SIZE;j++){
                    books[j-1]=books[j];
                }
                break;
            }
        }
    }
}
