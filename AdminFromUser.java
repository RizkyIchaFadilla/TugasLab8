package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminFromUser extends User{
    private String admin_name;
    private String email;

    public ArrayList<AdminFromUser> arr_admin = new ArrayList<AdminFromUser>();

    public void add_admin() {
        AdminFromUser admin = new AdminFromUser();
        String icha;
        Scanner baca = new Scanner(System.in);

        System.out.print("\nNama : ");
        icha = baca.nextLine();
        admin.set_adminName(icha);;
        System.out.print("email : ");
        icha = baca.nextLine();
        admin.set_email(icha);
        System.out.print("user_id : ");
        icha = baca.nextLine();
        admin.set_userId(icha);
        System.out.print("pass : ");
        icha = baca.nextLine();
        admin.set_pass(icha);
        arr_admin.add(admin);


    }

    public void show_admin() {
        for(int i=0 ; i < arr_admin.size() ; i++) {
            System.out.println("\nNama admin     : " + arr_admin.get(i).get_adminName());
            System.out.println("Email admin    : " + arr_admin.get(i).get_email());
            System.out.println("User_id admin  : " + arr_admin.get(i).get_userId());
            System.out.println("Password admin : " + arr_admin.get(i).get_pass());
            System.out.print("\n");
        }
    }

    //setter
    public void set_adminName(String admin_name) {
        this.admin_name = admin_name;
    }

    public void set_email(String email) {
        this.email = email;
    }

    //getter
    public String get_adminName() {
        return admin_name;
    }

    public String get_email() {
        return email;
    }

    public void update_catalog() {

    }
}
