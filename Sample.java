package com.example;

public class Sample {

    public static String getColor(int rgb) {
        switch (rgb) {
        case 1:
            return "Ô";
        case 2:
            // –{—ˆ‚Íu—Îv
            return "•";
        case 3:
            return "Â";
        }
        throw new IllegalArgumentException();
    }
}