public class SimUnit {
    String botType;
    SimUnit (String type){
        System.out.println("Создался объект " + type);
        botType = type;
    }
    int powerUse(){
        if ("Тепловая машина".equals(botType)){
            return 2;
        } else {
            return 4;
        }
    }
}
