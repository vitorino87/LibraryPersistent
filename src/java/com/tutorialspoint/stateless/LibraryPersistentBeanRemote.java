/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;

import com.tutorialspoint.entity.Book; 
import java.util.List; 
import javax.ejb.Remote; 
 
@Remote 
public interface LibraryPersistentBeanRemote { 
 
   void addBook(Book bookName); 
 
   List<Book> getBooks(); 
     
} 
