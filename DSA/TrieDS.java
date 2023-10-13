package DSA;

public class TrieDS {
    public static class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26];
            for (int i = 0; i <26 ; i++) {
                children[i] = null;
            }

            endOfWord = false;
        }
    }

    static Node root = new Node();

    public static void insertInTrie(String word){
        Node temp = root;
        for (int i = 0; i <word.length() ; i++) {
            int index = word.charAt(i) - 'a';

            if(temp.children[index] == null ){
                /* add new node */
                temp.children[index] = new Node();
            }
            if (i == word.length()-1){
                temp.children[index].endOfWord = true;
            }

            temp = temp.children[index];

        }
    }

    public static boolean Search(String word){
        Node temp = root;
        for (int i = 0; i <word.length() ; i++) {
            int index = word.charAt(i) - 'a';
            Node node = temp.children[index];

            if(node == null){
                return false;
            }
            if(i == word.length()-1 && !node.endOfWord){
                    return false;
            }

            temp = temp.children[index];

        }
        return true;
    }


    public static void main(String[] args) {
        String[] words = {"there", "a", "any", "their", "the"};
        for (int i = 0; i < words.length ; i++) {
            insertInTrie(words[i]);
        }

        System.out.println(Search("there"));
        System.out.println(Search("a"));
        System.out.println(Search("alister"));
        System.out.println(Search("the"));

    }
}
