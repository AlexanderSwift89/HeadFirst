public class PhaseOMatic {
    public static void main (String[] args){

        //создайте набор слов для выбора. Добавляйте собственные слова!
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш", "фронтэнд", "на основе веб-технологий"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый прдукт", "ориентированный", "центральный", "распределенный", "кластерризованный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "уровень завоеванного внимания"};

        //Вычисляем сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Генерируем три случайных числа
        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        //Теперь строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //Выводим фразу на экран\
        System.out.println("Все, что нам нужно, – это " + phrase);
    }
}
