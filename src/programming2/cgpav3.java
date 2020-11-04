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
public class cgpav3 {
     public  void printCgpa(String arg[])
  {
     int n=5;
 
     double m[]=new double[n];
 
     double g[]=new double[n];
 
     double cgpa,sum=0;
 
     m[0]=3.52;
 
     m[1]=3.65;
 
     m[2]=2.82;
 
     m[3]=3.81;
 
     m[4]=3.99;
 
     for(int i=0;i<n;i++)
     {
       g[i]=(m[i]/10);
     }
 
     for(int i=0;i<n;i++)
     {
        sum+=g[i];
     }
 
     cgpa=sum/n;
 
     System.out.println("cgpa="+cgpa);
 
     System.out.println("percentage from cgpa="+cgpa*9.5);
 
   }
}
