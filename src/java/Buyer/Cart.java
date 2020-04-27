/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buyer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zalak Bhingradiya
 */
public class Cart {
    public String qty;
    public String price;
    public String fnm; 

    public Cart(String qty, String price, String fnm) {
        this.qty = qty;
        this.price = price;
        this.fnm = fnm;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setFnm(String fnm) {
        this.fnm = fnm;
    }

    public String getQty() {
        return qty;
    }

    public String getPrice() {
        return price;
    }

    public String getFnm() {
        return fnm;
    }
          
}
