package yurii.coder;

public class CoderRunner {
    public static void main(String[] args) throws Exception {
        if ((args.length !=3)||
                ((!args[0].equalsIgnoreCase("code"))&&(!args[0].equalsIgnoreCase("decode")))) {
            throw new Exception("Wrong arguments");
        }
        String operation = args[0];
        String word = args[1];
        String codeWord =args[2];
        String result;
        if (operation.equalsIgnoreCase ("code")){
            result=Coder.code(word, codeWord);
        } else {
            result=Coder.decode(word,codeWord);
        }
        System.out.println(result);
    }
}
