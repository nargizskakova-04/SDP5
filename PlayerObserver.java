import java.util.ArrayList;
import java.util.List;

// Observer Pattern
interface PlayerObserver {
    void notifyNewStandAvailable(String standName);
}

class Player implements PlayerObserver {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void notifyNewStandAvailable(String standName) {
        System.out.println(name + " has been notified of a new Stand available in the shop: " + standName);
    }
}

class StandShop {
    private List<PlayerObserver> players = new ArrayList<>();

    public void addPlayer(PlayerObserver player) {
        players.add(player);
    }

    public void announceNewStand(String standName) {
        for (PlayerObserver player : players) {
            player.notifyNewStandAvailable(standName);
        }
    }
}
