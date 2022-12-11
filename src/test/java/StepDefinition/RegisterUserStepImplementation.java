package StepDefinition;

import Pom.Click.ChooseClick;
import Pom.Click.SigupLoginClick;
import Pom.RegisterUser.RegisterUser;
import Pom.base.Base;
import Pom.url.GetUrl;
import com.thoughtworks.gauge.Step;



public class RegisterUserStepImplementation extends Base {

    GetUrl getUrl=new GetUrl();
    RegisterUser registerUser=new RegisterUser();

    @Step("Navigate to Browser")
    public void browser() {
        driverChromeMethod();

    }

    @Step("Navigate to Url")
    public void url() {
        getUrl.url(getDriver());

    }

    @Step("Click on Signup Login button")
    public void loginButton() {
        ChooseClick chooseClick=new ChooseClick(new SigupLoginClick());
        chooseClick.clickButtons(getDriver());
    }

    @Step("Verify New User Signup is visible")
    public void VerifyNewUser() {
        registerUser.verifyNewUserSignup(getDriver(),getElement());


    }

    @Step("Enter name and email address")
    public void nameAndEmailAndAddress() {
        registerUser.name(getDriver());
        registerUser.emailAddress(getDriver());

    }

    @Step("Click Signup button")
    public void signupButton() {
        registerUser.sigupButton(getDriver());

    }

    @Step("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyEATVisible() {
        registerUser.verifyEAI(getDriver(),getElement());

    }

    @Step("Fill details Title, Name, Email, Password, Date of birth")
    public void fiildeatails() throws InterruptedException {
        registerUser.fiilDetails(getDriver(),getElement(),getActions(),getSelect());

    }

    @Step("Click Create Account button")
    public void createAccountButtun() {
        registerUser.createAccountButton(getDriver());

    }

    @Step("Verify that ACCOUNT CREATED is visible")
    public void verifyACVisible() {
        registerUser.VerifyAccountCreated(getDriver(),getElement());

    }

    @Step("Click Continue button")
    public void continueButton() {
        registerUser.continueButton(getDriver());

    }

    @Step("Logout")
    public void logout() {
        registerUser.logOut(getDriver());

    }

    @Step("Close")
    public void close() {
        quitMethod();

    }
}
