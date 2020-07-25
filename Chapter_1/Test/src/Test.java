public class Test {
    public static void main (String [] args){
        int x = 0;
        int y = 0;
        while (x < 5){
            //исследуемое выражение
            //y = x - y; //вариант 1
            //y = y + x; //вариант 2
            //вариант 3-------------
            /*y = y + 2;
            if (y > 4){
                y = y - 1;
            }*/
            //вариант 4
            /*x = x + 1;
            y = y + x;*/
            //вариант 5
            if (y < 5){
                x = x + 1;
                if (y < 3){
                    x = x - 1;
                }
            }
            y = y + 2;
            //---------------------
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
