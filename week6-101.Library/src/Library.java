/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
import java.util.ArrayList;
import java.io.*;

public class Library {
    private ArrayList<Book> books = new ArrayList();
    
    public Library(){}
    
    public void addBook(Book newBook){
        books.add(newBook);
    }
    
    public void printBooks(){
        for(Book b : books){
            System.out.println(b.toString());
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> sbt = new ArrayList();
        for(Book bo : books){
            if(StringUtils.included(bo.title(), title) == true) {
                sbt.add(bo);
        }
       
    }
         return sbt;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> sbp = new ArrayList();
        for(Book bo : books){
            if(StringUtils.included(bo.publisher(), publisher) == true) {
                sbp.add(bo);
        }
        
    }
        return sbp;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> sby = new ArrayList();
        for(Book bo : books){
            if(bo.year() == year)
                sby.add(bo);
        }
        return sby;
    }
    
    
    
}
