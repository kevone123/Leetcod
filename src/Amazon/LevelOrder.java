package Amazon;

import java.util.*;

class Node{
    int val;
    Node left;
    Node right;

    Node(int data){
        this.val = data;
    }

}

public class LevelOrder {


    public static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> result = new LinkedList<>();

      /*
          instatiate a queue
           add to result
          add the root to queueu
             get the size of the queue
             while  size > 0
                 N = pop the
                 add children to arraylist
                 add to children to queue
                 size --
            add crrlist to result

       */
       Queue<Node> queue = new LinkedList<>();
        List<Integer> levelValues = null;
       queue.add(root);
       int size = 0;
       while(!queue.isEmpty()){
           size = queue.size();
           levelValues = new ArrayList<>();
           while( size > 0){
               Node crrntNode = queue.poll();
               levelValues.add(crrntNode.val);
               if(crrntNode.left != null){
                   queue.add(crrntNode.left);
               }
               if(crrntNode.right != null) {
                   queue.add(crrntNode.right);
               }
               size--;
           }
           result.add(levelValues);

       }

      return result;
    }

    public static void main(String[]args){
      Node first = new Node(1);
      Node second = new Node(2);
      Node third = new Node(3);
      first.left = second;
      first.right = third;
      second.left = new Node(4);
      second.right = new Node(5);
      third.left = new Node(6);
      third.right = new Node(7);

        System.out.println(levelOrder(first).toString());
    }
}
