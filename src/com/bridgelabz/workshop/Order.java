package com.bridgelabz.workshop;

import java.util.Map;

public class Order {
    private int id;
    private Map<Integer, Sweet> sweetMap;
    private String customerName;
    private long phoneNumber;
    private double totalPrice;

    @Override
    public String toString() {
        return "Order [id=" + id + ", sweetMap=" + sweetMap + ", customerName=" + customerName + ", phoneNumber="
                + phoneNumber + ", totalPrice=" + totalPrice + "]";
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public Map<Integer, Sweet> getSweetMap() {
        return sweetMap;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSweetMap(Map<Integer, Sweet> sweetMap) {
        this.sweetMap = sweetMap;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
