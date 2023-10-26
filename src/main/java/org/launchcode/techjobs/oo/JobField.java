package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    //Fields used by all child classes
    private int id;
    private static int nextId=1;
    private String value;

    private String jobField;

    @Override
    public abstract String toString();

    //do getts and setters need to be abstract??
    public String getValue(){
        return value;
    }

    public int getID(){
        return id;
    }

    public abstract String getJobField();

    public void setJobField(String jobField){
        this.jobField=jobField;
    }

    public void setValue(String value) {
        this.value = value;
    }+

    //does creating the field of JobField allow me to use all of these methods for the different classes?
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField jobField1)) return false;
        return id == jobField1.id && Objects.equals(getJobField(), jobField1.getJobField());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getJobField());
    }
}
