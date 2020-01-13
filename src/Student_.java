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
public interface Student_ {
   public String name();               	// Returns student's name
   public String entryNo();            	// Returns student's entry number
   public String hostel();             	// Returns student's hostel name
   public String department();         	// Returns student's department name
   public String completedCredits();   	// Returns student's credits earned
   public String cgpa();   		// Returns student's cgpa until the previous semester
   public Iterator<CourseGrade_> courseList();// Returns an iterator for all courses for this student
					      // including those in the current semester	
}
