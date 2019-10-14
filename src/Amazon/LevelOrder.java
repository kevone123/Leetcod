package Amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;

    Node(int data){
        this.val = data;
    }

}

public class LevelOrder {


    public static List<List<Node>> levelOrder(Node root){
      /*
      queue
         visit the root by adding it to the queu
           (left)
           while queue isnt empty
           get the size of the queu
           go through the entire queu
               add the children to lsit
               add children to the queu

           add the entire arraylist to result

       */
      Queue<Node> queue = new LinkedList<Node>();
      queue.add(root);
      List<Node> list = new ArrayList<>();
      List<List<Node>> result = new ArrayList<>();
      list.add(root);
      result.add(list);
      while(!queue.isEmpty()){
          Node node = queue.poll();
          int size = queue.size();
          for(int i = 0; i < queue.size(); i++){
              list = new ArrayList<>();
             if(node.left != null){
                 list.add(node.left);
             }
             if(node.right != null){
                 list.add(node.right);
             }
          }
          result.add(list);
          queue.add(node.left);
          queue.add(node.right);
      }

      return result;
    }

    public static void main(String[]args){
      Node first = new Node(3);
    }
}
