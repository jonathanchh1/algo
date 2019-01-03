package com.jonat.emi.mylibrary;

/**
 * Created by Johnobinnachuksorji on 4/27/2018.
 */

public class binarytree {

    /**
     * Write a method to check that a binary tree ↴
     * is a valid binary search tree. ↴
     * What makes a given node "correct" relative to its ancestors in a BST?
     * Well, it must be greater than any node it is in the right subtree of, and less than any node it is in the left subtree of.
     *
     * The simplest ways to traverse the tree are //depth-first//↴ and //breadth-first//. ↴ They have the same time cost
     * (they each visit each node once). Depth-first traversal of a tree uses memory proportional to the depth of the tree,
     * while breadth-first traversal uses memory proportional to the breadth of the tree
     * (how many nodes there are on the "level" that has the most nodes).
     *
     *  Each node has O(n)O(n) ancestors (O(\lg{n})O(lgn) for a balanced binary tree),
     *  so that gives us O(n^2)O(n​2) additional memory cost (O(n\lg{n})O(nlgn) for a balanced binary tree).
     * Because the tree's breadth can as much as double each time it gets one level deeper,
     * depth-first traversal is likely to be more space-efficient than breadth-first traversal
     *
     * We do a depth-first walk through the tree, testing each node for validity as we go.
     */



    /*
    making sure a binarytree is a valid binary tree search. we use depth first approach.
     */


    public class BinaryTreeNode{
        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;


        public BinaryTreeNode(int value){
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue){
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue){
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }

    }


    
    public static boolean isSearchBinaryTree(BinaryTreeNode root){
        return isSearchBinaryTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isSearchBinaryTree(BinaryTreeNode root, int lowerBound, int higherBound){
        if(root == null){
            return true;
        }

        if(root.value >= higherBound || root.value <= lowerBound){
            return false;
        }

        return isSearchBinaryTree(root.left, lowerBound, root.value)
                && isSearchBinaryTree(root.left, higherBound, root.value);
    }

    public static void main(String[] args){

    }
}
