package hellocucumber.main;

public class Service {

    public String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }

}
