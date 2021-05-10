package com.company;
import java.io.IOException;
import java.util.*;

public class Main {
    private String username;
    private String password;
    private static CustomerFromuser customer = new CustomerFromuser();
    private static AdminFromUser admin = new AdminFromUser();

    public static void promptEnterKey(){
        System.out.println("\nPress enter to return to main menu..");
        try
        {
            int read = System.in.read(new byte[2]);
        } catch (IOException a) {
        }
    }


    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int x = 0;

        System.out.println("---Masukan Pilihan Anda :  ---");
        do {
            System.out.println("1. Tambah data");
            System.out.println("2. Tampilkan data");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            try {
                x = scan.nextInt();
            }catch(Exception e) {
                System.out.println("Hanya input angka!");
                scan.nextLine();
            }

            switch(x) {
                case 1 :
                    add_menu();
                    break;
                case 2 :
                    customer.show_user();
                    admin.show_admin();
                default :
                    System.out.println("\n Anda Keluar !!!");
                    promptEnterKey();
            }

        }while(x!=3);
    }

    static void add_menu() {
        int ch=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n1. Tambah customer");
        System.out.println("2. Tambah admin");

        do {
            System.out.print("Input: ");
            try {
                ch = scan.nextInt();
            }catch(Exception e) {
                System.out.println("Hanya input angka!");
                scan.nextLine();
            }
        }while(ch>2);


        switch(ch) {
            case 1 :
                customer.add_customer();
                break;

            case 2 :
                admin.add_admin();
                break;
        }while(ch>2);
    }
}
