package Lab1Project;

public class FormattingVariable {

    public static void main(String[] args){

        String country1 = "Ireland";
        int population1 = 7092326;
        double populationDensity1 = 82.2;

        String country2 = "United Kingdom";
        int population2 = 6092326;
        double populationDensity2 = 270.7;

        System.out.println(String.format("%-20s%-15%s\n%-20s%-15s%s",
                "Name","Population","Pop Density",
                "----","----------","-----------"));

        System.out.println(String.format("%-20s%-15d%.2f\n%-20s%-15d%.2f",
                country1,population1,populationDensity1,
                country2,population2,populationDensity2));

    }
}
