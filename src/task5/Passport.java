package task5;

public class Passport {
    String number;
    String name;
    String surname;
    String birthday;

    public Passport(String number, String name, String surname, String birthday) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Passport: " + "number: " + number + ", name:" + name + ", surname: " + surname + ", birthday: " + birthday;
    }
}