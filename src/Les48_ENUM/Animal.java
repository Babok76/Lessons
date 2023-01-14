package Les48_ENUM;

public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягушка");
    // new DOG ("собака"); - аналог
    private String translation;

    Animal(String translation) {
        this.translation = translation;

    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский "+translation;
    }

}
