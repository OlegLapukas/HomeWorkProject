package JavaRushWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ChainOfWords {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        //...
        StringBuilder result = getLine(bf.readLine().split(" "));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        //создаем список из переданного аргумента
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

        //Collections.sort(list);
        //System.out.println(list);

        StringBuilder sb = new StringBuilder();
        //если слов нет - возвращаем пустой StringBuilder
        if (words.length == 0) {
            return new StringBuilder();
        }
        //берём первое слово из списка и добавляем в StringBuilder и удаляем это слово
        sb.append(list.remove(0));

        //два вложеных цикла
        for (int j = 0; j < list.size(); ) {
            int stap = list.size();

            for (int i = 0; i < list.size(); i++) {
                //берём первое слово
                String s = list.get(i);

                //если 1я бува из StringBuilder совпадает с последней нового слова
                if (sb.substring(0, 1).equalsIgnoreCase(s.substring(s.length() - 1))) {
                    //добавляем это слово в начало, и тут же удалаяем
                    sb.insert(0, list.remove(i) + " ");
                    //поскольку список сдвинулся, нужно уменьшить счетчик
                    i--;

                    //если же последняя бува из StringBuilder совпадает с 1й буквой нового слова
                } else if (sb.substring(sb.length() - 1).equalsIgnoreCase(s.substring(0, 1))) {
                    //добавляем это слово в конец, и тут же удалаяем
                    sb.append(" ").append(list.remove(i));
                    //поскольку списко сдвинулся, нужно уменьшить счетчик
                    i--;
                }
            }

            if (stap <= list.size()) {
                break;
            }
        }
        //слова которые не были добавлены, поскольку ни первая ни последняя буквы не совпадают со строкой в StringBuilder
        //добавляем в конец
        for (String str : list) {
            sb.append(" ");
            sb.append(str);

        }

        return sb;
    }
}
