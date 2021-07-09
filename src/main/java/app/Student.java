package app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private String regNo;
    private String name;
    private String course;
    private String password;

    public Student(){

    }

    public String getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getPassword() {
        return password;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }


    @Override
    public String toString() {
        return "Student{" +
                "regNo='" + regNo + '\'' +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void comment(){

    }

}
