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
public class  workskills {
    
 
    String skill;
    String language;
    workskills(){
        
     
     this.skill = "Skills  : \n1)Adobe Illustrator \n2)Photographer \n3)Adobe Premier \n4)C++ & Java"; 
     this.language ="Languages  :\n1)Bahasa Melayu \n2)English";
}
    workskills(String x, String y){
        this.skill = x;
        this.language = y;
    }

     public void printworkskills(){
    System.out.println("Skills :"+ skill );
     System.out.println("Languages  :"+ language);
     }
}