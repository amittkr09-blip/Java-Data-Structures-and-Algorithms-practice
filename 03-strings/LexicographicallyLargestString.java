public class LexicographicallyLargestString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}

// Internally ye character-by-character compare karta hai — pehle letter ka
// Unicode/ASCII value dekhta hai. Agar pehla letter same hai toh dusra letter
// dekhta hai, and so on.

// Example: "apple".compareTo("mango")

// 'a' ka ASCII value = 97
// 'm' ka ASCII value = 109
// 97 - 109 = -12 (negative number return hoga)