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
public class Biodata {
    String Name;
    String Gender;
    String Age;
    String Citizenship;
    String HomeAddress;
    String Hp;
    String ExamResult;
    String Award;
    
    Biodata(){
        this.Name ="Muhamad Waiz Bin Azri";
        this.Gender ="Male";
        this.Age ="22";
        this.Citizenship ="Malaysia";
        this.HomeAddress ="No 38 Jalan Sungai Long 32/132, Selangor";
        this.Hp ="+601156208537";
        this.ExamResult ="Transferred Credit";
        this.Award ="Diploma In Multimedia";
    }
    public void printBiodatas() {
        System.out.println("Name  :"+Name);
        //Cara nak panggil class dari luar
        birthday s = new birthday();
        System.out.println("Birthday  : " + s.birth);
        System.out.println("Day : " + s.day);
        //Cara nak panggil class dari luar
        System.out.println("Gender  : "+Gender);
        System.out.println("Age  :"+Age);
        System.out.println("Citizenship  :"+Citizenship);
        System.out.println("Home Address :"+HomeAddress);
        System.out.println("HP  :"+Hp);
        System.out.println("Exam Result (STIA1113) :"+ExamResult);
        System.out.println("Awards & Certificates  :"+Award);// TODO code application logic here
    }
    
}
