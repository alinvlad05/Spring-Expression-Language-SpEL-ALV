package alv.SpEL.domain;

public class Worker {

    private String name;
    private Country birthPlace;

    public Worker(String name, Country birthPlace) {
        this.name = name;
        this.birthPlace = birthPlace;
    }

    public String getName() {
        return name;
    }

    public Country getBirthPlace() {
        return birthPlace;
    }
}