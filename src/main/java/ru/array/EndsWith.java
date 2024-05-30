package ru.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = post.length; i > 0; i--) {
            if (word[word.length - i] != post[post.length - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
