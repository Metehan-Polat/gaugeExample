import Pom.LoginUserWithCorrectEmailandPassword.LoginUserWithCorrectEmailandPassword;
import Pom.base.Base;
import com.thoughtworks.gauge.Step;

public class LoginUserWithCorrectEmailandPasswordStepDef extends Base {
    LoginUserWithCorrectEmailandPassword loginUserWithCorrectEmailandPassword = new LoginUserWithCorrectEmailandPassword();


    @Step("Verify Login to your account")
    public void VerifyLogin() {
        loginUserWithCorrectEmailandPassword.verifyLoginToYourAccount(getDriver(), getElement());
    }



    @Step("Click login button")
    public void ClickLogin() {
    loginUserWithCorrectEmailandPassword.loginButton(getDriver());
    }

    @Step("Enter correct email and password address")
    public void emailAndPassword() {
        loginUserWithCorrectEmailandPassword.loginEmail(getDriver(),getElement());
        loginUserWithCorrectEmailandPassword.loginPassword(getDriver(),getElement());

    }
}
