public class Bucket implements Sortable {

    double licz_porownania;



    public static int[] sort(int[] tab)
    {
        int max_wartosc = 0;
        for (int i = 0; i < tab.length; i++)
        {
            if (tab[i] > max_wartosc)
                max_wartosc = tab[i];

        }



        int[] kubelek = new int[max_wartosc + 1];
        int[] sortowanie = new int[tab.length];

        for (int i= 0; i <tab.length; i++)
        {
            kubelek[tab[i]]++;
        }
        int nm = 0;
        for (int i = 0; i < kubelek.length; i++)
        {
            for (int j = 0; j < kubelek[i]; j++)
            {
                sortowanie[nm++] = i;
            }
        }
        return sortowanie;
    }







    @Override
    public double step_counting() {
        return 0;
    }
}
