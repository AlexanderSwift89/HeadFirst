import java.util.ArrayList;

public class RetentionBot {
    static int count_ret = 0;
    RetentionBot(ArrayList rlist){
        count_ret++;
        System.out.print(count_ret + "_");
        rlist.add(new SimUnit("Тепловая машина"));
    }
}
