public class Bubbl implements Sortable {


    int licznik = 0;



    public static void swap(int[] tab, int indeks1, int indeks2){
        int temp = tab[indeks1];
        tab[indeks1] = tab[indeks2];
        tab[indeks2] = temp;
    }

    public int[] sort(int[] tab) {

        int n = tab.length;


        while(licznik < n - 1){
            for(int j = 0; j < n -1; j++){
                if(tab[j] > tab[j+1]){
                    swap(tab, j, j + 1);

                }



            }

            licznik ++;
        }

        return tab;
    }

    public double step_counting() {
        this.licznik++;
        return 0;
    }
    }

