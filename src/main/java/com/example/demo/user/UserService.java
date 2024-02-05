package com.example.demo.user;


import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {

    public List<User> getUserData () {




















        return List.of(
                new User(
                        1L,
                        "Drago",
                        "drago@abv.bg",
                        "kushtata",
                        new ArrayList<Appointment>(
                                List.of(
                                        new Appointment(LocalDateTime.of(2027, Month.JANUARY, 29, 1, 1), "Has a zubobol")
                                )
                        ),
                        "0896959195"
                )
        );
    }
}
