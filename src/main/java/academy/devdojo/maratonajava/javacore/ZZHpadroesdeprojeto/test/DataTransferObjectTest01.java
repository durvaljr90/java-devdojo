package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        AirCraft airCraft = new AirCraft("777");
        Country country = Country.BRASIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = new Person.PersonBuilder()
                .firstName("Durval")
                .lastName("Nascimento")
                .build();

        ReportDto.ReportDtoBuilder build = ReportDto.ReportDtoBuilder.builder()
                .airCraftName(airCraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(build);
    }
}
