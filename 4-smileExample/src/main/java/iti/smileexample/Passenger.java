package iti.smileexample;

public class Passenger {
    Integer pclass;
    Integer survived;
    String name;
    String sex;
    Double age;
  
public Passenger(){

}

    public Passenger(Integer pclass, Integer survived, String name, String sex, Double age) {
        this.pclass = pclass;
        this.survived = survived;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Integer getPclass() {
        return pclass;
    }

    public Integer getSurvived() {
        return survived;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Double getAge() {
        return age;
    }

    public void setPclass(Integer pclass) {
        this.pclass = pclass;
    }

    public void setSurvived(Integer survived) {
        this.survived = survived;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passenger{" + "pclass=" + pclass + ", survived=" + survived + ", name=" + name + ", sex=" + sex + ", age=" + age + '}';
    }

    
}
