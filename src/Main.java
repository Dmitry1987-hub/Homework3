//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

            int a = 50000;
            byte b = 10;
            short c = 11000;
            long d = 12000000;
            float e = 1.57f;
            double f = 1.8888;
        }


        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.768f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 27;

        byte tih1 = 23;
        byte tih2 = 27;
        byte tih3 = 30;
        short paper = 480;
        int student = paper / (tih1 + tih2 + tih3);
        System.out.println("на каждого ученика расчитано " + student + " листов бумаги");


        byte bmm = 16;

        byte min = 2;

        byte perMinutes = (byte) (bmm / min);

        System.out.println("производит за одну минуту " + perMinutes + " штук бутылок");

        byte min20 = 20;
        byte bmm8 = 8;
        short bmm8Min20 = (short) (min20 * bmm8);
        System.out.println("производит за 20 минут " + bmm8Min20 + " штук бутылок");

        byte day = 24;
        byte hour = 60;
        short dayHour = (short) (day * hour);
        System.out.println("в сутка " + dayHour + " минут");
        short bmm8day = (short) (dayHour * bmm8);
        System.out.println("производит за сутки " + bmm8day + " штук бутылок");

        byte day3 = 72;
        byte hour3 = 60;
        short day3Hour3 = (short) (day3 * hour3);
        System.out.println("в трех сутках " + day3Hour3 + " минут");
        int bmm8Day3 = (int) (day3Hour3 * bmm8);
        System.out.println("производит за трое суток " + bmm8Day3 + " штук бутылок");

        byte month = 31;
        byte hour4 = 24;
        int monthHour = (int) (month * hour4);
        System.out.println("в одном месяце " + monthHour + " часа") ;
        int monthHour1 = (int) (monthHour * hour);
        System.out.println("в одном месяце " + monthHour1 + " минут");
        int bmm8MonthHour1 = (int) (bmm8 * monthHour1);
        System.out.println("производит за один месяц " + bmm8MonthHour1 + " штук бутылок");

        byte pot = 120;
        byte potWhite = 2;
        byte potBrown = 4;
        byte class1 = (byte) (pot / (potWhite + potBrown));
        System.out.println("в школе где " + class1 + " классов");
        byte potWhite1 = (byte) (potWhite * class1);
        System.out.println("уходит белой краски "  + potWhite1 +" банок на один класс");
        byte potBrown1 = (byte) (potBrown * class1);
        System.out.println("уходит коричневой " + potBrown1 + " банок на один класс");
        System.out.println("в школе где " + class1 + " классов нужно " + potWhite1  + " банок белой краски и " + potBrown1 + " банок коричневой краски" ) ;

        int grPerKg = 100;
        byte banan5 = 5;
        float banan1gr = 0.8f;
        short milk = 200;
        byte milk1 = 105;
        byte iceCream = 2;
        byte iceCream2 = 100;
        byte eggs = 4;
        double eggs1gr = 0.70;
        short milk2 = (short)  (milk1 + milk1);
        System.out.println("в двухcот миллилитрах " + milk2 + " грамм!");
        float banan = (float) (banan5 * (banan1gr * grPerKg));
        System.out.println("в пяти бананах " + banan + " грамма!");
        short iceCream3 = (short) (2 * iceCream2);
        System.out.println("в двух брикетах мороженого " + iceCream3 + " грамм!");
        short eggs4gr = (short) (eggs * (eggs1gr * grPerKg));
        System.out.println("в четырех яйцах " + eggs4gr + " грамм!");

        byte kg = 7;
        int kgPerGr = 1000;
        short gr1 = 250;
        short gr2 = 500;
        int kgInGr = (int) (kg * kgPerGr);
        System.out.println("в семи килограммах " + kgInGr + " грамм!" );
        int days1 = kgInGr / gr1;
        System.out.println("необходимо " + days1 + " дней чтобы похдеть на 7 кг!");
        int days2 = kgInGr / gr2;
        System.out.println("необходимо " + days2 + " дней чтобы похудеть на 7 кг!");

        int solaryM = 67760;
        int solaryD = 83690;
        int solaryK = 76230;
        byte later = 12;
        float upM =  (float) (solaryM * 1.1);
        System.out.println("Маша теперь получает " + upM + " руб!");
        int laterM = (int) (later * upM);
        System.out.println("Машин годовой доход составил " + laterM + " руб!");
        float upD = (float) (solaryD * 1.1);
        System.out.println("Денис теперь получает " + upD + " руб!");
        int laterD = (int) (later * upD);
        System.out.println("Дениса годовой доход составил " + laterD + " руб!");
        float upK = (float) (solaryK * 1.1);
        System.out.println("Кристина теперь получает " + upK + " руб!");
        int laterK = (int) (later * upK);
        System.out.println("Кристинын годовой доход составил " + laterK + " руб!");










    }
}