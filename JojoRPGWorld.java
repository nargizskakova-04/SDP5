import java.util.*;

public class JojoRPGWorld {
    private static StandShop shop = new StandShop();
    private static Map<String, StandFactory> factories = new HashMap<>();

    public static void main(String[] args) {
        factories.put("Golden Wind", new GoldenWindFactory());
        factories.put("Silver Chariot", new SilverChariotFactory());
        factories.put("The World", new TheWorldFactory());


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Jojo's RPG World!");
            System.out.println("1. Register a player.");
            System.out.println("2. Introduce a new Stand in the shop.");
            System.out.println("3. Exit.");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter player's name: ");
                    String playerName = scanner.nextLine();
                    shop.addPlayer(new Player(playerName));
                    System.out.println(playerName + " has joined the game!");
                    break;
                case 2:
                    System.out.print("Choose a Stand to introduce (Golden Wind; Silver Chariot; The World): ");
                    String standName = scanner.nextLine();
                    if (factories.containsKey(standName)) {
                        shop.announceNewStand(standName);
                    } else {
                        System.out.println("Unknown Stand!");
                    }
                    break;
                case 3:
                    System.out.println("Goodbye and remember: Stand proud!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
