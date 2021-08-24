package com.example.rabbitmq.messagingRabbitMQ;

import com.example.rabbitmq.templates.CostumerTemplate;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    public void receiveMessage(String message) {

        CostumerTemplate costumer = new Gson().fromJson(message, CostumerTemplate.class);

        System.out.println("\nReceived Order " + costumer.getOrderId() + " From "
                + "<" + costumer.getRealName() + ">" + "\n"
                + "Pizzas: " + costumer.getPizzaNames() + "\n"
                + "Total price: " + costumer.getTotalPrice() + "kr" + "\n"
                + "Order placed at: " + costumer.getOrderTime());
    }
}
