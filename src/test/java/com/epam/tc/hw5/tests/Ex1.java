//package com.epam.tc.hw5.tests;
//import static io.qameta.allure.Allure.step;
//import static org.assertj.core.api.Assertions.assertThat;
//
//import com.epam.tc.hw5.pages.DifferentElementsPage;
//import com.epam.tc.hw5.pages.FrontPage;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import io.qameta.allure.Description;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import io.qameta.allure.Story;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.ITestContext;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class Ex1 {
//
//    private WebDriver webDriver;
//    private WebElement webElement;
//    private DifferentElementsPage differentElementsPage;
//    private FrontPage frontPage;
//    private String frontPageUrl = "https://jdi-testing.github.io/jdi-light/index.html";
//
//    @BeforeClass
//    public void beforeClass(ITestContext context) {
//        context.setAttribute("driver", webDriver);
//    }
//
//    @BeforeMethod
//    @Description("This is description of second Exercise")
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @AfterMethod
//    public void clear() {
//        webDriver.quit();
//    }
//
//    @Test
//    @Severity(SeverityLevel.MINOR)
//    @Feature("Different elements page tests")
//    @Story("DC story")
//    public void firstExerciseHW5Test() throws InterruptedException {
//        webDriver = new ChromeDriver();
//        webDriver.manage().window().maximize();
//
//        frontPage = new FrontPage(webDriver);
//        differentElementsPage = new DifferentElementsPage(webDriver);
//
//        step("1. Open test site by URL");
//
//        webDriver.navigate().to(frontPageUrl);
//
//        step("2. Perform log in");
//
//        frontPage.findUserIconAndClick();
//        frontPage.fillUserNameIn();
//        frontPage.fillUserPasswordIn();
//        frontPage.pressLoginButton();
//
//        step("3. Open through the header menu Service -> Different Elements Page");
//
//        frontPage.goToDifferentElementsPage();
//
//        step("4. Select checkboxes");
//
//        differentElementsPage.selectCheckboxes();
//
//        step("5. Select radio");
//
//        differentElementsPage.selectRadio();
//
//        step("6. Select in dropdown");
//
//        differentElementsPage.selectYellowInDropdown();
//
//        step("7. Assert that for each checkbox "
//            + "there is an individual log row and value is corresponded to the status of checkbox for radio button "
//            + "there is a log row and value is corresponded to the status of radio button for dropdown "
//            + "there is a log row and value is corresponded to the selected value.");
//
//        differentElementsPage.assertCheckboxWaterLogRow();
//        differentElementsPage.assertDropdownYellowColorLogRow();
//        differentElementsPage.assertCheckboxWindLogRow();
//        differentElementsPage.assertRadioButtonMetalLogRow();
//    }
//}
