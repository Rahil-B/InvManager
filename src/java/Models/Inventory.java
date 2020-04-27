/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author RAHIL
 */
@Entity
public class Inventory implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int itemId;
    
    
    int fruitId;
    
    int quantityMax;
    
    int quantityAvail;
    
    int wareHouseId;
    
    int price;

    public Inventory() {
    }

    
    
    public Inventory(int fruitId, int quantityMax, int quantityAvail, int wareHouseId) {
        this.fruitId = fruitId;
        this.quantityMax = quantityMax;
        this.quantityAvail = quantityAvail;
        this.wareHouseId = wareHouseId;
    }

    public int getItemId() {
        return itemId;
    }

    public int getFruitId() {
        return fruitId;
    }

    public int getQuantityMax() {
        return quantityMax;
    }

    public int getQuantityAvail() {
        return quantityAvail;
    }

    public int getWareHouseId() {
        return wareHouseId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    
    
    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public void setQuantityMax(int quantityMax) {
        this.quantityMax = quantityMax;
    }

    public void setQuantityAvail(int quantityAvail) {
        this.quantityAvail = quantityAvail;
    }

    public void setWareHouseId(int wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    
    
}
