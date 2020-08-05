import java.util.ArrayList;

public class V2Radiator{
    static int count_v2 = 0;
    V2Radiator(ArrayList list){
        for (int x = 0; x < 5; x++){
            count_v2++;
            System.out.print(count_v2 + "_");
            list.add(new SimUnit("V2радиатор"));
        }
    }
}
