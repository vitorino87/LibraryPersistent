/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.entity;

import java.io.Serializable; 
import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table;
import javax.persistence.*;
 
@Entity 
@Table(name="books") 

//@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class Book implements Serializable{ 
     
   
   @Id 
   @GeneratedValue(strategy=GenerationType.IDENTITY) 
   @Column(name="id")
   private int id; 
   private String name; 
 
   public Book(){         
   } 
 
   public int getId() { 
      return id; 
   } 
 
   public void setId(int id) { 
      this.id = id; 
   } 
 
   public String getName() { 
      return name; 
   } 
public void setName(String name) { 
      this.name = name; 
   }     
} 