import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class  Main {

    public static void menu(){
        System.out.println("*******************************\nWord Analyzer Project - Ap Lab Workshop 09\n1) Words Count\n" +
                "2) Longest word and its length\n3) Shortest word and its length\n4) All words length average\nto stop, " +
                "enter -1\n\tPlease enter the number:\n");
    }
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Analyze analyser = new Analyze();
        for (int i = 1; i <= 20; i++) {
            analyser.readingFiles("C:/Users/Pc/Documents/AP/AP-Workshop9/assets/file_" + i + ".txt");
            executorService.execute(analyser);
        }
        menu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (choice != -1) {
            if (choice == 1) {
                System.out.println("\n" + Analyze.getNumberOfWords());
            } else if (choice == 2) {
                System.out.println("\n" + Analyze.getLongWord() + " " + Analyze.getLongWord().length());
            } else if (choice == 3) {
                System.out.println("\n" + Analyze.getShortWord() + " "  + Analyze.getShortWord().length());
            } else if (choice == 4) {
                System.out.println("\n" + Analyze.getLengthOfAllWords() / 20);
            }  else {
                System.out.println("invalid input!");
            }
            menu();
            choice = scanner.nextInt();
        }
        System.out.println("Byeee");
        return;
    }
}


