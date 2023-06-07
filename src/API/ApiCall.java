package API;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCall {
    public static void main(String[] args) {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(
                        URI.create("https://league-of-legends-esports.p.rapidapi.com/teams?id=lng-esports")
                ).header("accept", "application/json")
                .build();

        //var response = client.send(request, new HttpResponse.BodyHandler<>(APOD.class) {
        //});
    }
}
