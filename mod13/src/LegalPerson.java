public class LegalPerson extends Person {
    private String employerIdentificationNumber;

    public String getEmployerIdentificationNumber() {
        return employerIdentificationNumber;
    }

    public void setEmployerIdentificationNumber(String employerIdentificationNumber) {
        this.employerIdentificationNumber = employerIdentificationNumber;
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica{" +
                "Razão Social'" + getName() + '\'' +
                ", CNPJ='" + employerIdentificationNumber + '\'' +
                '}';
    }
}
