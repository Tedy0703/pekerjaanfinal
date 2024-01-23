package helper;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;

public class Utility {
    public static File getJSONSchemaFile(String JSONFile) {
        return new File("src/test/java/helper/JSONSchemaData/" + JSONFile);
    }
    public static String generateRandomEmail(){
        String allowedChars = "abcdefghijklmnopqrstuwvxyz" + "1234567890" + "_-.";
        String email ="";
        String temp = RandomStringUtils.randomAlphanumeric(10); // panjang karakter untuk email
        email = temp + "testdata.com";
        return email;
    }
}



