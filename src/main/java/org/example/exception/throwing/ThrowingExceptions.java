package org.example.exception.throwing;

public class ThrowingExceptions {
    public static void main(String[] args) {
        // 됨
        try {
            throw new Unchecked("unchecked exception");
        } catch (Unchecked unchecked) {
            unchecked.printStackTrace();
        }

        // 안됨
        try {
            throw new Checked("checked exception");
        } catch (Checked checked) {
            checked.printStackTrace();
        }
    }
}
