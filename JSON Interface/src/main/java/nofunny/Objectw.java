package nofunny;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Objectw implements JSON{

//    @JsonProperty("Number")
    private Integer id;

//    @JsonProperty("FullName")
    private String fio;

    private Integer age;

//    @JsonProperty("Lessons")
    private List<String>lessons;

    public Objectw(){}


    public Objectw(Integer id, String fio, Integer age, List<String>lessons) {
        this.id = id;
        this.fio = fio;
        this.age = age;
        this.lessons = lessons;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setLessons(List<String> lessons) {
        this.lessons = lessons;
    }

    public List<String> getLessons() {
        return lessons;
    }


    @Override
    public void writeToJson() {
    }

    @Override
    public Objectw readFromJson() {
        return null;
    }

    @Override
    public String toString() {
        return id.toString() + " " + fio.toString() + " " + age.toString() + " " + lessons.toString();
    }
}
