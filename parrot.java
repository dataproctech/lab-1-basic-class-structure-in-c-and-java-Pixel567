import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Parrot {
    private List<String> phrases;
    private Random random;

    public Parrot(String initialPhrase) {
        phrases = new ArrayList<>();
        phrases.add(initialPhrase);
        random = new Random();
    }

    public void addPhrase(String newPhrase) {
        phrases.add(newPhrase);
    }

    public void say(int repetitions) {
        if (phrases.isEmpty()) return;

        for (int i = 0; i < repetitions; i++) {
            int randomIndex = random.nextInt(phrases.size());
            System.out.println(phrases.get(randomIndex));
        }
    }

    public void say() {
        say(1); // Domyślnie powtarza raz
    }

    public void setPhrase(String newPhrase) {
        phrases.clear();
        phrases.add(newPhrase);
    }
}

public class Main {
    public static void main(String[] args) {
        Parrot parrot1 = new Parrot("Hello!");

        parrot1.say();

        parrot1.addPhrase("Goodbye!");
        parrot1.addPhrase("What's up?");
        parrot1.addPhrase("I'm a parrot!");

        parrot1.say(3);

        parrot1.setPhrase("Just one phrase now.");
        parrot1.say();
    }
}
