import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //uzd.1.
        System.out.println("-----------1UZD-----------");
        uzd1(5,3);

        //uzd2.
        System.out.println("-----------2UZD-----------");
        System.out.println(PISq());

        //uzd.3.
        System.out.println("-----------3UZD-----------");
        System.out.println(nums(3,5));

        //uzd.4.
        System.out.println("-----------4UZD-----------");
        int[] piu = {5,8,9,6,7};
        Uzd4(piu);


        //uzd.5.
        System.out.println("-----------5UZD-----------");
        int[] arr = rnd();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        };

        //uzd.6.
        System.out.println("-----------6UZD-----------");
        int arrSum = sum(arr);

        System.out.println(arrSum);

        // sum(rnd())
        //uzd.7.
        System.out.println("-----------7UZD-----------");
        double arrAverage =RNDavg(arr);
        System.out.println(arrAverage);

        //uzd.8.
        System.out.println("-----------8UZD-----------");

        stars(40,12);


        //uzd.9.
        System.out.println("-----------9UZD-----------");


        sentence("Šiandien labai graži diena");



        //uzd.10.
        System.out.println("-----------10UZD-----------");

        System.out.println(Uzd10("Labas"));

        //////////////////////////////////////////////////////
        //SUNKESNI
        // uzd. 1


















    //1.UZD. Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos
    //susumuoja ir atspausdina.\

    }

    public static void uzd1 ( int a, int b){ // nieko negražina, priima du kintamuosius
        System.out.println(a + b);
    }

    //2.UZD.Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo
    //reikšmę. Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.

    public static double PISq(){
        return 9.8596;
    }


    //3.UZD.Sukurkite Funkciją kuri priima du int tipo kintamuosius. Funkcija
    //gražina skaičių sandaugą.; Gautą reikšmę atspausdinkite.

    public static int nums (int c, int d){
        int result =c * d;
        return result;
    }

    //4.UZD.Sukurkite Funkciją kuri priima int[], prasuka ciklą ir atspausdina
    //kiekvieną skaičių.

    public static void  Uzd4 (int[] piu){
        for (int i = 0; i < piu.length; i++) {
            System.out.println(piu[i]);
        }
        System.out.println("baige spausdinti masyva");
    }

    //5.UZD.Sukurkite Funkciją kuri sugeneruotų 5-ių random int skaičių masyvą ir jį
    //gražintų. intervalą(min, max sugalvokite patys)
    public static int[] rnd(){
    int min =0;
    int max = 10;
    int[] rnd =new int[5];
        for (int i = 0; i < rnd.length; i++) {
            rnd[i] = min + (int) Math.round(Math.random() * (max-min));
        }
        return rnd;
    }

    //6.UZD Sukurkite Funkciją kuri panaudotų 5tos užduoties masyvą (priimtų kaip
    //kintamąjį), susumuotų ir gražintų reikšmę.

    public static int sum (int[] rnd){

        int sum=0;
        for (int i = 0; i < rnd.length; i++) {
            sum = sum + rnd[i];
        }
        return sum;
    }

    //7.UZD Sukurkite Funkciją kuri priimtų 5tos užduoties masyvą ir gražintų jos
    //skaičių vidurkį (double).

    public static double RNDavg (int[] rnd) {
        double avrg = 0;
        for (int i = 0; i < rnd.length; i++) {
            avrg += rnd[i];
        }
        return avrg / rnd.length;
    }

    //8.UZD.Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų
    //stačiakampį užpildytą žvaigždutėmis. Pirmas int - išoriniam ciklui,
    //antras vidiniam.

    public static void stars (int x, int y) {

        for (int a = 0; a < y; a++) {
            for (int b = 0; b < x; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    //9. UZD. Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų
    //kiek jame yra raidžių ir tarpų. Sakinys - “Šiandien labai graži diena”.
    //(kodas turi veikti padavus bet kokį sakinį)

    public static void sentence(String text){
        /*
        atspausdink teksto ilgi
        panaudok replace funkcia kad tarpus kapeistum nuokuo. tusciu stringu.
        tada atsispausdink to pakoreguoto stringo ilgi
        pamatysi kad jie skiriasi
        pabandyk atspausdinti pirmaji ilgi is jo atemus antraji ilgi.
         */

        System.out.println("Sakinio ilgis - raides kartu su tarpais: " + text.length());
        String text1 = text.replace(" ", "");
        System.out.println("Raidziu yra: " + text1.length());
        System.out.println("Tarpu yra: " + (text.length() - text1.length()));







    }
    //10.UZD. Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų.
    //Kodavimas - sakinį apsukame iš kitos pusės. Pvz “Naglis” turi gautis
    //“silgaN”.

        public static String  Uzd10 (String txt){
        String reverse= "";
            for (int i = txt.length()-1; i >=0 ; i--) {
                reverse += txt.charAt(i);
            }

            return reverse;
        }

















}






