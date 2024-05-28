package az.students.entity;

import az.students.exception.AgeException;

import java.util.Objects;

public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private String pin;
    private String email;
    private String password;

    public Student() {

    }

    public Student(Long id, String name, String surname, Integer age, String pin, String email, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        try {
            if (age > 17 && age < 50) {
                this.age = age;
            }else {
                throw new AgeException("Age must be in range 18 and 50");
            }
        } catch (AgeException e) {
            e.printStackTrace();
        }
        this.pin = pin;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        try {
            if (age > 17 && age < 50) {
                this.age = age;
            }else {
                throw new AgeException("Age must be in range 18 and 50");
            }
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", pin='" + pin + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
