public class OOPSBannerApp {

    static void printBanner() {

        String[] banner = {
            " *****     *****     ******    ***** ",
            "*     *   *     *    *     *  *     *",
            "*     *   *     *    *     *  *",
            "*     *   *     *    ******    *****",
            "*     *   *     *    *              *",
            "*     *   *     *    *        *     *",
            " *****     *****     *         ***** "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        printBanner();
    }

}