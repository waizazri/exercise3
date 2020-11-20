
package protonKu;


public class main {
    
    public static void main(String[] args){
    
        ProtonGen a = new ProtonGen();
        a.setWindows("Auto Windows");
        a.setLamp("LED LIGHT");
        a.setTyre("Original Brand Tyre");
        System.out.println("This Is Proton Generic Section");
        System.out.println("Windows type (Encapsulation)  :"+a.getWindows());
        
        //no Encapsulation
        a.printProtonGen();
        
        
    }
}
