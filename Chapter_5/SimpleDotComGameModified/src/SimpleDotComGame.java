import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main (String [] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        ArrayList<String> loc = new ArrayList<String>();
        DotCom theDotCom = new DotCom();

        int randomNum = (int) (Math.random() * 5);

        loc.add(String.valueOf(randomNum));
        loc.add(String.valueOf(randomNum + 1));
        loc.add(String.valueOf(randomNum + 2));
        //int[] location = {randomNum, randomNum + 1, randomNum + 2};
        System.out.println(loc);
        theDotCom.setLocationCells(loc);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("Введите число: ");
            String result = theDotCom.checkYourself(guess);
            System.out.println(result);
            numOfGuesses++;
            if (result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }
    }
}
