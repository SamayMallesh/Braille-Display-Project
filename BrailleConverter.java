import java.util.HashMap;

public class BrailleConverter {
    private static final HashMap<Character, String> brailleMap = new HashMap<>();

    static {
        // Lowercase letters
        brailleMap.put('a', "100000");
        brailleMap.put('b', "101000");
        brailleMap.put('c', "110000");
        brailleMap.put('d', "110100");
        brailleMap.put('e', "100100");
        brailleMap.put('f', "111000");
        brailleMap.put('g', "111100");
        brailleMap.put('h', "101100");
        brailleMap.put('i', "011000");
        brailleMap.put('j', "011100");
        brailleMap.put('k', "100010");
        brailleMap.put('l', "101010");
        brailleMap.put('m', "110010");
        brailleMap.put('n', "110110");
        brailleMap.put('o', "100110");
        brailleMap.put('p', "111010");
        brailleMap.put('q', "111110");
        brailleMap.put('r', "101110");
        brailleMap.put('s', "011010");
        brailleMap.put('t', "011110");
        brailleMap.put('u', "100011");
        brailleMap.put('v', "101011");
        brailleMap.put('w', "011101");
        brailleMap.put('x', "110011");
        brailleMap.put('y', "110111");
        brailleMap.put('z', "100111");

        // Uppercase letters map to same Braille as lowercase
        for (char c = 'A'; c <= 'Z'; c++) {
            brailleMap.put(c, brailleMap.get(Character.toLowerCase(c)));
        }

        // Space
        brailleMap.put(' ', "000000");
    }

    public static String convertToBraille(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(brailleMap.getOrDefault(c, "??????")).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String text = "Hello World";
        String braille = convertToBraille(text);
        System.out.println("Text: " + text);
        System.out.println("Braille: " + braille);
    }
}
