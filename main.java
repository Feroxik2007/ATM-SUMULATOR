import java.util.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sigma;
        Integer[] pin = {1234, 5678, 9876, 5432};
        System.out.println("Dobry den, vita vas bankomat!");
        System.out.println("Vlozte kartu: ano/nie  ");
        String vlozitKartu = scanner.nextLine();

        if (vlozitKartu.equals("ano")) {
            System.out.println("Zadajte vas pin: ");
            int pinn = scanner.nextInt();
            if (pinn == pin[1]) {
                System.out.println("Vita vas vasa banka vas zostatok je 1000€");
                System.out.println("Chcete vybrat peniaze: ano/nie");
                String vybratPeniaze = scanner.next();
                if (vybratPeniaze.equals("ano")) {  

                    System.out.println("Kolko eur si prajete vybrat?");
                    int vyber = scanner.nextInt();
                    if (vyber > 1000) {
                        System.out.println("Nemate dostatok penazi na ucte");
                    }

                    else {
                        System.out.println("Vas zostatok je: " + (1000 - vyber) + "€");
                        System.out.println("Dakujeme za vyber penazi");
                        System.out.println("Chcete este s niecim pomoct? ano/nie");
                        String pomoc = scanner.next();
                        if (pomoc.equals("ano")){
                            System.out.println("Tu su moznosti: 1. Vlozenie penazi, 2. Ukazat zostatok");
                             sigma = scanner.nextInt();
                                if (sigma == 1) {
                                    System.out.println("Kolko si prajete vlozit?");
                                    int vlozitt = scanner.nextInt();
                                    System.out.println("Vas zostatok je: " + (1000 - vyber + vlozitt) + "€");}
                                     else if (sigma == 2) {
                                        System.out.println("Vas zostatok je: " + (1000 - vyber) + "€");
                                }
                        }
                    }
                if (vlozitKartu.equals("nie")){
                    System.out.println("Dovidenia!");
                }
                
                }
            }
        }

        
    }
    
    private static void karta() {
        
    }
}    

