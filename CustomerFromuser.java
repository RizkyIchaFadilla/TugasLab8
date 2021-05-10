package com.company;
import java.util.*;

public class CustomerFromuser extends User{
    private String customer_name;
    private String address;
    private String email;
    private String credit_card_info;
    private String shipping_info;

    public ArrayList<CustomerFromuser> arr_customer = new ArrayList<CustomerFromuser>();

    private void calculate_next_bill_amount() {

    }

    public void add_customer() {
        CustomerFromuser customer = new CustomerFromuser();
        String icha;
        Scanner baca = new Scanner(System.in);

        System.out.print("\nNama : ");
        icha = baca.nextLine();
        customer.set_custName(icha);
        System.out.print("Alamat : ");
        icha = baca.nextLine();
        customer.set_address(icha);
        System.out.print("email : ");
        icha = baca.nextLine();
        customer.set_email(icha);
        System.out.print("user_id : ");
        icha = baca.nextLine();
        customer.set_userId(icha);
        System.out.print("pass : ");
        icha = baca.nextLine();
        System.out.println("\n");
        customer.set_pass(icha);
        arr_customer.add(customer);


    }

    public void show_user() {
        for(int i=0 ; i < arr_customer.size() ; i++) {
            System.out.println("\nNama Customer   : " + arr_customer.get(i).get_custName());
            System.out.println("Alamat Customer   : " + arr_customer.get(i).get_address());
            System.out.println("Email Customer  : " + arr_customer.get(i).get_email());
            System.out.println("User_id Customer : " + arr_customer.get(i).get_userId());
            System.out.println("Password Customer : " + arr_customer.get(i).get_pass());
            System.out.print("\n");
        }
    }

    public String get_custName() {
        return customer_name;
    }

    public void set_custName(String customer_name) {
        this.customer_name=customer_name;
    }

    public String get_address() {
        return address;
    }

    public void set_address(String address) {
        this.address = address;
    }

    public String get_email() {
        return email;
    }

    public void set_email(String email) {
        this.email = email;
    }

    public void bill() {

    }

    public void register() {

    }

    public void login() {

    }

    public void update_profile() {

    }


}
