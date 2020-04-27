/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author RAHIL
 */
@Entity
public class WareHouse {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int wareHouseId;
    
    int capacityKg;
    
    String address;

    public WareHouse() {
    }

    
    
    public WareHouse(int capacityKg, String address) {
        this.capacityKg = capacityKg;
        this.address = address;
    }

    public int getWareHouseId() {
        return wareHouseId;
    }

    public int getCapacityTon() {
        return capacityKg;
    }

    public String getAddress() {
        return address;
    }

    public void setWareHouseId(int wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public void setCapacityTon(int capacityKg) {
        this.capacityKg = capacityKg;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
