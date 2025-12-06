package ExtractingHashtagsFromAText;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HashtagExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        String regex = "#[\\wÀ-ÿ]+";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto);

        List<String> hashtagsEncontradas = new ArrayList<>();

        while (matcher.find()) {
            hashtagsEncontradas.add(matcher.group());
        }

        if (hashtagsEncontradas.isEmpty()) {
            System.out.println("Nenhuma hashtag encontrada.");
        } else {
            System.out.println("Hashtags encontradas: " + String.join(", ", hashtagsEncontradas));
        }

        scanner.close();
    }
}
