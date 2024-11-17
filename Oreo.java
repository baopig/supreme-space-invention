public class Oreo {
    public static void oreo(String input) {
        for (int i = 0; i<input.length(); i++) {
            if (input.substring(i,i+1).equals("O")) {
                System.out.println("[###OREO###]");
            }
            else if(i+1 < input.length() && input.substring(i,i+2).equals("RE")) {
                System.out.println("[--------]");
            }
            else if (input.substring(i,i+1).equals("&")) {
                System.out.println();
            }
        }
    }
}