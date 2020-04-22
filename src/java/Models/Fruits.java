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

/**
 *
 * @author RAHIL
 */
@Entity
public class Fruits {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int fruitId;
    
    private String fruitName;
    
    private String fruitColor;
    
    private int freshLifeDays;

    public Fruits() {
    }

    public Fruits(String fruitName, String fruitColor, int freshLifeDays) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.freshLifeDays = freshLifeDays;
    }
    
    
    
    
    public int getFruitId() {
        return fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public int getFreshLifeDays() {
        return freshLifeDays;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    public void setFreshLifeDays(int freshLifeDays) {
        this.freshLifeDays = freshLifeDays;
    }
    
    
    
}
