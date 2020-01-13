/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Iterator;

public interface Entity_ { // Entities Classes Hostel, Dept, and Course all have this functionality. 
   public String name();                 // Returns this  entity's name
   public Iterator<Student_> studentList();        // Returns all students of this entity
}
/**
 *
 * @author piyush
 */
