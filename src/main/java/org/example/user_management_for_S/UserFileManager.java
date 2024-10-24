package org.example.user_management_for_S;

import java.io.FileWriter;
import java.io.IOException;

// UserFileManager.java
public class UserFileManager {
    public void saveToFile(User user) {
        try (FileWriter fileWriter = new FileWriter(user.getName() + ".txt"))
        {
            fileWriter.write("Name: " + user.getName() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
