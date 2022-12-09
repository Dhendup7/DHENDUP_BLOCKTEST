package model;

import java.util.ArrayList;

public class Users {

    int User_id;
    String User_name;
    String Address;

    String Payment_way;

    public Users(String payment_way) {
        Payment_way = payment_way;
    }

    ArrayList<Orders>Orders;

    public Users(int user_id, String user_name, String address, ArrayList<model.Orders> orders) {
        User_id = user_id;
        User_name = user_name;
        Address = address;
        Orders = orders;
    }

    public Users(int user_id, String dhendup, String bouddha) {
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int user_id) {
        User_id = user_id;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public ArrayList<model.Orders> getOrders() {
        return Orders;
    }

    public void setOrders(ArrayList<model.Orders> orders) {
        Orders = orders;
    }

    public String getPayment_way() {
        return Payment_way;
    }

    public void setPayment_way(String payment_way) {
        Payment_way = payment_way;
    }
}
