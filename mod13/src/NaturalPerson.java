public class NaturalPerson extends Person {
    private String socialSecurityNumber;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Pessoa Física{" +
                "Nome='" + getName() + '\'' +
                ", CPF='" + socialSecurityNumber + '\'' +
                '}';
    }
}
