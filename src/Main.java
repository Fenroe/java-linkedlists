public class Main {
    public static void main(String[] args) {
        PlacesInAustralia places = new PlacesInAustralia();
        places.addToList(new Place("Sydney", 0));
        places.addToList(new Place("Adelaide", 1374));
        places.addToList(new Place("Alice Springs", 2771));
        places.addToList(new Place("Brisbane", 917));
        places.addToList(new Place("Darwin", 3972));
        places.addToList(new Place("Melbourne", 877));
        places.addToList(new Place("Perth", 3923));
        Interactive interactive = new Interactive(places);
        interactive.start();
    }
}
