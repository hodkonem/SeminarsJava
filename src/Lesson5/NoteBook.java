package Lesson5;

public class NoteBook {
    private String ram;
    private String hdd;
    private String os;
    private String color;

    public NoteBook(String ram, String hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }
}
