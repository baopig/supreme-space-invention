public class Bridge {
    public static int bridge(int B, int N, int[] S) {

        int temp = 100000000;
        int track = 0;
        for (int bridgeHeight = 0; bridgeHeight < 100; bridgeHeight++) {
            int cost = 0;
            int danger = 0;
        
            for (int i = 0; i < N; i++) {
                if (bridgeHeight>=S[i]) {
                   danger += bridgeHeight-S[i];
                }
                else if (bridgeHeight<S[i]) {
                    cost += S[i]-bridgeHeight;
                }
                
            }
            if (danger < temp && cost <= B) {
                temp = danger;
                track = bridgeHeight;
            }
        }
        return track;
    }


    public static void main(String[] args) {
        int B = 8;
        int N = 5;
        int[] S = {2, 6, 10, 1, 2};
        int a = 13;
        int b = 10;
        int[] c = {5, 8, 9, 8, 9, 8, 7, 4, 1, 7};
        int d = 44;
        int e = 12;
        int[] f = {9, 21, 4, 31, 10, 20, 31, 28, 16, 29, 9, 11};

        System.out.println(Bridge.bridge(B,N,S));
        System.out.println(Bridge.bridge(a,b,c));
        System.out.println(Bridge.bridge(d,e,f));
    }
}
