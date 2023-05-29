import java.util.*;

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

    public String longestWord(HashMap<String, Integer> words){
        Collection<Integer> values = words.values();
        Iterator<Integer> integerIterator = values.iterator();
        int max = 0;
        int maxIndex = 0, flag = 0;
        while (integerIterator.hasNext()){
            Integer intg = integerIterator.next();
            if (intg > max){
                max = intg;
                maxIndex = flag;
            }
            flag++;
        }
        Set<String> keys = words.keySet();
        String longestWord = null;
        Iterator<String> iterator = keys.iterator();
        int i = 0;
        while (iterator.hasNext()){
            String thisWord = iterator.next();
            if(i == maxIndex){
                longestWord = thisWord;
                break;
            }
            i++;
        }
        return longestWord;
    }

    public String shortestWord(HashMap<String, Integer> words){
        int min = Integer.MAX_VALUE;
        int minIndex = 0, flag = 0;
        Collection<Integer> values = words.values();
        Iterator<Integer> integerIterator = values.iterator();
        while (integerIterator.hasNext()){
            Integer intg = integerIterator.next();
            if (intg < min){
                min = intg;
                minIndex = flag;
            }
            flag++;
        }
        Set<String> keys = words.keySet();
        String shortestWord = null;
        Iterator<String> iterator = keys.iterator();
        int i = 0;
        while (iterator.hasNext()){
            String thisWord = iterator.next();
            if(i == minIndex){
                shortestWord = thisWord;
                break;
            }
            i++;
        }
        return shortestWord;
    }

    public static int getNumberOfWords() {
        numberOfWords += countNumOfWords(allWords);
        return numberOfWords;
    }

    public static int getLengthOfAllWords() {
        return averageLengthOfAllWords;
    }

    public static String getLongWord() {
        int lengthOfLongWord = 0;
        String longestWord = null;
        Iterator<String> wordIterator = longWord.iterator();
        while (wordIterator.hasNext()){
            String word = wordIterator.next();
            if (word.length() > lengthOfLongWord){
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static String getShortWord() {
        int lengthOfShortWord = Integer.MAX_VALUE;
        String shortestWord = null;
        Iterator<String> wordIterator = shortWord.iterator();
        while (wordIterator.hasNext()){
            String word = wordIterator.next();
            if (word.length() < lengthOfShortWord){
                lengthOfShortWord = word.length();
                shortestWord = word;
            }
        }
        return shortestWord;
    }
}
