package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class ReportDto {
    private String airCraftName;
    private Country country;
    private Currency currency;
    private String personName;

    public static final class ReportDtoBuilder {
        private String airCraftName;
        private Country country;
        private Currency currency;
        private String personName;

        private ReportDtoBuilder() {

        }

        public ReportDtoBuilder(String airCraftName, Country country, Currency currency, String personName) {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder airCraftName(String airCraftName) {
            this.airCraftName = airCraftName;
            return this;
        }

        public ReportDtoBuilder country (Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }
        
        public ReportDtoBuilder build() {
            return new ReportDtoBuilder(airCraftName, country, currency, personName);
        }

        @Override
        public String toString() {
            return "ReportDtoBuilder{" +
                    "airCraftName='" + airCraftName + '\'' +
                    ", country=" + country +
                    ", currency=" + currency +
                    ", personName='" + personName + '\'' +
                    '}';
        }
    }
}
