/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binary;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author BM
 */
public class Binary {

    /**
     * @param args the command line arguments
     */
    
    static TreeNode root; 
   
   
      static class TreeNode {
          int item;      
          TreeNode left;   
          TreeNode right;   
          TreeNode(int x) {
             item = x;
          }
      } 
   
   
      static void treeInsert(int x) {
         if ( root == null ) {
             root = new TreeNode( x );
             return;
          }
          TreeNode runner; 
          runner = root;   
          while (true) {
             if ( x < runner.item ) {
                if ( runner.left == null ) {
                   runner.left = new TreeNode( x );
                   return;
                }
                else
                   runner = runner.left;
             }
             else {
                if ( runner.right == null ) {
                   runner.right = new TreeNode( x );
                   return;  
                }
                else
                   runner = runner.right;
              }
          } 
      }  
   
   
      static int countLeaves(TreeNode node) {
          if (node == null)
             return 0;
          else if (node.left == null && node.right == null)
             return 1; 
          else
             return countLeaves(node.left) + countLeaves(node.right);
      } 
      
      
      static int sumOfLeafDepths( TreeNode node, int depth ) {
          if ( node == null ) {
             return 0;
          }
          else if ( node.left == null && node.right == null) {
             return depth;
          }
          else {
             return sumOfLeafDepths(node.left, depth + 1) 
                         + sumOfLeafDepths(node.right, depth + 1);
          }
      }
      
      
      static int maximumLeafDepth( TreeNode node, int depth ) {
          if ( node == null ) {
             return 0;
          }
          else if ( node.left == null && node.right == null) {
               
             return depth;
          }
          else {
             int leftMax = maximumLeafDepth(node.left, depth + 1);
             int rightMax =  maximumLeafDepth(node.right, depth + 1);
             if (leftMax > rightMax)
                return leftMax;
             else
                return rightMax;
          }
      } 
      
      
      public static void PrintTree(TreeNode tree) {
        
            System.out.println(tree);

            if (root.left != null) {
                PrintTree(tree.left);
            } 

            if (root.right != null){
                PrintTree(tree.right);
            }

        }
      
      public static void main(String[] args) {
          ArrayList<Integer> aa = new ArrayList<Integer>();
          
         root = null;  
                 
         
        int esitmi = 0;
         for (int i = 0; i < 20; i++){
            Random rand = new Random();

            int eleman = rand.nextInt(50) + 1; 
             for (int j = 0; j < aa.size(); j++) {
                 if(aa.get(j) == eleman) esitmi++;
                
                 
             }
            
             if(esitmi==0) aa.add(eleman);

         }
          for (int i = 0; i < aa.size(); i++) {
              treeInsert(aa.get(i));
            System.out.println("Elemanlar: "+aa.get(i));
          }
         
          System.out.println("ağaç");
          System.out.println(root.item);
          
         int leafCount = countLeaves(root);
         int depthSum = sumOfLeafDepths(root,0);
         int depthMax = maximumLeafDepth(root,0);
         double averageDepth = ((double)depthSum) / leafCount;
         System.out.println("deptSum"+depthSum);
        
         
         System.out.println("Number of leaves:         " + leafCount);
         System.out.println("Average depth of leaves:  " + averageDepth);
         System.out.println("Maximum depth of leaves:  " + depthMax);
   
      } 
}
