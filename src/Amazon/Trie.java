package Amazon;


import java.util.HashMap;

class TNode{
    char aChar;
    public TNode(char aChar){
        this.aChar = aChar;
    }
}


    //array of children
    // Look up character to node
    //word validation( find words given a a scrableboard)
    // can start from past calls instead of building like in slidding window
    //store the previo us state
    //1) keep state in node
    //2) return Node reference


public class Trie {

    HashMap<Character, TNode> children;

    public Trie(){
        children = new HashMap<>();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word == null) return;
        Trie trie = new Trie();   // apple    app    "" null
        TNode neigh = null;
        char nextChar = ' ';
        int i = 0;
        for(; i < word.length() - 1 ; i++){
            nextChar = word.charAt(i + 1);
            if( nextChar != ' ') {
                neigh = new TNode(nextChar);
            }
            trie.children.put(word.charAt(i), neigh);
        }

        TNode star = new TNode('*');
        trie.children.put( word.charAt(i), star);

    }

    public boolean search(String word) {
       /*
         while going through word   (a)(p)ple
          keep a count        c = 0
          look through map for the character,   [a:(p), p:(p) , l:(e), e: (reach end of node ]

           if the neighbor is next character in the map    i+1 = (p)
           get the neighbor   (p)
            search the map for the neighbor      set Char Looking for  as p
            else  return false
            if the count is equal to neighbor return true
        */
       return true;
    }

    public static void main(String[]args){

       Trie trie = new Trie();
       trie.insert("apple");



   }



}
