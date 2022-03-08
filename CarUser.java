
package interfaceCar;

public class CarUser {
    
    private Car car;
    
    public CarUser (Car car){
        this.car = car;
    }
    
    void turnOnTheCar(){
        this.car.startEngine();
    }
    
    void turOffTheCar(){
        this.car.stopEngine();
    }
    
    void makeCarFaster(){
        this.car.speedUp();
    }
    
    void makeCarSlower(){
        this.car.speedDown();
    }
    
}
