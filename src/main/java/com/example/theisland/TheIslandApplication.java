package com.example.theisland;

import com.example.theisland.domain.Island;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheIslandApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheIslandApplication.class, args);
        Island island = new Island(10);
        System.out.println(island.getIslandGrid());
    }

}
