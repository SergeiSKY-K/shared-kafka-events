package telran.java57.sharedkafkaevents.kafka.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPaidEvent {

    private String orderId;
    private String userLogin;
    private double totalPrice;
    private Instant paidAt;
    private int version;
}