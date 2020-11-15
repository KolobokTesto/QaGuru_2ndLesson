
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PositiveFormSubmission extends DataHolder {


    @Test
    public void e2eFormSubmission (){
        openPage();
        fillNameEmailMobAddress();
        uploadPicture();
        clickCheckboxes();
        fillSubject();
        fillDateOfBirth();
        fillStateCity();
        submit();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $x("//td[text()='Student Name']").parent().shouldHave(text(firstName + " " + lastName));
        $x("//td[text()='Student Email']").parent().shouldHave(text(email));
        $x("//td[text()='Gender']").parent().shouldHave(text("Other"));
        $x("//td[text()='Mobile']").parent().shouldHave(text(mobileNumber));
        $x("//td[text()='Date of Birth']").parent().shouldHave(text(dayOfBirth
                + " " + monthOfBirth + "," + yearOfBirth));
        $x("//td[text()='Subjects']").parent().shouldHave(text(subjects));
        $x("//td[text()='Hobbies']").parent().shouldHave(text("Reading"));
        $x("//td[text()='Picture']").parent().shouldHave(text("picture.txt"));
        $x("//td[text()='Address']").parent().shouldHave(text(currentAddress));
        $x("//td[text()='State and City']").parent().shouldHave(text(state + " " + city));
        }



    }



