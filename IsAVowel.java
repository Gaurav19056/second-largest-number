public class IsAVowel {
    public static boolean isVowel(String letter) {
        String vowels="aeiou";
        return vowels.contains(letter);
    }
    public static void main(String[] args) {
        System.out.println("\"a\" → " + isVowel("a"));   // true
        System.out.println("\"e\" → " + isVowel("e"));   // true
        System.out.println("\"b\" → " + isVowel("b"));   // false
        System.out.println("\"A\" → " + isVowel("A"));   // false
        System.out.println("\"u\" → " + isVowel("u"));   // true
    }
}

