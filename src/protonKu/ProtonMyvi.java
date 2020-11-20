
package protonKu;


public class ProtonMyvi extends ProtonGen {
    String antenna, sidemirrors;
    
    ProtonMyvi(){
        this.antenna ="Shark Fin Antenna";
        this.sidemirrors ="Retractable Side Mirrors with Turn Signals";
    }
    
    public void printProtonMyvi(){
        System.out.println("Antenna type  :"+antenna);
        System.out.println("Side Mirrors type  :"+sidemirrors);
    }
}
