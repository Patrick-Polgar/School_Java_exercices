package animals;

abstract class Fish implements Animal {

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
