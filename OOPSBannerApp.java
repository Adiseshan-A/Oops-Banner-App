import java.util.ArrayList;
import java.util.Scanner;

abstract class Banner {
    private String text;
    private String author;

    public Banner(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void display();

    public void showInfo() {
        System.out.println("Text: " + text);
        System.out.println("Author: " + author);
    }
}

class SimpleBanner extends Banner {

    public SimpleBanner(String text, String author) {
        super(text, author);
    }

    @Override
    public void display() {
        System.out.println("==============================");
        System.out.println("       " + getText());
        System.out.println("==============================");
    }
}

class BoxBanner extends Banner {

    public BoxBanner(String text, String author) {
        super(text, author);
    }

    @Override
    public void display() {
        System.out.println("+----------------------------+");
        System.out.println("|                            |");
        System.out.println("|      " + getText() + "      |");
        System.out.println("|                            |");
        System.out.println("+----------------------------+");
    }
}

class StarBanner extends Banner {

    public StarBanner(String text, String author) {
        super(text, author);
    }

    @Override
    public void display() {
        System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println("*      " + getText() + "      *");
        System.out.println("*                            *");
        System.out.println("******************************");
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Banner> banners = new ArrayList<>();

        banners.add(new SimpleBanner("WELCOME TO JAVA", "Admin"));
        banners.add(new BoxBanner("OBJECT ORIENTED PROGRAMMING", "Student"));
        banners.add(new StarBanner("LEARN OOPS", "Teacher"));

        System.out.println("OOPS Banner Application");
        System.out.println();

        for (Banner banner : banners) {
            banner.display();
            banner.showInfo();
            System.out.println();
        }

        System.out.print("Enter your banner text: ");
        String text = sc.nextLine();

        System.out.print("Enter your name: ");
        String author = sc.nextLine();

        System.out.println();
        System.out.println("Choose banner type:");
        System.out.println("1. Simple");
        System.out.println("2. Box");
        System.out.println("3. Star");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Banner newBanner;

        if (choice == 1) {
            newBanner = new SimpleBanner(text, author);
        } else if (choice == 2) {
            newBanner = new BoxBanner(text, author);
        } else {
            newBanner = new StarBanner(text, author);
        }

        banners.add(newBanner);

        System.out.println();
        System.out.println("Your Banner:");
        newBanner.display();

        System.out.println();
        newBanner.showInfo();

        System.out.println();
        System.out.println("Total banners: " + banners.size());

        sc.close();
    }
}
