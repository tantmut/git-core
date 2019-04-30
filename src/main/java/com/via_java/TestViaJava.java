package com.via_java;

import com.implicit_autowiring.House;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestViaJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        /*House house = context.getBean(House.class);

        house.getDog().sound();*/

        Tree tree = context.getBean(Tree.class);

        System.out.println(tree.getLeaf().getName());
    }
}
