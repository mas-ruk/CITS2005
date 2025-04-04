class WordTools {
    // word consists of only A-Z letters no other symbols
    private static boolean isWord(String string) {
        // convert to character array
        char[] chars = string.toCharArray();
        
        // iterate through array
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isLowerCaseWord(String string) {
        // convert to character array
        char[] chars = string.toCharArray();

        // iterate through array
        for (char c : chars) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isUpperCaseWord(String string) {
        // convert to character array
        char[] chars = string.toCharArray();

        // iterate through array
        for (char c : chars) {
            if (!Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSarcasmCaseWord(String string) {
        // should return false if string is not a word
        // i.e. eXaMpLe and ExAmPlE are sarcasm case

        // convert to character array
        char[] chars = string.toCharArray();

        // iterate through array
        for (int i = 1; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i]) != Character.isLowerCase(chars[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("isWord Test 1: " + isWord("Hello")); // true
        System.out.println("isWord Test 2: " +isWord("Hello!")); // false
        System.out.println("isWord Test 3: " +isWord("H ello")); // false
        System.out.println("isLowerCaseWord Test 1: " +isLowerCaseWord("hello")); // true
        System.out.println("isLowerCaseWord Test 2: " +isLowerCaseWord("hI")); // false
        System.out.println("isLowerCaseWord Test 3: " +isUpperCaseWord("TEST")); // true
        System.out.println("isUpperCaseWord Test 1: " +isUpperCaseWord("TEST ")); // false
        System.out.println("isUpperCaseWord Test 2: " +isUpperCaseWord("tEST")); // false
        System.out.println("isSarcasmCaseWord Test 1: " +isSarcasmCaseWord("tEsT")); // true
        System.out.println("isSarcasmCaseWord Test 2: " +isSarcasmCaseWord("TeSt")); // true
        System.out.println("isSarcasmCaseWord Test 3: " +isSarcasmCaseWord("test")); // false
        System.out.println("isSarcasmCaseWord Test 4: " +isSarcasmCaseWord("TeST")); // false
    }
}