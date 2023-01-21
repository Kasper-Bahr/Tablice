public class Main {
    public static void main(String[] args) {
        int[] tab = new int[10];
        int licznik = 0;
        for (int i =101; i <=110; i++){
            tab[licznik++] = i;
        }
        for (int i =0; i < 10; i++){
            System.out.println("tab{" + i + "} = " + tab[i]);
        }

        int[] tab1 = new int [10];
        int licznik2 = 0;
        for (int i = 10; i <= 100; i += 10){
            tab1[licznik2++] = i;
        }
        for (int i =0; i < 10; i++)
            System.out.println("tab {" + i + "} = " + tab1[i]);


        boolean[] tab2 = new boolean[20];
        for (int i = 0; i < 20; i++ ){
            if (i % 2 == 0){
                tab2[i] = true;
            } else {
                tab2[i] = false;
            }
        }
        for (int i = 0; i < 20; i++){
            System.out.println("tab {" + i + "} = " + tab2[i]);
        }
    }
}