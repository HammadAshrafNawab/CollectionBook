/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aoopbookhammad;
import java.util.*;
/**
 *
 * @author student
 */
public class Book {
    int id;
String name,author,publisher;
int quantity;
public Book()
{
    
}
public Book(int id, String name, String author, String publisher, int quantity) {
this.id = id;
this.name = name;
this.author = author;
this.publisher = publisher;
this.quantity = quantity;
}

   
}