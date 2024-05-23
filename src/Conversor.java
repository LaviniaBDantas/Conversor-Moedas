import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class Conversor {
    public String converte(String moedaOrigem, String moedaDestino, Double valor) throws IOException {

        String url_str = "https://v6.exchangerate-api.com/v6/5b39a9fadff24897afc63aa9/pair/"+moedaOrigem+"/"+moedaDestino+"/"+valor;
// Making Request
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

// Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

// Accessing object
        Double req_result = jsonobj.get("conversion_result").getAsDouble();
        return "Valor "+valor+"["+moedaOrigem+"] "+"corresponde ao valor final de: "+req_result+"["+moedaDestino+"]"; //tem que retornar a nova moeda
    }
}
