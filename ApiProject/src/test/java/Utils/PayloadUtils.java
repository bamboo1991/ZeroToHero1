package Utils;

public class PayloadUtils {
    public static String getPetPayLoad(int id){
        return "{\n" +
                "    \"id\": "+id+"\n," +
                "    \"category\": {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"<string>\"\n" +
                "    },\n" +
                "    \"name\": \"BlackCar\",\n" +
                "    \"photoUrls\": [\n" +
                "        \"<string>\",\n" +
                "        \"<string>\"\n" +
                "    ],\n" +
                "    \"tags\": [\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"name\": \"<string>\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"name\": \"<string>\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"available\"\n" +
                "}";
    }
    public static String setUserNameAndJobTitle(String name, String job){
        return "{\n" +
                "    \"name\": \"" + name + "\",\n" +
                "    \"job\": \"" + job + "\"\n" +
                "}";
    }
    public static String getAuthPayload(){
        return  "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"\n" +
                "}";
    }
}
