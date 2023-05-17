import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static int chooseBestSum(int limit, int number, ArrayList<Integer> cities) {
        ArrayList<Integer> sums = new ArrayList<Integer>();
        int n = cities.size();
        for(int i = 0; i < n-2; i++) {
            for(int j = i+1; j < n-1; j++) {
                for(int k = j+1; k < n; k++) {
                    int sum = cities.get(i) + cities.get(j) + cities.get(k);
                    if(sum <= limit) {
                        sums.add(sum);
                    }
                }
            }
        }
        if(sums.size() == 0) {
            return -1;
        }
        Collections.sort(sums, Collections.reverseOrder());
        return sums.get(0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> cityDistances = new ArrayList<Integer>();
        cityDistances.add(50);
        cityDistances.add(55);
        cityDistances.add(57);
        cityDistances.add(58);
        cityDistances.add(60);
        System.out.println("Max distance: " + chooseBestSum(175, 3, cityDistances));
    }
}