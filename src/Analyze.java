import java.util.ArrayList;
import java.util.HashMap;

public class Analyze implements Runnable {
    private static int numberOfWords = 0;
    private static HashMap<String, Integer> allWords = new HashMap<>();
    private static int averageLengthOfAllWords = 0;
    private static ArrayList<String> shortWord = new ArrayList<>();
    private static ArrayList<String> longWord = new ArrayList<>();
    private static int index;

    @Override
    public void run() {

    }

    public int checkAlphabet(char ch){
        return (int) ch - 97;
    }

    public static int countNumOfWords(HashMap<String, Integer> words){
        int size = words.size();
        return size;
    }
}
