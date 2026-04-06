Adjacency list/ matrix representation:

import java.util.*;

public class SimpleGraph {
    public static void main(String[] args) {
        int V = 4;
        
        // ADJACENCY LIST
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < V; i++) list.add(new ArrayList<>());
        
        // ADJACENCY MATRIX
        int[][] matrix = new int[V][V];
        
        // Add edge (0-1, 0-2, 1-3, 2-3)
        // Update both representations
        list.get(0).add(1); matrix[0][1] = 1; matrix[1][0] = 1;
        list.get(0).add(2); matrix[0][2] = 1; matrix[2][0] = 1;
        list.get(1).add(3); matrix[1][3] = 1; matrix[3][1] = 1;
        list.get(2).add(3); matrix[2][3] = 1; matrix[3][2] = 1;
        
        // Print List
        System.out.println("Adjacency List:");
        for (int i = 0; i < V; i++) 
            System.out.println(i + " -> " + list.get(i));
        
        // Print Matrix
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) 
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
