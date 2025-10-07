package example;

import java.io.IOException;

/**
 * Class for getting your Grade API token.
 */
public class GetToken {

    /**
     * Run to get your token after you complete the code.
     * @param args unused arguments
     */
    public static void main(String[] args) throws IOException {
        GetExample example = new GetExample();

        String gradeAPISignUpURL = "https://grade-apis.panchen.ca/signUp";
        // Add your Username here!
        String userName = "aidenC";
        String response = "";
        response = example.run(gradeAPISignUpURL + "?username=" + userName);
        System.out.println("Add the token below to a file called token.txt in your project root!");
        System.out.println(response);
    }
}
