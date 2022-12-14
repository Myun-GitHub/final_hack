package com.citi.portfolio.demo.entities;

import javax.persistence.*;

@Entity
public class PortfolioAsset {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int product_id;

    private int pid;

    private int aid;

    private int shares;

    private float total_cost;


    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public float getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(float total_cost) {
        this.total_cost = total_cost;
    }
}
