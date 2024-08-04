package Chapter3.Section5;

public class SwitchTest {

    public static void main(String[] args) {

        int seasonCode = 0;

        String seasonName = switch (seasonCode) {

            case 0 -> "Spring";
            case 1 -> "Summer";
            case 2 -> "Autumn";
            case 3 -> "Winter";
            default -> "???";
        };

        System.out.println(seasonName);

    }

}
