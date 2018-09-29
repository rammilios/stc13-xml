package ru.innopolis.stc.xmlserializer;

public class Students {

    public Students(){}

    private Integer id;
    private String name;
    private boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer fieldOne) {
        this.id = fieldOne;
    }

    public String getName() {
        return name;
    }

    public void setName(String fieldTwo) {
        this.name = fieldTwo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean fieldThree) {
        this.status = fieldThree;
    }

    @Override
    public String toString() {
        return "Students [fieldOne=" + id + ", fieldTwo=" + name
                + ", fieldThree=" + status + "]";
    }
}
