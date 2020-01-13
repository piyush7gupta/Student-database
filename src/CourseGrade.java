/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 
 * @author piyush
 */
public class CourseGrade implements CourseGrade_ {
    String Title;
    String num;
    GradeInfo_ gr;
    CourseGrade(String t,String n,GradeInfo_ g){
    Title=t;
    num=n;
    gr=g;
    }
    @Override
    public String coursetitle() {
        return Title;
    }

    @Override
    public String coursenum() {
        return num;
    }

    @Override
    public GradeInfo_ grade() {
        return gr;
    }

    
}
