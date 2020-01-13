/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author piyush
 */
public class GradeInfo implements GradeInfo_ {
    GradeInfo_.LetterGrade gr;
    public GradeInfo(GradeInfo_.LetterGrade gr1)
    {
        gr=gr1;
    }
    public LetterGrade grade()
    {
        return gr;
    }
}
