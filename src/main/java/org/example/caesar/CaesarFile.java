package org.example.caesar;

import java.io.*;

public class CaesarFile {
    private CaesarEncryption caesarEncryption;
    CaesarFile(CaesarEncryption caesarEncryption) {
        this.caesarEncryption = caesarEncryption;
    }

    void encrypt(String in, String out) {
        try (BufferedReader reader = new BufferedReader(new FileReader(in));
             BufferedWriter writer = new BufferedWriter(new FileWriter(out))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                writer.write(caesarEncryption.encrypt(line));
                writer.newLine();
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    void decrypt(String in, String out) {
        try (BufferedReader reader = new BufferedReader(new FileReader(in));
             BufferedWriter writer = new BufferedWriter(new FileWriter(out))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                writer.write(caesarEncryption.decrypt(line));
                writer.newLine();
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
