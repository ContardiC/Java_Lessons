package spacecoding.strings;

import java.util.StringTokenizer;

/**
 * StringTokenizerExamples
 */
public class StringTokenizerExamples {
    public static void main(String[] args) {
        // esempio di token 
        StringTokenizer str = new StringTokenizer("cat dog otter");
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }

        // esempio di token con separatore (punto e virgola)
        StringTokenizer films = new StringTokenizer("Blade Runner;E.T.;Il Cavaliere Oscuro",";");
        System.out.println("Sono registrati " + films.countTokens() +" films");
        while(films.hasMoreTokens()){
            System.out.println(films.nextToken());
        }
    }
}

