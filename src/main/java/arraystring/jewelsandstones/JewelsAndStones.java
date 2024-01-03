package arraystring.jewelsandstones;

public class JewelsAndStones {

    /*
    You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
    Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
    Letters are case sensitive, so "a" is considered a different type of stone from "A".
     */

    public static int numJewelsInStones1(String jewels, String stones) {
        int quantity = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    quantity++;
                }
            }
        }
        return quantity;
    }

    public static int numJewelsInStones2(String jewels, String stones) {
        int quantity = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1){
                quantity++;
            }
        }
        return quantity;
    }




}
