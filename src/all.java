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
public class all {
    public LinkedList<Hostel> allHostel=new LinkedList<Hostel>();
    public LinkedList<Department> allDepartments=new LinkedList<Department>();
    public LinkedList<Course> allCourses=new LinkedList<Course>(); 
    public LinkedList<Student> allStudents=new LinkedList<Student>();
    public boolean existsStudent(String n1)
    {
        Iterator it = allStudents.positions2();
        while(it.hasNext())
        {
            Student h=(Student)it.next();
            if(h.e.equals(n1))
                return true;    
        }
        return false;
    }
    public boolean existsHostel(String n){
    Iterator it=allHostel.positions2();
    while(it.hasNext())
    {
    Hostel h=(Hostel)it.next();
    if(h.name1.equals(n))
        return true;
    }
    return false;
    }
    public boolean existsDept(String n){
    Iterator it=allDepartments.positions2();
    while(it.hasNext())
    {
    Department h=(Department)it.next();
    if(h.name1.equals(n))
        return true;
    }
    return false;
    }
    public boolean existsCourse(String n){
    Iterator it=allCourses.positions2();
    while(it.hasNext())
    {
    Course h=(Course)it.next();
    if(h.name1.equals(n))
        return true;
    }
    return false;
    }
    public Student returnStudent(String st)
    {
        Iterator it=allStudents.positions2();
        while(it.hasNext())
    {
    Student h=(Student)it.next();
    if(h.e.equals(st))
        return h;
    }
    return null;
        
    }
    public Hostel returnHostel(String hn){
     Iterator it=allHostel.positions2();
    while(it.hasNext())
    {
    Hostel h=(Hostel)it.next();
    if(h.name1.equals(hn))
        return h;
    }
    return null;
       
    }
    public Department returnDepartment(String hn){
     Iterator it=allDepartments.positions2();
    while(it.hasNext())
    {
    Department h=(Department)it.next();
    if(h.name1.equals(hn))
        return h;
    }
    return null;
       
    }
    public Course returnCourses(String cr){
    Iterator it=allCourses.positions2();
    while(it.hasNext())
    {
    Course h=(Course)it.next();
    if(h.name1.equals(cr))
        return h;
    }
    return null;
    
    }
}
