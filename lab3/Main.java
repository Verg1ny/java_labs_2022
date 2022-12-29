import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] arg) {
        //Написать программу, которая проверяет, является ли строка палиндромом
        System.out.println("Task 1");
        String one = "ада";
        System.out.println("Введенная строка " + one);
        if (one.equals((new StringBuffer(one)).reverse().toString())) {
            System.out.println("Введенная строка палиндром");
        } else
            System.out.println("Введенная строка не является палиндромом");
        System.out.println("----------");

        //Реализовать удаление повторяющихся символов в строке
        System.out.println("Task 2");
        String two = "бананc";
        String result="";
        for (int i = 0; i < two.length() ; i++) {
            if (two.indexOf(two.charAt(i)) == two.lastIndexOf(two.charAt(i))) {
                result+=two.charAt(i);
            }
        }

        //System.out.println("Полученная строка: " + two);
        //System.out.println(two.replaceAll("(.)(?=.*\\1)", ""));
        System.out.println(result);
        System.out.println("----------");

        //Реализовать проверку, являются ли две строки анаграммами
        System.out.println("Task 3");
        String str1 = "road";
        String str2 = "йцук";
        System.out.println("Введенное слово 1: "+str1+" "+"Введенное слово 2: "+str2);
        int a = str1.length();
        int b = str2.length();
        if (a == b) {
            char[] a1 = str1.toCharArray();
            char[] a2 = str2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if (Arrays.equals(a1, a2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
        System.out.println("----------");

        //Напишите Java-программу для лексикографического сравнения двух строк
        System.out.println("Task 4");
        String word1 = "Java";
        String word2 = "java";
        System.out.println(word1.compareTo(word2));
        System.out.println("----------");

        //Напишите Java-программу для лексикографического сравнения двух строк, игнорируя различия в регистре
        System.out.println("Task 5");
        String word3 = "Java";
        String word4 = "java";
        System.out.println(word3.compareToIgnoreCase(word4));
        System.out.println("----------");

        //Напишите программу на Java для объединения данной строки в конец другой строки
        System.out.println("Task 6");
        String word5 = "Я ЛЮБЛЮ МТУСИ";
        String word6 = "БУТ1901";
        System.out.println(word6+" "+word5);
        System.out.println("----------");

        //Напишите Java-программу для сравнения заданной строки с указанной последовательностью символов
        System.out.println("Task 7");
        String word7 = "Привет";
        CharSequence word71 = "Я ВСЁ ЕЩЁ ЛЮБЛЮ МТУСИ";
        if (word7.contentEquals(word71) == true) {
            System.out.println("Строки совпадают");
        }
        else {
            System.out.println("Строки различны");
        }
        System.out.println("----------");

        //Напишите программу на Java, чтобы проверить, заканчивается ли данная строка содержимым другой строки
        System.out.println("Task 8");
        String word8 = "начало";
        String word81 = "Это был длинный текст который заканчивался словом начало";
        System.out.println(word81.endsWith(word8));
        System.out.println("----------");

        //Напишите программу на Java, чтобы проверить, содержат ли два объекта String одинаковые данные
        System.out.println("Task 9");
        String word9 = "мама мыла раму";
        String word91 = "мыла раму мама";
        System.out.println(word9.equals(word91));
        System.out.println("----------");

        //Напишите Java-программу, чтобы получить длину заданной строки
        System.out.println("Task 10");
        String word10 = "1234567890";
        System.out.println("Длина строки: "+ word10.length());
        System.out.println("----------");

        //Напишите программу на Java, чтобы преобразовать все символы строки в нижний регистр
        System.out.println("Task 11");
        String word11 = "ЛАДА Седан еХаЛА очЕНЬ долГо";
        System.out.println(word11.toLowerCase());
        System.out.println("----------");

        //Напишите программу на Java, чтобы преобразовать все символы в строке в верхний регистр
        System.out.println("Task 12");
        System.out.println(word11.toUpperCase());
        System.out.println("----------");

        //Напишите программу на Java, чтобы найти второй по частоте символ в данной строке
        System.out.println("Task 13");
        Map <String, Integer> letters = new HashMap<String,Integer>();

        String words = "aaabbcccdefffnnnn";
        int wordLen = words.length();
        int countLetter = 0;
        for (int i = 0; i < wordLen; ){
            int countNum=0;
            char temp = words.charAt(i);
            int index = i;
            boolean flag = true;
            while (flag) {
                if(words.indexOf(temp, index) != -1) {
                    countNum++;
                    index++;
                }else{
                    flag = false;
                    i=index;
                }
            }
            letters.put(Character.toString(temp),countNum);
        }
        String maxKey = null;
        for (String key : letters.keySet()) {
            if (maxKey == null || letters.get(key) > letters.get(maxKey)) {
                maxKey = key;
            }
        }
        letters.remove(maxKey);
        maxKey = null;
        for (String key : letters.keySet()) {
            if (maxKey == null || letters.get(key) > letters.get(maxKey)) {
                maxKey = key;
            }
        }
        System.out.println(maxKey);
        System.out.println("----------");


        //Напишите программу на Java для печати после удаления дубликатов из заданной строки
        System.out.println("Task 14");
        StringBuilder sb = new StringBuilder();
        String str14 = "112334551";
        str14.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println(sb);
        System.out.println("----------");

        //Напишите программу на Java, чтобы найти первый неповторяющийся символ в строке
        System.out.println("Task 15");
        String s = "aabbcddeff";
        boolean first = true;
        for (int i = 0; i < s.length() && first; i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                System.out.printf("%c\n", s.charAt(i));
                first = false;
            }
        }
        System.out.println("----------");

        //Напишите программу на Java, которая возвращает true из заданной строки, если первые два символа в строке также появляются в конце
        System.out.println("Task 16");
        String word16 = "ДАпраоапрвлавда";
        String beggin = (word16.substring(0,2)).toLowerCase();
        String end = (word16.substring(word16.length()-2)).toLowerCase();
        System.out.println(beggin.equals(end));
        System.out.println("----------");

        //Напишите программу на Java, которая возвращает количество символов, появляющихся три раза подряд в строке
        System.out.println("Task 17");
        String word17 = "aaabbcccdefffnnnn";
        int len17 = word17.length();
        int countWords = 0;
        for (int i = 0; i < len17; ){
            int countNum=0;
            char temp = word17.charAt(i);
            int index = i;
            boolean flag = true;
            while (flag) {
                if(word17.indexOf(temp, index) != -1) {
                    countNum++;
                    index++;
                }else{
                    flag = false;
                    i=index;
                }
            }
            if(countNum == 3){
                countWords++;
            }
        }
        //String prev = null;
        System.out.println(countWords);
        System.out.println("----------");


        //Напишите программу на Java, которая возвращает сумму цифр, присутствующих в строке. Если цифр нет, возвращаемая сумма равна 0
        System.out.println("Task 18");
        String word18 = "ff22ff";
        word18 = word18.replaceAll("[^0-9]", "");
        if (word18.isEmpty()){
            System.out.println("В строке нет цифр, сумма 0");
        }
        else{
            int sum = 0;
            boolean check = true;
            int chislo = Integer.parseInt(word18);
            System.out.println(word18);
            while (check){
                sum+=chislo%10;
                chislo/=10;
                if(chislo <= 0){
                    check = false;
                }
            }
            System.out.println(sum);
        }
    }
}
