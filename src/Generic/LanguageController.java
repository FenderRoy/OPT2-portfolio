package Generic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LanguageController {

    public static ArrayList<String> getLanguage(String language){
        final int totalWords = 3;
        ArrayList<String> languageHolder = new ArrayList<>();

        try {
            File myObj = new File("languages/"+language+".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                languageHolder.add(myReader.nextLine());
            }

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            for(int i = 0; i < totalWords; i++){
                languageHolder.add("Unknown Language");
            }
            e.printStackTrace();
        }
        return languageHolder;
    }


}
