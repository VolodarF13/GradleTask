import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> myName = new HashMap<>();
        myName.put("Name", "Volodymyr");
        myName.put("lastName", "Bodnarchuk");

        Gson gson = new Gson();
        final String json = gson.toJson(myName);

        System.out.println(json);
    }
}
