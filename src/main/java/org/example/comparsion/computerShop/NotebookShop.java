package org.example.comparsion.computerShop;

public class NotebookShop {
    public static void main(String[] args) {
       DataStore dataStore = new DataStore();
       dataStore.add(new Computer("HP","Compaq"));
       dataStore.add(new Computer("HP","Compaq"));
       dataStore.add(new Computer("DELL","G3"));
       dataStore.add(new Computer("Lenovo","SQL"));
       dataStore.add(new Computer("Apple","XJ7"));
      Computer computerToFind = new Computer("HP", "Compaq");
        int numberComputerToFind = dataStore.checkAvalibity(computerToFind);
        System.out.println( " znaleziono " +numberComputerToFind+" computery o nazwie :" + computerToFind);
        for (Computer compute :dataStore.getComputers()) {
            System.out.println(compute);

        }

    }
}
