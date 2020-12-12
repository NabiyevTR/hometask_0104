package ru.geekbrains.ntr_0104;

public class AIHelpers {
    public static String rowToString(DOTS[] dots) {
        StringBuilder sb = new StringBuilder();
        for (DOTS dot : dots) {
            sb.append(dot.getSymbol());
        }
        return sb.toString();
    }
}
