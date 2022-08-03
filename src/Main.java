public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // задание
        int cat = 1;
        byte dog = 9;
        short apple = 4;
        long giraffe = 110l;
        double appleWeight = 1.5;
        float bananasWeight = 1.5f;
        boolean catIsSmall = cat > 15;
        char home = 33;
        System.out.println(home);


        System.out.println("Задание 2" +
                "");
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double totalWeightOFBoxers = boxer1 + boxer2;
        double theDifferenceBetweenTheWeightsOfBoxers = boxer2 - boxer1;
        System.out.println("Общий вес боксеров "+totalWeightOFBoxers);
        System.out.println("Разницу между весами боксеров "+theDifferenceBetweenTheWeightsOfBoxers);

        System.out.println("Задание 3" +
                "");
        var banana = 5;
        var milk = 200;
        var milkMl = 100;
        var iceCreamSundae = 2;
        var rawEggs = 4;
        var bananaGram = 80;
        var milkGram = 105;
        var iceCreamSundaeGram = 100;
        var rawEggsGram = 70;
        var gram = banana * bananaGram;
        var gramilk = milk -milkMl+ milkGram;
        var iceCreamSundaeGrams = iceCreamSundae * iceCreamSundaeGram;
        var rawEggss = rawEggs * rawEggsGram;
        System.out.println("банан общий "+gram+" грамм");
        System.out.println("молоко общий "+gramilk+" грамм");
        System.out.println("пломбир общий "+iceCreamSundaeGrams+" грамм");
        System.out.println("яйцо общий "+rawEggss+" грамм");
        var mixEverythingInABlender = gram + gramilk + iceCreamSundaeGrams + rawEggss;
        System.out.println("Смешать всё в блендере и готово "+mixEverythingInABlender+" итого грамм");
        int blendergramm = 1085;
        int grammNaKg = blendergramm / 1000;
        System.out.println("всего "+grammNaKg+" Кг");


        System.out.println("Задание 4" +
                "");
        var sport = 7;
        var gramone = 250;
        var gramm = 500;
        int gramsd = 7;
        double ggg = 7/0.250;
        double ccc = 7 / 0.500;
        System.out.println("250 грамм потребуется  "+ggg+" дней");
        System.out.println("500 грамм потребуется  "+ccc+" дней");

        System.out.println("задание 5" +
                "");
        int masha = 67760;
        int denys = 83690;
        int crystina = 76230;
        System.out.println("Маша "+masha);
        System.out.println("Денис "+denys);
        System.out.println("Кристина "+crystina);
        int godzpp = 67760*12;
        int godzppp = 83690*12;
        int godzpppp = 76230*12;

        System.out.println("Годовая зарплата Маша "+godzpp);
        System.out.println("Годовая зарплата Денис "+godzppp);
        System.out.println("Годовая зарплата Кристина "+godzpppp);
        System.out.println("Прибавка 10%");

        double procent= 67760*0.10;
        double procentt= 83690*0.10;
        double procenttt= 76230*0.10;
        int nnn = 67760 + 6776;
        int nnd = 83690 + 8369;
        int nnc = 76230 + 7623;
        double godMasha = 813120;
        double godMashas = godMasha += godMasha * 0.1;
        double godDenys = 1004280;
        double godDenyss = godDenys +=godDenys * 0.1;
        double godCrystina = 914760;
        double goodCrystinas = godCrystina += godCrystina * 0.1;

        System.out.println("Прибавка Маша месяц  "+procent);
        System.out.println("Прибавка Денис месяц "+procentt);
        System.out.println("Прибавка Кристина месяц "+procenttt);

        System.out.println("Маша теперь получает в месяц  "+nnn);
        System.out.println("Денис теперь получает в месяц  " + nnd);
        System.out.println("Кристина теперь получает в месяц  " + nnc);

        System.out.println("Годовая зарплата прибавка итого" +
                "" +
                "");
        System.out.println("Маша годовая зарплата "+godMashas);
        System.out.println("Денис годовая зарплата "+godDenys);
        System.out.println("Кристина годовая зарплата "+godCrystina);;
    }
}