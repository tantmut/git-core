package com.via_java;

public class Tree {

    private String name;

    private Leaf leaf;

    public Tree(String name, Leaf leaf) {
        this.name = name;
        this.leaf = leaf;
    }

    public Leaf getLeaf() {
        return leaf;
    }
}
