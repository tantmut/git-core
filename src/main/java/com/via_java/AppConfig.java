package com.via_java;

import com.implicit_autowiring.House;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {

    @Bean
    public House house() {
        return new House();
    }

    @Bean
    public Tree tree(Leaf leaf) {
        return new Tree("oak", leaf);
    }

    @Bean
    public Leaf leaf() {
        return new Leaf("Some leaf");
    }
}
