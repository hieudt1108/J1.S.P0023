/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author Doan Trung Hieu
 */
public class Customer {
    private String name ;
    private ArrayList<Order> list ;

    public Customer() {
    }

    public Customer(String name, ArrayList<Order> list) {
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getList() {
        return list;
    }

    public void setList(ArrayList<Order> list) {
        this.list = list;
    }
    
    
    
}
