
package com.example.notification;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/send")
public class NotificationController {

    @PostMapping
    public String sendNotification(@RequestBody Map<String, String> message) {
        System.out.println("📩 Notification sent for booking: " + message.get("bookingId"));
        return "Notification sent";
    }
}
