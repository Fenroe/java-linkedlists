import java.util.Scanner;

public class Interactive {
    private PlacesInAustralia places;
    private boolean programIsRunning;

    public Interactive(PlacesInAustralia places) {
        this.places = places;
        this.programIsRunning = true;
    }

    private void onForwards() {
        System.out.println(places.moveForward());
    }

    private void onBackwards() {
        System.out.println(places.moveBackwards());
    }

    private void onListPlaces() {
        String[] listOfPlaces = places.listPlaces();
        for (String place : listOfPlaces) {
            System.out.println(place);
        }
    }

    private void onQuit() {
        this.programIsRunning = false;
        System.out.println("Program ended");
    }

    private void onMenu() {
        System.out.println("Available actions (select word or letter)");
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(L)ist Places");
        System.out.println("(M)enu");
        System.out.println("(Q)uit");
    }

    private void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine().toLowerCase();
        switch(command) {
            case "forward", "f":
                onForwards();
                break;
            case "backward", "b":
                onBackwards();
                break;
            case "list places", "l":
                onListPlaces();
                break;
            case "menu", "m":
                onMenu();
                break;
            case "quit", "q":
                onQuit();
                break;
            default:
                System.out.println("Enter a valid command");
        }
    }

    public void start() {
        while (programIsRunning) {
            System.out.println("Enter a command, or type menu for a list of commands");
            handleUserInput();
        }
    }
}
