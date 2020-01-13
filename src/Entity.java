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
public class Entity implements Entity_ {
    
    String name1;
    
    LinkedList ss=new LinkedList<Student_>();
    public void addstudent(String n1,String e1,String h1,String d1)
    {
        Student st =new Student(n1,e1,h1,d1);
        ss.add (st);
    }
    Entity(String s){
        name1=s;
    }
    @Override
    public String name() {
    return name1;
    }

    @Override
    public Iterator<Student_> studentList() {
        return ss.positions2();
    }
    
     
}
