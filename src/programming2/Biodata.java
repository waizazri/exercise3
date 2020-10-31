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
    public void printBiodatas() {
        System.out.println("Name  :  Muhamad Waiz Bin Azri");
        //Cara nak panggil class dari luar
        birthday s = new birthday();
        System.out.println("Birthday  : " + s.birth);
        System.out.println("Day : " + s.day);
        //Cara nak panggil class dari luar
        System.out.println("Gender  : Male");
        System.out.println("Age  : 22");
        System.out.println("Citizenship  : Malaysia");
        System.out.println("Home Address : No 38 Jalan Sungai Long 32/132, Selangor");
        System.out.println("HP  : +601156208537");
        System.out.println("Exam Result (STIA1113) : Transfered Credit");
        System.out.println("Language  :\n1) Malay\n2) English");
        System.out.println("Awards & Certificates  : Diploma In Multimedia");// TODO code application logic here
    }
    
}
