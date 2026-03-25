import java.util.HashMap;

public class OOPSBannerApp {

    static class CharacterPatternMap {

        static HashMap<Character, String[]> map = new HashMap<>();

        static {
            map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            });

            map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            });

            map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            });
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";

        for (int i = 0; i < 5; i++) {

            for (char c : word.toCharArray()) {
                System.out.print(CharacterPatternMap.map.get(c)[i] + "  ");
            }

            System.out.println();
        }

    }

}