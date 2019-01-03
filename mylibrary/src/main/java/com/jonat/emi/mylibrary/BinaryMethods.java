package com.jonat.emi.mylibrary;

/**
 * Created by Johnobinnachuksorji on 4/27/2018.
 */

public class BinaryMethods {


    //-----------------------------------------BREADTH-FIRST-SEARCH-----------------------------------------------------------------//

    /*

 Breadth-first search (BFS) is a method for exploring a tree or graph. In a BFS, you first explore all the nodes one step away,
 then all the nodes two steps away, etc.
Breadth-first search is like throwing a stone in the center of a pond. The nodes you explore "ripple out"
from the starting point.

Here's a how a BFS would traverse this tree, starting with the root:

A 4-row binary tree represented by circles connected with lines.
Our breadth-first search has us start at the root node at the top of the tree.
We'd visit all the immediate children (all the nodes that're one step away from our starting node):

The same 4-row binary tree with all nodes at depth 1 (second row) bolded after being visited.
Then we'd move on to all those nodes' children (all the nodes that're two
steps away from our starting node):

The same 4-row binary tree with all nodes at
depth 2 (third row) bolded after being visited.
And so on:

The same 4-row binary tree with all nodes at depth 3
(fourth and final row) bolded after being visited.
Until we reach the end.

Breadth-first search is often compared with depth-first search.

Advantages:

A BFS will find the shortest path between the starting point and any other reachable node.
A depth-first search will not necessarily find the shortest path.

Disadvantages

A BFS on a binary tree generally requires more memory than a DFS.



     */

    //--------------------------------------------------DEPTH-FIRST METHOD--------------------------------------------------------------------\\

    /*

    Depth-first search (DFS) is a method for exploring a tree or graph.
     In a DFS, you go as deep as possible down one path before backing up and trying a different one.

Depth-first search is like walking through a corn maze. You explore one path,
hit a dead end, and go back and try a different one.

Here's a how a DFS would traverse this tree, starting with the root:

A 4-row binary tree represented by circles connected with lines.
Our depth-first search has us start at the root node at the top of the tree.
We'd go down the first path we find until we hit a dead end:

The same binary tree with all nodes in the leftmost branch bolded after being visited.
Then we'd do the same thing again—go down a path until we hit a dead end:

Then we do the same thing again: head down the next leftmost path until we reach a dead end.
And again:

And again.
And again:

Until we've visited every node in the tree.
Until we reach the end.

Depth-first search is often compared with breadth-first search.

Advantages:

Depth-first search on a binary tree generally requires less memory than breadth-first.
Depth-first search can be easily implemented with recursion.
Disadvantages

A DFS doesn't necessarily find the shortest path to a node, while breadth-first search does.
     */

}

