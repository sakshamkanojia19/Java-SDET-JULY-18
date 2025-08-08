package games;

class Game {
    // default variables (no access modifier)
    String name = "Chess";
    String gameId = "G111";
    String type = "Board";

    // default method
    void displayGameInfo() {
        System.out.println("Name: " + name);
        System.out.println("Game ID: " + gameId);
        System.out.println("Type: " + type);
    }

    public static void main(String[] args) {
        Game g = new Game();
        g.displayGameInfo(); // accessible in same package only
    }
}
