public class AdressBook {
    private String name;

    public AdressBook(String name) {
        this.name = name;
    }

    public String getBuddy() {
        return name;
    }

    public String removeBuddy() {
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
