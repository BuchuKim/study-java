package org.example.caesar;

public class Client {
    public static void main(String[] args) {
        CaesarEncryption caesarEncryption = new CaesarEncryption(100);
        CaesarFile caesarFile = new CaesarFile(caesarEncryption);

        caesarFile.encrypt("hello.txt","encrypt.txt");
        caesarFile.decrypt("encrypt.txt","decrypt.txt");
    }
}
