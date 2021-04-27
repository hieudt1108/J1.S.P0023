/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Entity.Customer;
import Entity.Fruit;
import Entity.Order;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Doan Trung Hieu
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Fruit> lf = new ArrayList<>();
        ArrayList<Customer> ht = new ArrayList<>();
//loop until user want to exit
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createFruit(lf);
                    break;
                case 2:
                    Manager.viewOrder(ht);
                    break;
                case 3:
                    Manager.shopping(lf, ht);
                    break;
                case 4:
                    return;
            }
        }
    }
}
