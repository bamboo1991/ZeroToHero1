package Utils;

public class Payloads {




    public static class PayloadUtils {
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
        public static String getJiraStoryBody(String type,String assignee, String summary, String description, String priority){
            return "{\n" +
                    "    \"fields\": {\n" +
                    "        \"project\": {\n" +
                    "            \"key\": \"JC\"\n" +
                    "        },\n" +
                    "        \"assignee\": {\n" +
                    "            \"name\": \"" + assignee + "\"\n" +
                    "        },\n" +
                    "        \"summary\": \"" + summary + "\",\n" +
                    "        \"description\": \"" + description + "\",\n" +
                    "        \"issuetype\": {\n" +
                    "            \"name\": \""+type+"\"\n" +
                    "        },\n" +
                    "        \"priority\": {\n" +
                    "            \"name\": \"" + priority + "\"\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        }
        public static String getSprintBody(String SprintName,String Goal){
            return "{\n" +
                    "  \"name\": \""+SprintName+"\",\n" +
                    "  \"startDate\": \"2020-04-11T15:22:00.000+10:00\",\n" +
                    "  \"endDate\": \"2020-04-25T15:22:00.000+10:00\",\n" +
                    "  \"originBoardId\": 1,\n" +
                    "  \"goal\": \""+Goal+"\"\n" +
                    "}";
        }
        public static String logInBody(String jiraUserName, String jiraPassword){
            return "{\n" +
                    "    \"username\": \""+ConfigReader.getProperty("jiraUserName")+"\",\n" +
                    "    \"password\": \""+ConfigReader.getProperty("jiraPassword")+"\"\n" +
                    "}";
        }
        public static String getComment(String comment){
            return "{\n" +
                    "\"body\": \""+comment+"\"\n" +
                    "}";
        }
    }

}
