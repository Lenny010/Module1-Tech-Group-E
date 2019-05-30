
import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String [] args) throws Exception {
        File file = new File( pathname: "DocText.txt");
        Scanner scanner= new Scanner(file);

        int words = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line.split(regex: "");

            words += line.split( regex: " ").length;

        }
        System.out.println("The file contains: "+ words+ "words.");


    }
}

