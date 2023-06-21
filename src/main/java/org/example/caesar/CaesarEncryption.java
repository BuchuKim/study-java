package org.example.caesar;

public class CaesarEncryption {
    private final int distance;
    CaesarEncryption(int distance) {
        this.distance = distance;
    }

    public String encrypt(String plain) {
        StringBuilder cipher = new StringBuilder();
        for (Character c : plain.toCharArray()) {
            cipher.append((char) ((int) c + distance));
        }
        return cipher.toString();
    }

    public String decrypt(String cipher) {
        StringBuilder plain = new StringBuilder();
        for (Character c : cipher.toCharArray()) {
            plain.append((char) ((int) c - distance));
        }
        return plain.toString();
    }
}
