import jakarta.xml.ws.Endpoint;
import ws.BanqueService;
import ws.BanqueService;

public class serverJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("web sevice déployé sur http://0.0.0.0:9191/" );
    }
}
