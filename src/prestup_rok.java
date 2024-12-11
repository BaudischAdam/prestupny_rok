public class prestup_rok {

    public static void main(String[] args) {

        long rok = 1900;
        System.out.println(rok);

        if (rok != 0) {
            if ((rok % 4 == 0) && !((rok % 100 ==0) && (rok % 400 !=0))) {
                System.out.println("Rok je přestupný");

            } else System.out.println("Rok není přestupný");
        }
    }
}
