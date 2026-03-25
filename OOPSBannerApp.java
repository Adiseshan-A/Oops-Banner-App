import java.util.HashMap;
import java.util.Scanner;

public class OOPSBannerApp {

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine().toUpperCase();

        for (int i = 0; i < 5; i++) {

            for (char c : word.toCharArray()) {

                if (map.containsKey(c))
                    System.out.print(map.get(c)[i] + "  ");

            }

            System.out.println();
        }

        sc.close();
    }

}