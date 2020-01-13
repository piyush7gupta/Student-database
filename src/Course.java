/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author piyush
 */
public class Course extends Entity{
    String subname;
    public Course(String s,String r) {
        super(s);
        subname=r;
    }
    public String Sub()
    {
        return subname;
    }
    
}
