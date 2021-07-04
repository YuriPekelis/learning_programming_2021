package yurii.coder;

import java.util.prefs.BackingStoreException;

public class Coder {
    private static final int startAscii = 97;
    private static final int finalAscii = 122;
    public static String code (String word,String codeWord) throws IllegalArgumentException {
        String codedWord = "";
        for(int i=0; i<word.length(); i++){
            if ((word.charAt(i)<startAscii)||(word.charAt(i)>finalAscii)){
                throw new IllegalArgumentException(String.format("Symbol '%s' is illegal", word.charAt(i)));
            }
            int wordSymbolInABC = word.charAt(i) - startAscii + 1; // number of the current symbol of word in alphabet
            int codeWordSymbolInABC = codeWord.charAt(i % codeWord.length()) - startAscii + 1; // number of the current symbol of codeWord in alphabet
            int codedSymbolInABC = (wordSymbolInABC + codeWordSymbolInABC) % 26; // number of the codded symbol in alphabet
            codedWord = codedWord + (char)(codedSymbolInABC + startAscii -1);
        }
        return codedWord;
    }
    public static String decode (String codedWord, String decoderWord){
        return "";
    }
}
