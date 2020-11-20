
package protonKu;


public class ProtonGen {
    private String lamp, windows, tyre;
    
    public void setLamp(String newLamp){
        lamp = newLamp;
    }
    
    public String getLamp(){
        return lamp;
    }
    
    public void setWindows(String newWindows){
        windows = newWindows;
    }
    
    public String getWindows(){
        return windows;
    }
    
    public void setTyre(String newTyre){
        tyre = newTyre;
    }
    
    public String getTyre(){
        return tyre;
    }
    
    ProtonGen(){
        this.windows = "Auto";
        this.lamp ="LED";
        this.tyre ="Dunlop";
    }
    
    public void windows(){
        System.out.println("Windows type  :"+windows);
    }
    
    public void lamp(){
        System.out.println("Lamp type  :"+lamp);
    }
    
    public void tyre(){
        System.out.println("Tyre type  :"+tyre);
    }
    public void printProtonGen(){
        System.out.println("Windows type  :"+windows);
        System.out.println("Lamp type  :"+lamp);
        System.out.println("Tyre brand  :"+tyre);
    }
}
