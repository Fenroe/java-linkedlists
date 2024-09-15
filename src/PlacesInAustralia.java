import java.util.LinkedList;
import java.util.ListIterator;

public class PlacesInAustralia {
    private final LinkedList<Place> placesList;
    private ListIterator<Place> iterator;

    public PlacesInAustralia() {
        this.placesList = new LinkedList<>();
    }

    public void addToList(Place place) {
        this.placesList.add(place);
        placesList.sort((o1, o2) -> o1.distanceFromSydney() - o2.distanceFromSydney());
        this.iterator = placesList.listIterator();
    }

    public String[] listPlaces() {
        String[] listOfPlaces = new String[placesList.size()];
        ListIterator<Place> iterator = placesList.listIterator();
        for(int i = 0; i < placesList.size(); i++) {
            listOfPlaces[i] = iterator.next().name();
        }
        return listOfPlaces;
    }

    public String moveForward() {
        if (iterator.hasNext()) {
            return iterator.next().name();
        } else {
            return "You are at the end of the list";
        }
    }

    public String moveBackwards() {
        if (iterator.hasPrevious()) {
            return iterator.previous().name();
        } else {
            return "You are at the start of the list";
        }
    }
}
