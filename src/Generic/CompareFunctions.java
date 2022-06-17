package Generic;

import java.util.List;
import java.util.function.Function;

public class CompareFunctions {

    public  static <T> int compareToChain(T one, T two, List<Function<T, Comparable>> chain) {
        for(int i = 0; i < chain.size(); i++){
            int value = chain.get(i).apply(one).compareTo(chain.get(i).apply(two));
            if(value != 0)
                return value;
        }
        return 0;
    }
}
