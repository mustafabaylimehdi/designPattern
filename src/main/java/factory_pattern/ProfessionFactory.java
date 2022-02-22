package factory_pattern;

public class ProfessionFactory {
    public Profession getProfession(String professionType){
        if (professionType == null || professionType.isEmpty()){
            return null;
        }
        else if(professionType.equalsIgnoreCase("Doctor")){
            return new Doctor();
        }
        else if(professionType.equalsIgnoreCase("Teacher")){
            return new Teacher();
        }
        else if(professionType.equalsIgnoreCase("Engineer")){
            return new Engineer();
        }
        return null;
    }
}
