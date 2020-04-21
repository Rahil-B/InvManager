/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author RAHIL
 */
@Entity
public class Supplies implements Serializable {
    @Id
    private String supplyId;
    
    private int quantity;
    private String sourceId;
    private String desId;
    private Date supplyDate;
    private Date requestDate;

    public Supplies() {
    }

    public Supplies(String supplyId, int quantity, String sourceId, String desId, Date supplyDate, Date requestDate) {
        this.supplyId = supplyId;
        this.quantity = quantity;
        this.sourceId = sourceId;
        this.desId = desId;
        this.supplyDate = supplyDate;
        this.requestDate = requestDate;
    }

    public String getSupplyId() {
        return supplyId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getDesId() {
        return desId;
    }

    public Date getSupplyDate() {
        return supplyDate;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setSupplyId(String supplyId) {
        this.supplyId = supplyId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public void setDesId(String desId) {
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
