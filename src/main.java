import model.Items;
import model.Orders;
import model.Users;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Items I1=new Items("T_Shirt","Levis",25044,1500,"Paris");
        Items I2=new Items("T-shirt","Lotto",40002,5000,"Nepal");
        Items I3=new Items("T-shirt","Kelme",34562,2500,"China");
        Items I4=new Items("T-shirt","NorthFace",25044,4000,"Paris");
        Items I5=new Items("T-shirt","Tommy-Hilfiger",25044,3000,"Paris");

        Users u1=new Users(1,"Dhendup","Bouddha");
        Users u2=new Users(2,"Yanjal","Kharibot");

        ArrayList<Users>User=new ArrayList<Users>();
        User.add(u1);
        User.add(u2);


        ArrayList<Orders>Orderr=new ArrayList<Orders>();


        Orders o1=new Orders(1,2,3000,"Cloth");
        Orders o2=new Orders(2,1,5000,"Cloth");
        Orderr.add(o1);
        Orderr.add(o2);

        I1.Items();





    }
        }
