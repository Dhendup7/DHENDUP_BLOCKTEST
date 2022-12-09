package model;

public class Items {
    String Item_name;
    String Brand;
   double Code;
    double Price;
    String origin;

    public Items(String item_name, String brand, double code, double price, String origin) {
        Item_name = item_name;
        Brand = brand;
        Code = code;
        Price = price;
        this.origin = origin;
    }

    public String getItem_name() {
        return Item_name;
    }

    public void setItem_name(String item_name) {
        Item_name = item_name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getCode() {
        return Code;
    }

    public void setCode(double code) {
        Code = code;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public void Items(){
        System.out.println("Item_Name: \t Brand: \t Code:\t Origin: \tPrice:" );
        System.out.println(this.Item_name+"\t"+this.Brand+"\t"+this.Code+"\t"+this.origin+"\t"+this.Price);
    }
}
