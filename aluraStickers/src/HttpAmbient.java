import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpAmbient {
    public String searchData(String url) {

        try {
            URI adress = URI.create(url);
            var client = java.net.http.HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder(adress).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            return body;
        }catch ( IOException | InterruptedException ex){
            throw new RuntimeException(ex);
        }

    }
}
