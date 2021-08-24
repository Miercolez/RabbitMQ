package com.example.rabbitmq.templates;

import java.sql.Timestamp;
import java.util.List;

public class CostumerTemplate {

    private Long id;

    private String realName;
    private int orderQuantity;
    private int totalPrice;
    private String orderTime = new Timestamp(System.currentTimeMillis()).toString().substring(0,19);
    private Long orderId = (int)(Math.random() * 10000) + Long.parseLong(orderTime.replaceAll("[-: ]", ""));

    private List<String> pizzaNames;

    public CostumerTemplate() {
    }

    public CostumerTemplate(String realName, List<String> pizzaNames) {
        this.realName = realName;
        this.pizzaNames = pizzaNames;
        this.orderQuantity = pizzaNames.size();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String userName) {
        this.realName = userName;
    }

    public List<String> getPizzaNames() {
        return pizzaNames;
    }

    public void setPizzaNames(List<String> pizzaNames) {
        this.pizzaNames = pizzaNames;
        this.orderQuantity = pizzaNames.size();
    }

    public String getOrderTime() {
        return orderTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", orderQuantity=" + orderQuantity +
                ", totalPrice=" + totalPrice +
                ", orderTime='" + orderTime + '\'' +
                ", orderId=" + orderId +
                ", pizzaNames=" + pizzaNames +
                '}';
    }
}
