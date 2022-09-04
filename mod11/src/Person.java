public class Person {

    private String name;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isMale() {
        return getSex().charAt(0) == 'M';
    }

    public boolean isFemale() {
        return getSex().charAt(0) == 'F';
    }
}
