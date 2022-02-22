package factory_pattern;

public class main {
    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();
        Profession prof = professionFactory.getProfession("Engineer");
        prof.print();
    }


}
