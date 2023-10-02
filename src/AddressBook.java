import java.util.ArrayList;

public class AddressBook {

    public ArrayList<BuddyInfo> collection;

    public AddressBook() {
        collection = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo b_info) {
        collection.add(b_info);
    }

    public boolean removeBuddy(BuddyInfo b_info) {
        return collection.remove(b_info);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        System.out.println("salut!");
    }

}
