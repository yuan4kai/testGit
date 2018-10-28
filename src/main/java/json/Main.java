package json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by yk on 2018/10/28.
 */
public class Main {
    public static void main(String[] arg) throws Exception {
        String json = "{\n" +
                "    \"name\": \"BeJson\",\n" +
                "    \"url\": \"http://www.bejson.com\",\n" +
                "    \"page\": 88,\n" +
                "    \"isNonProfit\": true,\n" +
                "    \"address\": {\n" +
                "        \"street\": \"科技园路.\",\n" +
                "        \"city\": \"江苏苏州\",\n" +
                "        \"country\": \"中国\"\n" +
                "    },\n" +
                "    \"links\": [\n" +
                "        {\n" +
                "            \"name\": \"xiao\",\n" +
                "            \"sex\": \"男\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"xiao\",\n" +
                "            \"sex\": \"男\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"xiao\",\n" +
                "            \"sex\": \"男\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        //TypeToken typeToken=new TypeToken<List<String>>() {}.getType();


        Gson gson = new Gson();
        //  Type type=new TypeToken<List<String>>() {}.getType();
        // gson.fromJson(json, type);
        Map<String, Object> map = gson.fromJson(json, Map.class);
        System.out.println(map.get("links").getClass());
        String json2 = "{“found”:2,\"records\":[{\"Channel\":0,\"CreateTime\":1481597517,\"RecNo\":1,\"Method\":\"one\"},{\"Channel\":0,\"CreateTime\":1481597517,\"RecNo\":1,\"Method\":\"two\"}]}";

        map = gson.fromJson(json2, Map.class);
        System.out.println(map.get("records").getClass());
        System.out.println(map.get("dfdf"));
    }
}
