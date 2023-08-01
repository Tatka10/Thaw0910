public class Main {
    public static void main(String[] args) {

        printWord("кря", 5);

    }

    static void printWord (String word, int k){
        System.out.println(word);
        if (k>1) printWord(word, k-1);
    }

    static void printWordUp (String word, int k){
        if (k>1) printWordUp(word, k-1);
        System.out.println(word);
    }

}