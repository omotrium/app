package com.javawhizz.App.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
//@RequestMapping("api/v1/customers")
@RequestMapping("/api")
public class CustomerController {
//    private static final List<Customer> CUSTOMERS = List.of(
//            new Customer(1L, "john", "doe", "john@javawhizz.com"),
//            new Customer(2L, "mary", "public", "mary@javawhizz.com"),
//            new Customer(3L, "elon", "musk","elon@javawhizz.com"),
//            new Customer(4L, "dunny","duncan","dunny@javawhizz.com")
//    );

//    @GetMapping
//    //public List<Customer> findAllCustomers(){
//        return CUSTOMERS;
//    }

        @GetMapping
        public Endpoint EndpointInformation(
                @RequestParam String slack_name,
                @RequestParam String track)
        {
            LocalDateTime currentTime = LocalDateTime.now(ZoneOffset.UTC);
            DayOfWeek current_day = currentTime.getDayOfWeek();
            String utc_time = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
//        DateTime formattedTime = DateTime.now( DateTimeZone.UTC );

            String github_file_url = "https://spring-demo-project-vanjazz.onrender.com/api?slack_name=balogun_dayo&track=backend";
            String github_repo_url = "https://github.com/van2jazz/endpoint_one";

            return new Endpoint(
                    slack_name,
                    current_day.toString().substring(0,1) + current_day.toString().substring(1).toLowerCase(),
                    utc_time,
                    track,
                    github_file_url,
                    github_repo_url,
                    200
            );

//        Endpoint endpoint = new Endpoint();
//        endpoint.setSlackName("slack_Name");
//        endpoint.setCurrentDay(LocalDateTime.now().getDayOfWeek().toString());
//        endpoint.setUtcTime(LocalDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_DATE_TIME));
//        endpoint.setTrack(track);
//        endpoint.setGithubFileUrl("https://github.com");
//        endpoint.setGithubRepoUrl("https://github.com");
//
//        endpoint.setStatusCode(200);


        }

}
