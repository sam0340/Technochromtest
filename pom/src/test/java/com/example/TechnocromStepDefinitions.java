package com.example;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class TechnocromStepDefinitions {
    private WebDriver driver;

    @Given("the user is on the Technocrom homepage")
    public void navigateToHomePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chahs\\IdeaProjects\\pom\\src\\test\\resources\\features\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.technocrom.com/");
    }

    @Then("the user should see the header section")
    public void verifyHeaderSection() {
        WebElement headerSection = driver.findElement(By.className("header"));
        assertTrue("Header section should be visible", headerSection.isDisplayed());
    }

    @Then("the user should see the latest articles section")
    public void verifyLatestArticlesSection() {
        WebElement latestArticlesSection = driver.findElement(By.id("root"));
        assertTrue("Latest articles section should be visible", latestArticlesSection.isDisplayed());
    }

    @Then("the user should see the footer section")
    public void verifyFooterSection() {
        WebElement footerSection = driver.findElement(By.className("footer"));
        assertTrue("Footer section should be visible", footerSection.isDisplayed());
    }

    @When("the user clicks on the \"Company\" header")
    public void clickCompanyHeader() {
        WebElement companyHeader = driver.findElement(By.linkText("Company"));
        companyHeader.click();
    }

    @Then("the user should be navigated to the About Us page")
    public void verifyNavigationToAboutUsPage() {
        WebElement aboutUsHeader = driver.findElement(By.className("dropdown-li"));
        assertTrue("About Us page header should be visible", aboutUsHeader.isDisplayed());
    }

    @Then("the user should see the Company Profile section")
    public void verifyCompanyProfileSection() {
        WebElement companyProfileSection = driver.findElement(By.id("company-profile"));
        assertTrue("Company Profile section should be visible", companyProfileSection.isDisplayed());
    }

    @Then("the user should see the Our Journey section")
    public void verifyOurJourneySection() {
        WebElement ourJourneySection = driver.findElement(By.id("our-journey"));
        assertTrue("Our Journey section should be visible", ourJourneySection.isDisplayed());
    }

    @Then("the user should see the Mission Vision section")
    public void thenUserSeesMissionVisionSection() {
        WebElement missionVisionSection = driver.findElement(By.id("mission-vision"));
        assertTrue("Mission Vision section should be visible", missionVisionSection.isDisplayed());
    }

    @Then("the user should see the \"Why Technocrom\" section")
    public void thenUserSeesWhyTechnocromSection() {
        WebElement whyTechnocromSection = driver.findElement(By.id("why-technocrom"));
        assertTrue("\"Why Technocrom\" section should be visible", whyTechnocromSection.isDisplayed());
    }

    @Then("the user should see the \"Life At Technocrom\" section")
    public void thenUserSeesLifeAtTechnocromSection() {
        WebElement lifeAtTechnocromSection = driver.findElement(By.id("life-at-technocrom"));
        assertTrue("\"Life At Technocrom\" section should be visible", lifeAtTechnocromSection.isDisplayed());
    }

    @Then("the user should see the \"How We Work\" section")
    public void thenUserSeesHowWeWorkSection() {
        WebElement howWeWorkSection = driver.findElement(By.className("dropdown-li"));
        assertTrue("\"How We Work\" section should be visible", howWeWorkSection.isDisplayed());
    }

    @When("the user clicks on the \"Contact\" link")
    public void clickContactLink() {
        WebElement contactLink = driver.findElement(By.linkText("Contact"));
        contactLink.click();
    }

    @Then("the user should be navigated to the Contact page")
    public void verifyNavigationToContactPage() {
        WebElement contactPageHeader = driver.findElement(By.id("contact-header"));
        assertTrue("Contact page header should be visible", contactPageHeader.isDisplayed());
    }

    @Then("the user should see the contact form")
    public void verifyContactForm() {
        WebElement contactForm = driver.findElement(By.id("contact-form"));
        assertTrue("Contact form should be visible", contactForm.isDisplayed());
    }

    @Then("the user should see the contact information")
    public void verifyContactInformation() {
        WebElement contactInfo = driver.findElement(By.id("contact-info"));
        assertTrue("Contact information should be visible", contactInfo.isDisplayed());
    }

    @When("the user clicks on the \"Resources\" link")
    public void clickResourcesLink() {
        WebElement resourcesLink = driver.findElement(By.linkText("Resources"));
        resourcesLink.click();
    }

    @Then("the user should be navigated to the Resources page")
    public void verifyNavigationToResourcesPage() {
        WebElement resourcesHeader = driver.findElement(By.className("dropdown-li"));
        assertTrue("Resources page header should be visible", resourcesHeader.isDisplayed());
    }



    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
