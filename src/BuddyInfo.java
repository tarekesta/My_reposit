public class BuddyInfo {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BuddyInfo(String name) {
        this.name = name;
    }


    public BuddyInfo() {

    }


    private String name;

    public static void main(String[] args) {
        BuddyInfo bd = new BuddyInfo();
        bd.setName("Tarek");
        System.out.println("Hello " + bd.getName());
        AddressBook adb = new AddressBook();
        adb.addBuddy(bd);
        System.out.println(adb.removeBuddy(bd));
        System.out.println("Hey");
    }

}