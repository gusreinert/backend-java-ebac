public class Main {
    public static void main(String[] args) {
        NaturalPerson naturalPerson = new NaturalPerson();
        naturalPerson.setName("Gustavo");
        naturalPerson.setSocialSecurityNumber("42788973403");

        System.out.println(naturalPerson);

        LegalPerson legalPerson = new LegalPerson();
        legalPerson.setName("ESCOLA BRITÂNICA DE ARTES CRIATIVAS S.A");
        legalPerson.setEmployerIdentificationNumber("23465802000172");

        System.out.println(legalPerson);
    }
}