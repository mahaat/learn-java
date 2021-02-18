
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Comparator {
    public int compare(Player a, Player b) {
        if (b.score > a.score){
            return 1;
        } else if (b.score < a.score) {
            return -1;
        } else {
            return a.name.compareTo(b.name);
        }
    }
}
