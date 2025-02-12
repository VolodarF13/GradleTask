import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> myName = new HashMap<>();
        myName.put("Name", "Volodymyr");
        myName.put("lastName", "Bodnarchuk");

        System.out.println(new Gson().toJson(myName));
    }
}
