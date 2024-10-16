#include <iostream>
#include <string>
#include <vector>
#include <cstdlib>
#include <ctime>

class Parrot {
private:
    std::vector<std::string> phrases;

public:
    Parrot(std::string initialPhrase) {
        phrases.push_back(initialPhrase);
        std::srand(std::time(0));
    }

    void addPhrase(std::string newPhrase) {
        phrases.push_back(newPhrase);
    }

    void say(int repetitions = 1) {
        if (phrases.empty()) return;

        for (int i = 0; i < repetitions; ++i) {
            int randomIndex = std::rand() % phrases.size();
            std::cout << phrases[randomIndex] << std::endl;
        }
    }

    void setPhrase(std::string newPhrase) {
        phrases.clear();
        phrases.push_back(newPhrase);
    }
};

int main() {
    Parrot parrot1("Hello!");

    parrot1.say();

    parrot1.addPhrase("Goodbye!");
    parrot1.addPhrase("What's up?");
    parrot1.addPhrase("I'm a parrot!");

    parrot1.say(3);

    parrot1.setPhrase("Just one phrase now.");
    parrot1.say();

    return 0;
}
