import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Гласные и согласные
*/

public class Main {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] result = s.toCharArray();
        for (int i = 0; i < result.length;i++){
            char re = result[i];
            if (isVowel(re)){
                System.out.print(result[i] + " ");}
        }
        System.out.println();
        for (int i = 0; i < result.length ;i++){
            char re = result[i];
            if (!(isVowel(re)) && re != ' '){
                System.out.print(result[i]+" ");}
        }
        if (s.trim().length() > 0){}
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}