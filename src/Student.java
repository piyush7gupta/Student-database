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
public class Student implements Student_{
    String n,e,h,d;
    int credit=0;
    LinkedList<CourseGrade_> LL;
    Student(String n,String e,String h,String d){
        this.LL = new LinkedList<CourseGrade_>();
    this.n=n;
    this.e=e;
    this.h=h;
    this.d=d;
    
    }
    public void addcourse(GradeInfo_ gi,String cn,String ct){
        CourseGrade cm=new CourseGrade(ct,cn,gi);

        LL.add(cm);
    }
    @Override
    public String name() {
    return n;    
    }
    @Override
    public String entryNo() {
    return e;    
    }
    @Override
    public String hostel() {
    return h;    
    }
    
    @Override
    public String department() {
    return d;
    }

    @Override
    public String completedCredits() {

    Iterator it1=courseList();
    int a=0;
    while(it1.hasNext())
    {
        
         CourseGrade st1=(CourseGrade)it1.next();
         double val=GradeInfo_.gradepoint(st1.grade().grade());
    
           if(val!=0)
               a+=3;
        
    }
    return ""+a;
    }

    @Override
    public String cgpa() {
     
     Iterator it1=courseList();
     int a=0;
     double total=0;
     int b;
       while(it1.hasNext())
       {
           
           
           CourseGrade st1=(CourseGrade)it1.next();
           double val=GradeInfo_.gradepoint(st1.grade().grade());
           total+=val;
           if(st1.grade().grade().equals(GradeInfo_.LetterGrade.I))
           {}
           else
               a++;
           
       }
       total*=100;
      
        if(a!=0)
       total/=a;
         total+=0.5;
       b=(int)total;
       total=b/100.0;
      
       
       
       return ""+total;
    }

    //@Override
    

    @Override
    public Iterator<CourseGrade_> courseList() {
    return (Iterator<CourseGrade_>)LL.positions2();
    }
     
    {
        
    }
    
    
    
}
