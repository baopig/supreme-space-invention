public class Fortnite {
    public static double fortnite(int N, int H, int D, int S, int P) {
        double healthLost = P * (D/ (double) S);
        double totalTime = D/ (double) S;
        double healTime = 0;
        if (totalTime * P > N) {
            if(H<=P) {
                return -1;
            }
            else if (H>P) {
                healTime = (healthLost-N) / (H-P);
            }
            }
        else {
            return totalTime;
        }
        
        return totalTime + healTime;
        }

    public static void main(String[] args) {
        System.out.println(Fortnite.fortnite(100, 15, 50, 10, 10));
        System.out.println(Fortnite.fortnite(20, 15, 50, 10, 10));
        System.out.println(Fortnite.fortnite(20, 15, 50, 10, 30));
        System.out.println(Fortnite.fortnite(100, 15, 50, 10, 20));
        System.out.println(Fortnite.fortnite(42, 17, 73, 9, 14));
    }
}

