public class MathStringLab {

    private String text;

    // 5 points: Create a constructor with a parameter that sets the instance variable to that parameter
    public MathStringLab(String theText) {
      text = theText;

    }

    // 5 points: Create a no-argument constructor that sets the instance variable to some value
    public MathStringLab() {
      text = "Hi class!";
    }

    // 10 points: Return the absolute difference in length between text and the parameter word.
    // Example: text="hello", word="hi" → |5 - 2| = 3
    public int lengthDifference(String word) {
      return Math.abs(text.length() - word.length());
    }

    // 10 points: Return the character at a random index of text.
    // HINT: Use Math.random() to generate an index.
    // Example: text="Ballard" → could return 'l'
    public String randomCharacter() {
      int randomIndex = (int) Math.random() * text.length();
      return text.substring(randomIndex, randomIndex + 1);

    }


    // CHALLENGE: (for extra credit)
    // Return text with each character repeated N times (e.g., "cat", n=2 → "ccaatt")
    // You’ll need to use a loop to do this, so try it *after* finishing everything else.
    public String repeatEachChar(int n) {
      return "";
    }

    public static void main(String[] args) {
        // 5 points: Instantiate an object of MathStringLab with a parameter of your choosing
        MathStringLab lab1 = new MathStringLab("AP CSA Rulez!");
        // 5 points: Call the no-argument constructor
        MathStringLab lab2 = new MathStringLab();
        // 5 points each: Call each of your methods (lengthDifference and randomCharacter)
        System.out.println("Result of lengthDifference(); " + lab1.lengthDifference("Hello World"));
        System.out.println("Result of lengthDifference(); " + lab1.lengthDifference());
        // Print out the results neatly so they’re easy to read. The output should be in the following format:
        // "Result of lengthDifference(): <the result>
    }
}