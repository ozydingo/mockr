package com.mockr;

public class PuppyTest {
    public static void main(String[] args) {
        testTalk();

        System.out.println("Good boy!");
    }

    private static void testTalk() {
        Puppy fido = new Puppy();
        String response = fido.talk();
        assert response == "woof!";
    }
}
