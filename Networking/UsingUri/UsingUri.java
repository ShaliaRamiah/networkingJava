import java.net.URI;
import java.net.URISyntaxException;
public class UsingUri {
    public static void main(String[] args) throws NullPointerException, URISyntaxException {
        URI uri = new URI("http://www.example.com");
        System.out.println("URI : " + uri);
        System.out.println(uri.getScheme());
    }
}