package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField{


    public Employer() {
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
        this();
        this.value = value;
    }

}
