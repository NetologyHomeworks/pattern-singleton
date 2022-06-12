package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int itemCount = 0;
        for (Integer item : source) {
            if ((item >= threshold)) {
                logger.log("Элемент \"" + item + "\" проходит");
                result.add(item);
                itemCount++;
            } else {
                logger.log("Элемент \"" + item + "\" не проходит");
            }
        }
        logger.log("Прошло фильтр " + itemCount + " элемента из " + source.size());
        return result;
    }
}
