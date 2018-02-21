
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author corei5
 */
public class sale implements Serializable {
    private int sale_id;
    private String surname;
    private String othername;
    private String address;
    private int item_id;
    private String item_description;
    private double item_cost;

    public sale(int sale_id, String surname, String othername, String address, int item_id, String item_description, double item_cost) {
        this.sale_id = sale_id;
        this.surname = surname;
        this.othername = othername;
        this.address = address;
        this.item_id = item_id;
        this.item_description = item_description;
        this.item_cost = item_cost;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public double getItem_cost() {
        return item_cost;
    }

    public void setItem_cost(double item_cost) {
        this.item_cost = item_cost;
    }

    @Override
    public String toString() {
        return (sale_id+" "+surname+" "+othername+" "+address+" "+item_id+" "+item_description+" "+item_cost+" ");
    }
    
    
    
}
