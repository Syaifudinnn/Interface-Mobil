
package interfaceCar;

public class Avanza implements Car{
    
    private int speed;
    private boolean isCarOn;
    
    public Avanza(){
        this.speed = 40;
    }
    
    public void startEngine(){
        isCarOn = true;
        System.out.println("Engine On");
        System.out.println("Welcome to Avanza Veloz");
    }
    
    public void stopEngine(){
        isCarOn = false;
        System.out.println("Engine Off");
    }
    
    public void speedUp(){
        if (isCarOn){
            if (this.speed == top_speed){
                System.out.println("TOP SPEED HAS REACHED");
                System.out.println("Speed : " + this.getSpeed() + "Km/h");
            }
            else{
                this.speed += 10;
                System.out.println("Speed now : " +getSpeed());
            }
        }
        
        else {
            System.out.println("Turn On the Engine");
        }
    }
    
    public void speedDown(){
        if (isCarOn){
            if (this.speed == min_speed){
                System.out.println("Speed : 0 Km/h");
            }
            else{
                this.speed -= 10;
                System.out.println("Speed now : " +getSpeed());
            }
        }
        
        else {
            System.out.println("Turn On the Engine");
        }
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
}
