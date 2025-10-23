public class DLPTestFakeCC {
    public static void main(String[] args) {
        // Fake credit card numbers for DLP testing purposes only.
        // These follow valid patterns but are NOT real card numbers.
        String[] fakeCards = {
            "4111 1111 1111 1111", // Visa test pattern
            "5500 0000 0000 0004", // MasterCard test pattern
            "3400 0000 0000 009",  // Amex test pattern
            "6011 0000 0000 0004"  // Discover test pattern
        };
 
        for (String card : fakeCards) {
            System.out.println("Processing fake card: " + card);
        }
 
        System.out.println("DLP test complete — no real data used.");
    }
}
