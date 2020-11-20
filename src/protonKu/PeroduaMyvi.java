
package protonKu;


public class PeroduaMyvi extends CarGeneric {
    String antenna, sidemirrors;
    
    PeroduaMyvi(){
        this.antenna ="Shark Fin Antenna";
        this.sidemirrors ="Retractable Side Mirrors with Turn Signals";
    }
    
    public void antenna(){
        System.out.println("Antenna type  :"+antenna);
    }
    
    public void sidemirrors(){
        System.out.println("Side Mirrors type  :"+sidemirrors);
    }
    public void printPeroduaMyvi(){
        System.out.println("Antenna type  :"+antenna);
        System.out.println("Side Mirrors type  :"+sidemirrors);
    }
}
