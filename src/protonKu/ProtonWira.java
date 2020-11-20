
package protonKu;


public class ProtonWira extends CarGeneric{
    int topspeed;
    double acceleration;
    
    ProtonWira(){
        this.topspeed = 185;
        this.acceleration = 12.1;
    }
    
    public void topspeed(){
        System.out.println("Topspeed  :"+topspeed +" Km/h");
    }
    
    public void acceleration(){
        System.out.println("Acceleration  :"+acceleration +"s");
    }
            
}
