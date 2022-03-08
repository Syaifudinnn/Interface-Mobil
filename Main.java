
package interfaceCar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String mobil;
        int aksi;
        
        System.out.println("Daftar Mobil : ");
        System.out.println("- Avanza");
        System.out.println("- Esemka");
        System.out.println("- Tesla");
        System.out.println("- Lamborghini");
        System.out.println("");
        System.out.print("Masukkan mobil yang akan digunakan : ");
        Scanner input = new Scanner (System.in);
        mobil = input.nextLine();
        
        if (mobil.equalsIgnoreCase("Esemka")) {
            
            Car EsemkaGaruda = new Esemka();
            CarUser Adn = new CarUser(EsemkaGaruda);
            
            Adn.turnOnTheCar();
        
        while (true){
            System.out.println("=== CAR SYSTEM ===");
            System.out.println("[1] Nyalakan Mobil");
            System.out.println("[2] Matikan Mobil");
            System.out.println("[3] Tambah kecepatan");
            System.out.println("[4] Kurangi kecepatan");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();

            switch(aksi){
                case 1:
                    Adn.turnOnTheCar();
                    break;
                case 2:
                    Adn.turOffTheCar();
                    break;
                case 3:
                    Adn.makeCarFaster();
                    break;
                case 4:
                    Adn.makeCarSlower();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Anda memilih aksi yang salah");
                    break;
            }
        }
    }
        
        else if (mobil.equalsIgnoreCase("Avanza")) {
            
            Car Veloz = new Avanza();
            CarUser Syaif = new CarUser(Veloz);
            
            Syaif.turnOnTheCar();
        
        while (true){
            System.out.println("=== CAR SYSTEM ===");
            System.out.println("[1] Nyalakan Mobil");
            System.out.println("[2] Matikan Mobil");
            System.out.println("[3] Tambah kecepatan");
            System.out.println("[4] Kurangi kecepatan");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();

            switch(aksi){
                case 1:
                    Syaif.turnOnTheCar();
                    break;
                case 2:
                    Syaif.turOffTheCar();
                    break;
                case 3:
                    Syaif.makeCarFaster();
                    break;
                case 4:
                    Syaif.makeCarSlower();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Anda memilih aksi yang salah");
                    break;
            }
        }
    }
        else if (mobil.equalsIgnoreCase("Lamborghini")) {
            
            Car Aventador = new Lamborghini();
            CarUser Udin = new CarUser(Aventador);
            
            Udin.turnOnTheCar();
        
        while (true){
            System.out.println("=== CAR SYSTEM ===");
            System.out.println("[1] Start Engine");
            System.out.println("[2] Stop Engine");
            System.out.println("[3] Speed Up");
            System.out.println("[4] Speed Down");
            System.out.println("[0] Exit");
            System.out.println("--------------------------");
            System.out.print("Pilh aksi> ");
            aksi = input.nextInt();

            switch(aksi){
                case 1:
                    Udin.turnOnTheCar();
                    break;
                case 2:
                    Udin.turOffTheCar();
                    break;
                case 3:
                    Udin.makeCarFaster();
                    break;
                case 4:
                    Udin.makeCarSlower();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Anda memilih aksi yang salah");
                    break;
            }
        }
    }
        else if (mobil.equalsIgnoreCase("Tesla")) {
            
            Car X = new Tesla();
            CarUser Ahmad = new CarUser(X);
            
            Ahmad.turnOnTheCar();
        
        while (true){
            System.out.println("=== CAR SYSTEM ===");
            System.out.println("[1] Start Engine");
            System.out.println("[2] Stop Engine");
            System.out.println("[3] Speed Up");
            System.out.println("[4] Speed Down");
            System.out.println("[0] Exit");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();

            switch(aksi){
                case 1:
                    Ahmad.turnOnTheCar();
                    break;
                case 2:
                    Ahmad.turOffTheCar();
                    break;
                case 3:
                    Ahmad.makeCarFaster();
                    break;
                case 4:
                    Ahmad.makeCarSlower();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your answer is incorrect");
                    break;
            }
        }
    }
        else{
            System.out.println("ANDA SALAH MEMASUKKAN NAMA MOBIL!");
        }
}
}
