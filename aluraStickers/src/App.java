import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Fazer uma conexão HTPP e buscar os top 250 filmes

        //String url = "https://api.mocki.io/v2/549a5d8b";
        //ContentExtractor extractor = new ContentExtractorImdb();

        //String url = "https://api.nasa.gov/planetary/apod?api_key=LCzeTJgXlGCjvbuMLJSCexKbOJfCw5PaY6CyoBJC&start_date=2022-06-12&end_date=2022-06-14";
        //ContentExtractor extractor = new ContentExtractorNasa();

        String url = "http://localhost:8080/linguagens";
        ContentExtractor extractor = new ContentExtractorImdb();

        var http = new HttpAmbient();
        String json = http.searchData(url);

        // Extrair só os dados que interessam (título, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> contentList = parser.parse(json);

        // Exibir e manipular os dados
        List<Content> contents = extractor.extractContent(json);

        var generator = new StickersGenerator();

        for (int i = 0; i < 3; i++) {

            Content content = contents.get(i);

            InputStream inputStream = new URL(content.getUrlImage()).openStream();
            String archiveName = "output/" + content.getTitle() + ".png";

            generator.create(inputStream, archiveName);

            System.out.println(content.getTitle());
            System.out.println();
        }
    }
}
