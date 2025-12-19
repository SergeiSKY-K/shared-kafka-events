package telran.java57.sharedkafkaevents.kafka.events;

import java.time.Instant;

public class OrderPaidEvent {
    private String orderId;
    private String userLogin;
    private double totalPrice;
    private Instant paidAt;
    private int version;
}