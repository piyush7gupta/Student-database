/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Iterator;

/**
 *
 * @author piyush
 */
public interface LinkedList_<T> {// Supports any class T
   public Position_<T> add(T e);              // Add element e to this list, returns it position in the list
   public Iterator<Position_<T>>  positions();// Returns an iterator for all positions in the list
   public int  count();                      // Returns the number of elements in the list
}