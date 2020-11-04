/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming2;

/**
 *
 * @author USER
 */
public class cgpav2 {
    double cgpa;
    double[] gpa = new double[4];
    double sum;
    double finalCgpa;
    
    cgpav2()
    {
        this.cgpa = 2.16;
        this.gpa = new double[] {3.62,3.58,3.99};
    }
    
    cgpav2(double   BioCGPA, double[] BioGPA)
    {
        this.cgpa = BioCGPA;
        this.gpa = BioGPA;
    }
    
    public void printCGPA()
    {
        System.out.println("CGPA            :" + finalCgpa);
    }
    
    public void printGPA()
    {
        for(int i = 0; i < gpa.length; i++)
        {
            System.out.println("Sem "+ (i+1) +"             :"+ gpa[i]);
        }   
    }
    
    public double calculateCGPA()
    {
        for(int i=0; i<gpa.length; i++)
        {
            sum+=gpa[i];
        }
        finalCgpa = sum/gpa.length;
        return finalCgpa;      
    
    }
}
