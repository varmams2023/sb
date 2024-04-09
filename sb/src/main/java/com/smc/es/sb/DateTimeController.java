package com.smc.es.sb;

//DateTimeController.java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class DateTimeController {

 @GetMapping("/api/datetime")
 public String getDateTime() {
     LocalDateTime now = LocalDateTime.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
     String formattedDateTime = now.format(formatter);
     return "Current date and time: " + formattedDateTime + ". Hello from Spring Boot!";
 }
}
