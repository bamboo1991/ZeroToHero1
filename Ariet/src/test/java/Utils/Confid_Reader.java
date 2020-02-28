package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Confid_Reader {

        private static Properties configFile;
        static {
            String path = "VIP.properties";
            try {
                FileInputStream input = new FileInputStream(path);
                configFile=new Properties();
                configFile.load(input);
                input.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        public static String getProperty(String key){
            return configFile.getProperty(key);
        }
    }

