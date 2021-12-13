package sshumski.Lab8;

import java.io.IOException;

import static sshumski.Lab8.JsonReader.readJSONFaceBookGraph;

public class UrlGetJSONExample {
    private static final String GRAPH_FACEBOOK = "http://headers.jsontest.com/";

    public static void main(String[] args) {
        String json = null;
        try {
            json = readJSONFaceBookGraph(GRAPH_FACEBOOK);
        } catch (IOException e) {
            System.out.println("Ошибка при скачивании информации URL - "
                    + e.getMessage());
            e.printStackTrace();
        }
        assert json != null;
        System.out.println(json);
//      System.out.println(json.get("id"));
    }
}
