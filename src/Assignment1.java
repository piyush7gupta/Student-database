/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author piyush
 */

public class Assignment1 {
    static all obj=new all();
     
    private static void getData(String sr,String cf){
        FileReader fr; 
        try {
          
            fr = new FileReader(sr);
            BufferedReader rd=new BufferedReader(fr);
            String line=rd.readLine();
        
            String []words=line.split(" ");
            while(line!=null){
            if(obj.existsHostel(words[3]))
            { 
            }
            else
            {Hostel newH=new Hostel(words[3]);
                obj.allHostel.add(newH);
            }
            if(obj.existsDept(words[2]))
            {
            }
            else
            {Department newD=new Department(words[2]);
                obj.allDepartments.add(newD);
            }
            
            if(obj.existsStudent(words[0]))
            { }
            else
            {
                Student newS=new Student(words[1],words[0],words[3],words[2]);
                        obj.allStudents.add(newS);
            }
                
           
              Hostel h=obj.returnHostel(words[3]);
            h.addstudent(words[1], words[0], words[3], words[2]);
            
            Department d=obj.returnDepartment(words[2]);
            d.addstudent(words[1], words[0], words[3], words[2]);
            
      
              
   }
          
       
        fr=new FileReader(cf);
        rd=new BufferedReader(fr);
        line=rd.readLine();
        words=line.split(" ");
        String res=null;
        
            while(line!=null){
            if(obj.existsCourse(words[1])){}
            else
            {
                res=words[3];
                for(int i=4;i<words.length;i++)
                res=res+" "+words[i];
            Course newc=new Course(words[1],res);
            obj.allCourses.add(newc);
            }
            Course c=obj.returnCourses(words[1]);
            
            Student st = null;
            Iterator its=obj.allStudents.positions2();
            while(its.hasNext()){
                st=(Student)its.next();
                if(st.e.equals(words[0]))
                    break;
            }
            
            if(st!=null)
            {
            c.addstudent(st.n, st.e, st.h, st.d);
            
            }
            if(st!=null)
            {
                GradeInfo gr1;
                gr1=new GradeInfo(GradeInfo_.LetterGrade.valueOf(words[2]));
            st.addcourse(gr1, words[1], res);
            
            }
            line=rd.readLine();
            if(line!=null)
            words=line.split(" ");
            }
            
      
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!!!");
        } catch (IOException ex) {
            System.out.println("Invalid Line Encountered!!!");
        }
    
    }
    private static void answerQueries(String q){
        FileReader fr; 
        try {
          
            fr = new FileReader(q);
            BufferedReader rd=new BufferedReader(fr);
            String line=rd.readLine();
            String []words=line.split(" ");
            int cnt=0;
            while(line!=null)
            {
                cnt++;
                line=rd.readLine(); 
            }
            String qr[]=new String[cnt];
            fr = new FileReader(q);
            rd=new BufferedReader(fr);
            
           
            for(int i=0;i<cnt;i++)
            {
               line=rd.readLine();
               qr[i]=line;
               
            }
            for(int i=0;i<cnt;i++)
            {
                line=qr[cnt-i-1];
                 words=line.split(" ");
                if(words[0].equals("SHARE"))
                {
                    Iterator its=obj.allCourses.positions2();
                    Iterator its1=null;
                    Iterator its2=null;
                    boolean b= false;
                    while(!b && its.hasNext())
                    {
                        Course ha=(Course)its.next();
                        if(ha.name1.equals(words[2]))
                        {
                            b=true;
                            its1=ha.studentList();
                            its2=ha.studentList();
                        }
                    }
                    its=obj.allHostel.positions2();

                    while(!b && its.hasNext())
                    {
                        Hostel ha=(Hostel)its.next();
                         if(ha.name1.equals(words[2]))
                        {
                            b=true;
                            its1=ha.studentList();
                            its2=ha.studentList();
                        }
                         
                        
                    }
                    its=obj.allDepartments.positions2();
                    while (!b && its.hasNext())
                    {
                        
                        Department ha=(Department)its.next();
                        if(ha.name1.equals(words[2]))
                        {
                            b=true;
                            its1=ha.studentList();
                            its2=ha.studentList();
                        }
                    }
                    
                    int cnt2=0;boolean b2=false;
                    if(its1!=null)
                    while(its1.hasNext())
                    {

                        Student st1=(Student)its1.next();
                        if(st1.e.equals(words[1]))
                        {
                           b2=true;
                        }
                        else
                        {
                            cnt2++;
                        }
                        

                    }
                    if(cnt2!=0 && b2)
                    {
                    String ans[] =new String[cnt2];
                    int k=0;
                    
                    
                    while(its2.hasNext())
                    {
                        Student st1=(Student)its2.next();
                        if(st1.e.equals(words[1]))
                        {
                         
                        }
                        else
                        {
                            ans[k]=st1.e;
                            k++;
                        }
                        
                    }
                    
                    String ans1[]=new String[cnt2];
                    boolean b1=true;
                    while(b1)
                    {
                        int cnt3=0;
                        for(int j=0;j<cnt2-1;j++)
                        {
                            int aq=ans[j].compareTo(ans[j+1]);
                             if(aq>0)
                             {
                                
                                 String temp=ans[j];
                                 ans[j]=ans[j+1];
                                 ans[j+1]=temp;
                             }
                             else
                                cnt3++;
                             
                        }
                        if(cnt3==cnt2-1)
                            b1=false;
                   }
                    for(int j=0;j<cnt2;j++)
                        {
                            System.out.printf(ans[j]+" ");
                        }
                    }
                    System.out.println();
                  }
                if (words[0].equals("COURSETITLE"))
                {
                    Iterator its=obj.allCourses.positions2();
                    boolean b=false;
                    String sss;
                    Course ha=null;
                    while(!b && its.hasNext())
                    {
                        ha=(Course)its.next();
                        if(ha.name1.equals(words[1]))
                        {
                            b=true;
                            sss=ha.Sub();
                          }
                    }
                    if(b)
                      System.out.println(ha.Sub());
                    else
                        System.out.println();
                    
                }
                if (words[0].equals("INFO"))
                {
                    Iterator its=obj.allStudents.positions2();
                    boolean b=false;
                    Iterator its1=null;
                    Iterator its2=null;
                     Student ha=null;
                     int cnt2=0;
                    while(!b && its.hasNext())
                    {
                        ha=(Student)its.next();
                        its1=ha.courseList();
                        its2=ha.courseList();
                        if(ha.e.equals(words[1]) || ha.n.equals(words[1]) )
                          
                        {
                            b=true;
                         }
                    }
                    if(b)
                    {
                    while(its1.hasNext())
                    {
                        cnt2++;
                        CourseGrade st1=(CourseGrade)its1.next();
                    }
                    String ans[]= new String[cnt2];
                    GradeInfo_.LetterGrade ans1[]= new GradeInfo_.LetterGrade[cnt2];
                    int k=0;
                    while(its2.hasNext())
                    {
                        CourseGrade st1=(CourseGrade)its2.next();
                        ans[k]=st1.coursenum();
                       ans1[k]=st1.grade().grade();
                        k++;
                    }
                    boolean b1=true;
                    while(b1)
                    {
                      int cnt3=0;
                        for(int j=0;j<cnt2-1;j++)
                        { if(ans[j].compareTo(ans[j+1])>0)
                            {
                                 String temp=ans[j];
                                     ans[j]=ans[j+1];
                                     ans[j+1]=temp;
                                        GradeInfo_.LetterGrade temp1=ans1[j];
                                     ans1[j]=ans1[j+1];
                                     ans1[j+1]=temp1;
                         }
                            else 
                                cnt3++;
                        }
                        if(cnt3==cnt2-1)
                            b1=false;
                    }
                    System.out.printf(ha.e + " "+ha.n + " " + ha.d +" "+ha.h+" "+ha.cgpa() +" ");
                    for(int j=0;j<cnt2;j++)
                    {
                        System.out.printf(ans[j]+" "+ans1[j]+" ");
                    }
                    }
                        System.out.println();
                }
                    
            }
                
               
            
        
           } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!!!");
        } catch (IOException ex) {
            System.out.println("Invalid Line Encountered!!!");
        }
        
        
    }
    public static void main(String[] args){
        
        getData(args[0],args[1]);
        answerQueries(args[2]);
    }
}
