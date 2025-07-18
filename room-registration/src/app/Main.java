package app;

import java.util.Scanner;
import java.util.Locale;
import model.RoomManager;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        RoomManager[] vect = new RoomManager[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();;
        sc.nextLine();

        for(int i = 0 ; i < n ; i++){
            System.out.printf("\nRent #%d:", i+1);
            System.out.print("\nName: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            vect[room] = new RoomManager(name, email, room);
        }

        System.out.println("\nBusy rooms:");
        for(int i = 0 ; i < vect.length ; i++){
            if(vect[i] != null){
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}