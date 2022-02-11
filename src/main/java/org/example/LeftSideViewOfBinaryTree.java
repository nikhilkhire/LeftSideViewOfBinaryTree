package org.example;

public class LeftSideViewOfBinaryTree{

    public static void main(final String[] args){
        final Tree binaryTree = new Tree(1);
        binaryTree.left = new Tree(2);
        binaryTree.right = new Tree(3);
        // binaryTree.left.left = new Tree(4);
        binaryTree.left.right = new Tree(5);
        binaryTree.right.left = new Tree(6);
        binaryTree.right.right = new Tree(7);
        new leftView().printLeftView(binaryTree, 3);
    }

}

class leftView{
    int maxLevel = 0;

    void printLeftView(final Tree binaryTree, final int level){

        if(binaryTree == null){
            return;
        }// 3-4
        if(this.maxLevel < level){// 0<3 3<4
            System.out.println(binaryTree.data + "->"); // 1->2
            this.maxLevel = level;
        }
        this.printLeftView(binaryTree.left, level + 1);
        this.printLeftView(binaryTree.right, level + 1);

    }
}
