package model;

import java.util.ArrayList;

public class Orders {
    int Order_Id;
    int  Quantity;
    int Price;
    String Order_details;
    ArrayList<Users>User;

    public Orders(int order_Id, int quantity, int price, String order_details, ArrayList<Users> user) {
        Order_Id = order_Id;
        Quantity = quantity;
        Price = price;
        Order_details = order_details;
        User = user;
    }

    public Orders(int order_id, int quantity, int price, String cloth) {
    }

    public int getOrder_Id() {
        return Order_Id;
    }

    public void setOrder_Id(int order_Id) {
        Order_Id = order_Id;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getOrder_details() {
        return Order_details;
    }

    public void setOrder_details(String order_details) {
        Order_details = order_details;
    }

    public ArrayList<Users> getUser() {
        return User;
    }

    public void setUser(ArrayList<Users> user) {
        User = user;
    }

}
