package com.mockr;
import com.mockr.BadDogException;

public class Puppy {
    public Puppy() {

    }

    public String talk() {
        return "woof!";
    }

    public Boolean walk() {
        return true;
    }

    public void stay() throws Exception {
        throw new BadDogException(this.talk());
    }
}
