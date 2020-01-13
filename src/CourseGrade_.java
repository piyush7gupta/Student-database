/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author piyush
 */
public interface CourseGrade_ {		// Tuple of course and grade
   public String coursetitle();   	 // Returns course title 
   public String coursenum();   	 // Returns course code, e.g., COL106 
   public GradeInfo_ grade();   	 // Returns student's letter grade
}
