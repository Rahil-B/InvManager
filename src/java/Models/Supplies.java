/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.sql.Date;
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
public class Supplies implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int supplyId;
    
    private int fruitId;
    
    private int quantity;
    
    private int sourceId;
    
    private String sourceType;
    
    private int desId;
    
    private Date supplyDate;
    
    private Date requestDate;

    private String managerEmail;
    public Supplies() {
    }

    public Supplies(int fruitId, int quantity, int sourceId,String sourceType,int desId, Date supplyDate, Date requestDate,String managerEmail) {
        this.fruitId=fruitId;
        this.quantity = quantity;
        
        this.sourceId = sourceId;
        this.sourceType=sourceType;
        this.desId = desId;
        this.supplyDate = supplyDate;
        this.requestDate = requestDate;
        this.managerEmail=managerEmail;
    }


    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }
    
    
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fruitId")
    public int getFruitId() {
        return fruitId;
    }

    public int getSupplyId() {
        return supplyId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSourceId() {
        return sourceId;
    }

    public int getDesId() {
        return desId;
    }

    public Date getSupplyDate() {
        return supplyDate;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public void setDesId(int desId) {
        this.desId = desId;
    }

    public void setSupplyDate(Date supplyDate) {
        this.supplyDate = supplyDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    @Override
    public String toString() {
        return "Supplies{" + "supplyId=" + supplyId + ", quantity=" + quantity + ", sourceId=" + sourceId + ", desId=" + desId + ", supplyDate=" + supplyDate + ", requestDate=" + requestDate + '}';
    }
    
    
    
}
