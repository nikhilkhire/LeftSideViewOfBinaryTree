package org.example;

public class Tree{
    int  data;
    Tree left;
    Tree right;

    public Tree(final int value){
        this.data = value;
        this.left = this.right = null;
    }

}
