/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author piyush
 */
public interface Position_<T> {// Supports any class T
   public T value();          // Return value at position
   public Position_<T> after();// Returns the position after this position in its list
}



