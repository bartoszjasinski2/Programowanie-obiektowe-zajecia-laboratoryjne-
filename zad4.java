public class zad4 {

    public void zwroc(int po[], int k){
        int [] b = new int[k];
        int j = k;
        for (int i = 0; i < k; i++) {
            b[j - 1] = po[i];
            j = j - 1;
        }

    }
}
