import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DataHolder {

    public static String firstName = "Mike";
    public static String lastName = "Smith";
    public static String email = "jhon.smith@gmail.com";
    public static String mobileNumber = "1234567890";
    public static String currentAddress = "1198 Kidd Avenue, Stebbins, Alaska(AK)";
    public static String monthOfBirth = "April";
    public static String yearOfBirth = "1989";
    public static String dayOfBirth = "12";
    public static String state = "Rajasthan" ;
    public static String city = "Jaipur" ;
    public static String subjects = "Maths" ;

    static void fillNameEmailMobAddress() {
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#userNumber").setValue(mobileNumber);
        $("#currentAddress").setValue(currentAddress);
    }

    static void fillSubject() {
        $("#subjectsInput").setValue(subjects).pressTab();

    }

    static void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    static void clickCheckboxes() {
        $(".custom-control-label", 2).click();
        $(".custom-control-label", 4).click();
    }
    static void fillDateOfBirth(){
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(monthOfBirth);
        $(".react-datepicker__year-select").selectOption(yearOfBirth);
        $(".react-datepicker__day--0"+dayOfBirth).click();
    }
    static void fillStateCity(){
        $("#state").scrollTo().click();
        $("#stateCity-wrapper").$(byText(state)).scrollTo().click();
        $("#city").scrollTo().click();
        $("#stateCity-wrapper").$(byText(city)).scrollTo().click();
    }
    static void submit(){
        $("#submit").click();
    }
    static void uploadPicture(){
        $("#uploadPicture").uploadFile(new File("src/test/resources/picture.txt"));

    }
}


