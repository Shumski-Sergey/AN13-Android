/*
package sshumski.Lab8;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JsonReader {
    public static JSONObject readJSONByUrl(String url) throws IOException {
        InputStream is = new URL(url).openStream();
        JSONObject jsonObject = null;
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            String jsonText = readAll(rd);
            JSONParser parser = new JSONParser();
            jsonObject = (JSONObject) parser.parse(jsonText);
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            is.close();
        }
        return jsonObject;
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
}
*/
