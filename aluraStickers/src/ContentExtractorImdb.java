import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContentExtractorImdb implements ContentExtractor {
    public List<Content> extractContent(String json) {

        // Extrair só os dados que interessam (título, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> atributesList = parser.parse(json);

        List<Content> contents = new ArrayList<>();

        // Popular a lista de conteúdos
        for (Map<String, String> atributes : atributesList) {
            String title = atributes.get("title");
            String urlImage = atributes.get("image");
            var content = new Content(title, urlImage);

            contents.add(content);
        }

        return contents;
    }
}
