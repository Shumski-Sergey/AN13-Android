/*
package sshumski.Lab8;

import org.json.simple.JSONObject;

import java.io.IOException;

import static sshumski.Lab8.JsonReader.readJSONByUrl;

public class UrlGetJSONExample {
    private static final String GRAPH_FACEBOOK = "http://headers.jsontest.com/";

    public static void main(String[] args) {
        JSONObject jsonObject = null;
        try {
            jsonObject = readJSONByUrl(GRAPH_FACEBOOK);
        } catch (IOException e) {
            System.out.println("Ошибка при скачивании информации URL - "
                    + e.getMessage());
            e.printStackTrace();
        }
        assert jsonObject != null;
        // Для нормального преобразования потребудется еще одна библиотека https://github.com/google/gson
        System.out.println(jsonObject.get("Accept"));
    }
}
*/
