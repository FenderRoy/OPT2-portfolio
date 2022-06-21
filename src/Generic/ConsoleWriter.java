package Generic;

import java.util.List;
import java.util.function.Function;

public class ConsoleWriter {

    public static <T> void printVariableList(List<String> variableNames, T object, List<Function<T, String>> values){
            for(int i = 0; i < variableNames.size(); i++){
            System.out.println(variableNames.get(i) + ": "+values.get(i).apply(object));
        }
        System.out.println();
    }

}