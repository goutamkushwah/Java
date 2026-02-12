import java.util.*;

public class cod {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        // Read the 3 lines of 7-segment display
        String[] lines = new String[3];
        for (int i = 0; i < 3; i++) {
            lines[i] = scanner.nextLine();
        }
        
        // Parse characters from the display
        List<String> characters = parseCharacters(lines, n);
        
        // Find the faulty character
        int faultyPosition = findFaultyCharacter(characters);
        
        System.out.println(faultyPosition);
        
        scanner.close();
    }
    
    private static List<String> parseCharacters(String[] lines, int n) {
        List<String> characters = new ArrayList<>();
        
        // Each character occupies 3 columns in the display
        for (int i = 0; i < n; i++) {
            StringBuilder pattern = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    int pos = i * 3 + col;
                    if (pos < lines[row].length()) {
                        pattern.append(lines[row].charAt(pos));
                    } else {
                        pattern.append(' ');
                    }
                }
            }
            characters.add(pattern.toString());
            // Debug output
            System.err.println("Character " + (i+1) + ": '" + pattern.toString() + "'");
        }
        
        // Debug: print all lines
        System.err.println("Line 0: '" + lines[0] + "'");
        System.err.println("Line 1: '" + lines[1] + "'");
        System.err.println("Line 2: '" + lines[2] + "'");
        
        return characters;
    }
    
    private static int findFaultyCharacter(List<String> characters) {
        // Try toggling each LED in each character
        for (int charIndex = 0; charIndex < characters.size(); charIndex++) {
            String originalPattern = characters.get(charIndex);
            
            // Try toggling each position in the 3x3 matrix
            for (int pos = 0; pos < 9; pos++) {
                String modifiedPattern = toggleLED(originalPattern, pos);
                characters.set(charIndex, modifiedPattern);
                
                // Check if this makes the equation correct
                if (isEquationCorrect(characters)) {
                    return charIndex + 1; // 1-indexed
                }
                
                // Restore original pattern
                characters.set(charIndex, originalPattern);
            }
        }
        
        return 1; // Fallback
    }
    
    private static String toggleLED(String pattern, int position) {
        char[] chars = pattern.toCharArray();
        char current = chars[position];
        
        // Toggle between space and the appropriate character
        if (current == ' ') {
            // Determine what character to place based on position
            if (position == 1 || position == 3 || position == 5 || position == 7) {
                chars[position] = '|';
            } else if (position == 0 || position == 2 || position == 6 || position == 8) {
                chars[position] = '_';
            } else {
                chars[position] = '|';
            }
        } else {
            chars[position] = ' ';
        }
        
        return new String(chars);
    }
    
    private static boolean isEquationCorrect(List<String> characters) {
        // Decode the equation
        String equation = decodeEquation(characters);
        
        // Find the equals sign
        int equalsIndex = equation.indexOf('=');
        if (equalsIndex == -1) return false;
        
        String leftSide = equation.substring(0, equalsIndex);
        String rightSide = equation.substring(equalsIndex + 1);
        
        // Evaluate left side (left-to-right, no precedence)
        int result = evaluateExpression(leftSide);
        
        // Parse right side (should be a number)
        int expected;
        try {
            expected = Integer.parseInt(rightSide);
        } catch (NumberFormatException e) {
            return false;
        }
        
        return result == expected;
    }
    
    private static String decodeEquation(List<String> characters) {
        StringBuilder equation = new StringBuilder();
        
        for (String pattern : characters) {
            Character decoded = decodeCharacter(pattern);
            if (decoded != null) {
                equation.append(decoded);
            } else {
                // If we can't decode, return invalid equation
                return "invalid";
            }
        }
        
        System.err.println("Decoded equation: " + equation.toString());
        return equation.toString();
    }
    
    private static Character decodeCharacter(String pattern) {
        // Define patterns for each character based on the examples
        // Pattern format: 9 characters representing 3x3 matrix (row by row)
        
        // Based on Example 1: "1+2=9"
        // Character 1: '     |  |' -> '1'
        if (pattern.equals("     |  |")) return '1';
        
        // Character 2: '   |_ |  ' -> '+'
        if (pattern.equals("   |_ |  ")) return '+';
        
        // Character 3: ' _  _||_ ' -> '2'
        if (pattern.equals(" _  _||_ ")) return '2';
        
        // Character 4: '    _  _ ' -> '='
        if (pattern.equals("    _  _ ")) return '=';
        
        // Character 5: ' _ |_| _|' -> '9'
        if (pattern.equals(" _ |_| _|")) return '9';
        
        // Based on Example 2: "2+3=11"
        // Character 1: ' _  _||_ ' -> '2' (same as above)
        // Character 2: '   |_ |  ' -> '+' (same as above)
        // Character 3: ' _  _| _|' -> '3'
        if (pattern.equals(" _  _| _|")) return '3';
        
        // Character 4: '    _  _ ' -> '=' (same as above)
        // Character 5: '     |  |' -> '1' (same as first character)
        // Character 6: '     |  |' -> '1' (same as first character)
        
        // Additional patterns for other digits
        if (pattern.equals(" _ | ||_|")) return '0';
        if (pattern.equals("   |_|   ")) return '4';
        if (pattern.equals(" _ |_  _ ")) return '5';
        if (pattern.equals(" _ |_ |_ ")) return '6';
        if (pattern.equals(" _   |   ")) return '7';
        if (pattern.equals(" _ |_| _ ")) return '8';
        
        // Additional operators
        if (pattern.equals("     -   ")) return '-';
        if (pattern.equals("     %   ")) return '%';
        if (pattern.equals("     *   ")) return '*';
        
        return null;
    }
    
    private static Character matchWithTolerance(String pattern) {
        // Try to match patterns with some tolerance for spacing differences
        String normalized = pattern.replaceAll("\\s+", " ").trim();
        
        // For now, return null if no exact match
        return null;
    }
    
    private static int evaluateExpression(String expression) {
        if (expression.isEmpty()) return 0;
        
        int result = 0;
        int i = 0;
        
        // Parse first number
        StringBuilder num = new StringBuilder();
        while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
            num.append(expression.charAt(i));
            i++;
        }
        
        if (num.length() == 0) return 0;
        result = Integer.parseInt(num.toString());
        
        // Process remaining operators and numbers (left-to-right, no precedence)
        while (i < expression.length()) {
            if (i >= expression.length()) break;
            
            char operator = expression.charAt(i);
            i++;
            
            // Parse next number
            num = new StringBuilder();
            while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                num.append(expression.charAt(i));
                i++;
            }
            
            if (num.length() == 0) break;
            int nextNum = Integer.parseInt(num.toString());
            
            // Apply operator
            switch (operator) {
                case '+':
                    result += nextNum;
                    break;
                case '-':
                    result -= nextNum;
                    break;
                case '*':
                    result *= nextNum;
                    break;
                case '%':
                    if (nextNum != 0) {
                        result %= nextNum;
                    }
                    break;
            }
        }
        
        return result;
    }
}