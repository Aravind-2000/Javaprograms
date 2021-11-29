

public class Sorting {
    public static void main(String[] args) {
        int tempo,x,y;
        int[] num = new int[]{900, 43, 65, 12, 67, 33, 98};
        for (x = 0; x < num.length; x++) {
            for (y = x + 1; y < num.length; y++) {
                if (num[y] < num[x]) {
                    tempo = num[x];
                    num[x] = num[y];
                    num[y] = tempo;
                }
            }
        }
//        Arrays.sort(num);
        for (int k : num) {
            System.out.println(k);
        }
    }
}
