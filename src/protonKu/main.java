
package protonKu;


public class main {
    
    public static void main(String[] args){
        
        //ChooseCarColor Section (POLYMORPHISIM wihthout EXTEND but use same method 'CarColor()' )
        Color1 c1 = new Color1();
        Color2 c2 = new Color2();
        Color3 c3 = new Color3();
       //--------------------------
        
        CarGeneric a = new CarGeneric();
        System.out.println("                                                     This Is Car Generic Section");
        a.windows();
        a.lamp();
        a.tyre();
       
        System.out.println("                                                     This Is Perodua Myvi Section");
        
        PeroduaMyvi b = new PeroduaMyvi();
        //Encapsulation Authorized for LAMP
        b.setLamp("MYVI LED  LIGHT");

        b.windows();
        b.lamp();
        b.tyre();
        b.antenna();
        b.sidemirrors();
        System.out.println("Lamp type (Encapsulation)  :"+b.getLamp());
        c1.CarColor();
        
        System.out.println("                                                     This Is Proton Wira Section");
        ProtonWira c = new ProtonWira();
        //Encapsulation Authorized for TYRE
        c.setTyre("Michelin");
        c.windows();
        c.lamp();
        c.tyre();
        c.topspeed();
        c.acceleration();
        System.out.println("Tyre type (Encapsulation)  :"+c.getTyre());
        c2.CarColor();
    }
}
