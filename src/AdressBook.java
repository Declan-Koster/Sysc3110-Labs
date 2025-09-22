import java.util.ArrayList;

public  class AdressBook {
    private ArrayList<BuddyInfo> buddies;

    public AdressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AdressBook adressBook = new AdressBook();
        adressBook.addBuddy(buddy);
        adressBook.removeBuddy(buddy);
    }
    //This is the edit
}
