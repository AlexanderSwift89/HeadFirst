import java.util.ArrayList;

public class V3Radiator extends V2Radiator{
    int count_v3 = 0;
    V3Radiator(ArrayList lglist) {
        super(lglist);
        for (int g = 0; g < 10; g++) {
            count_v3++;
            System.out.print(count_v3 + "_");
            lglist.add(new SimUnit("V3радиатор"));
        }
    }
}
