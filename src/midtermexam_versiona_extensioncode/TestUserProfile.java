package midtermexam_versiona_extensioncode;
import java.util.Scanner;
import java.util.Arrays;
public class TestUserProfile {

    public static void main(String[] args ) {

        //Creates scanner and UserProfile Object
        UserProfile user = new UserProfile(" ", " ");
        Scanner scanner = new Scanner(System.in);

        //Gets user input and assigns them to variables
        System.out.print("What is your name?: ");
        String name = scanner.nextLine();
        System.out.print("Pick A Favorite Genre: " + Arrays.toString(user.getGenres()) + ": ");
        String favoriteGenre = scanner.nextLine();

        //Sets name and genre to object parameters
        user.setUserID(name);
        user.setGenre(favoriteGenre);

        System.out.println("Your profile has been created here is the results: ");
        System.out.println("Name: " + user.getUserID());
        System.out.println("Favorite Genre: " + user.getGenre());
    }
}
