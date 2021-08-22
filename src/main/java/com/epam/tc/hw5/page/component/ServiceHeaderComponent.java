//package com.epam.tc.hw5.page.component;
//
//import static org.openqa.selenium.By.partialLinkText;
//import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class ServiceHeaderComponent extends AbstractComponent {
//
//    @FindBy(className = "dropdown-toggle")
//    private WebElement headerMenuService;
//    @FindBy(xpath = "//*[text()='Different elements']")
//    private WebElement differentElementsItem;
//
//    public ServiceHeaderComponent(WebDriver driver) {
//        super(driver);
//    }
//
//    public void openServiceCategoryComponent(final String categoryName) {
//        var categoryLink = wait.until(visibilityOfElementLocated(partialLinkText(categoryName)));
//        actions.moveToElement(categoryLink).perform();
//    }
//}
