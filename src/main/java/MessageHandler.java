package com.xinyue.cross.server.server;

public class MessageHandler {
    public static void main(String[] args) {
        String s = "bb";
        MessageHandler m = new MessageHandler();
        String longest = m.getLongest(s);
        System.out.println(longest);
    }

    private String getLongest(String s) {
        char[] helpChar = getHelpChar(s);
        return getLongest(helpChar);
    }

    private char[] getHelpChar(String s) {
        char[] c = s.toCharArray();
        int l = c.length;
        int helpLength = 2 * l + 1;
        char[] helpChar = new char[helpLength];
        for (int i = 0; i < helpLength; i++) {
            if (i % 2 == 0) {
                helpChar[i] = '#';
            } else {
                helpChar[i] = c[i / 2];
            }
        }
        return helpChar;
    }

    private String getLongest(char[] helpChar) {
        int maxRadius = 0;
        int index = 0;
        for (int i = 0; i < helpChar.length; i++) {
            int radius = 0;
            while (i - radius >= 0 && i + radius <= helpChar.length - 1) {
                if (helpChar[i - radius] == helpChar[i + radius]) {
                    if (radius > maxRadius) {
                        maxRadius = radius;
                        index = i;
                    }
                    radius++;
                } else {
                    break;
                }
            }
        }
        int upper = index + maxRadius;
        int lower = index - maxRadius;
        char[] subArray = getSubArray(helpChar, lower, upper);
        char[] chars = filterHelpChar(subArray);
        return new String(chars);
    }

    private char[] getSubArray(char[] c, int lower, int upper) {
        int length = upper - lower + 1;
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = c[lower + i];
        }
        return chars;
    }

    private char[] filterHelpChar(char[] c) {
        int length = c.length / 2;
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = c[2 * i + 1];
        }
        return chars;
    }
}
