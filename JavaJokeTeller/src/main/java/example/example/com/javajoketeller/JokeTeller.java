package example.example.com.javajoketeller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeTeller {
    static List<String> jokes;
    static Random ran;

    public JokeTeller() {
        jokes = new ArrayList<>();
        ran = new Random();
        jokes.add("A pregnant fragment walks into a bar. The bartender says, \"Whoa! Whoa! We don't support nested fragments here!\"");
        jokes.add("An iPhone enters the Android bar. The customers take him out and beat him up. Just before passing out, he says \"I swear, I thought this was an iPhone bar\".\n" +
                "The angry Androids reply: \"sorry, you can't use that excuse anymore!\"");
        jokes.add("A fragment walks into a bar, and the bartender asks for an ID. Fragment says, \"I don't have an ID.\" So the bartender says, \"Okay, I'll make a NullPointerException.\"\n");
    }

    public static String getRandomJoke() {
        return jokes.get(ran.nextInt(jokes.size()));
    }
}
