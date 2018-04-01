package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestTalent {

    public WebDriver driver = WebDriverSingleton.getInstance();


    @Before
    public void login() {
        driver.get("http://testing.cld.iba.by/");
        WebElement login = driver.findElement(By.id("_58_login"));
        WebElement password = driver.findElement(By.id("_58_password"));
        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));

        login.sendKeys("kabanov@tc.by");
        password.sendKeys("welcome");
        button.click();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        /*WebElement userName = driver.findElement(By.xpath("//div[@class = 'float-box']//div//h3"));

        Assert.assertEquals("Александр Евгеньевич Кабанов", userName.getText());*/
    }
/*
    @Test
    public void toApplications() {
        driver.get("http://testing.cld.iba.by/");
        WebElement link = driver.findElement(By.xpath("//a[@href = 'http://testing.cld.iba.by/web/guest/recruiting']"));
        link.click();
        Assert.assertEquals("Подбор и адаптация - Конструктор Талантов", driver.getTitle());
    }*/
    @Test
    public void createApplication() {
        driver.get("http://testing.cld.iba.by/");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        WebElement q = driver.findElement(By.xpath("//div[@onclick = 'return toggleSidebar();']"));
        q.click();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        WebElement link = driver.findElement(By.xpath("//a[@href = 'http://testing.cld.iba.by/web/guest/recruiting']"));
        link.click();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        WebElement createApplicationButton = driver.findElement(By.xpath("//div//a[@href = 'http://testing.cld.iba.by/web/guest/recruiting/applications/-/applications/createApplication']"));
        createApplicationButton.click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        WebElement position = driver.findElement(By.xpath("//div//input[@id = 'name']"));
        position.sendKeys("Layout Designer");
        WebElement closingDate = driver.findElement(By.xpath("//div//input[@id = 'plannedClosingDate']"));
        closingDate.sendKeys("01.05.2018");
        WebElement priority = driver.findElement(By.xpath("//div//input[@value = '2']"));
        priority.click();
        WebElement employeesQuantity = driver.findElement(By.xpath("//div//input[@id = 'quantity']"));
        employeesQuantity.sendKeys("20");
        WebElement creationReason = driver.findElement(By.xpath("//div//textarea[@id = 'creationReason']"));
        creationReason.sendKeys("Some reason");
        WebElement salary = driver.findElement(By.xpath("//div//input[@id = 'salary']"));
        salary.sendKeys("550");
        WebElement list = driver.findElement(By.xpath("//div//select[@id = 'currency']"));
        Select currencySelect = new Select(list);
        currencySelect.selectByValue("3");
        WebElement jobType = driver.findElement(By.xpath("//div//select[@id = 'jobType']"));
        Select jobTypeSelect = new Select(jobType);
        jobTypeSelect.selectByValue("1");
        WebElement employees = driver.findElement(By.xpath("//div//input[@id = 'employees']"));
        employees.sendKeys("Not provide");
        WebElement businessTrip = driver.findElement(By.xpath("//div//input[@id = 'businessTrip']"));
        businessTrip.sendKeys("USA, Every six months");
        WebElement timetable = driver.findElement(By.xpath("//div//input[@id = 'timetable']"));
        timetable.sendKeys("40 hours");
        WebElement probationPeriod = driver.findElement(By.xpath("//div//input[@id = 'probationPeriod']"));
        probationPeriod.sendKeys("one month");
        WebElement responsibilities = driver.findElement(By.xpath("//div//textarea[@id = 'responsibilities']"));
        responsibilities.sendKeys("Relax and do design");
        WebElement candidateType = driver.findElement(By.xpath("//*[@id = 'candidateTypeInternal']"));
        candidateType.click();
        WebElement education = driver.findElement(By.xpath("//div//select[@id = 'education']"));
        Select educationSelect = new Select(education);
        educationSelect.selectByValue("4");
        WebElement educationSpecialization = driver.findElement(By.xpath("//div//textarea[@id = 'educationSpecialization']"));
        educationSpecialization.sendKeys("The students of 3-4 courses of technical specialties");
        WebElement skills = driver.findElement(By.xpath("//div//a[@id = 'editrequiredCompetence']"));
        skills.click();
        //WebElement base = driver.findElement(By.xpath("//*[@id = 'category_22']"));    // OMG, don't know how to do that
        //base.click();


        /*WebElement searchCompetenceWord = driver.findElement(By.xpath("//div//input[@id='searchCompetenceWord']"));
        searchCompetenceWord.sendKeys("Обучаемость");
        WebElement firstSkill = driver.findElement(By.cssSelector("//*[contains(@class, 'icon-arrow-right')]\n"));
        firstSkill.click();*/


        /*      Here too

        WebElement secondSkill = driver.findElement(By.xpath("//div//i[@id = 'yui_patched_v3_11_0_3_1522492667769_8290']"));
        secondSkill.click();
        WebElement professionalSkills = driver.findElement(By.xpath("//div//span[@id = 'yui_patched_v3_11_0_3_1522492667769_8318']"));
        professionalSkills.click();
        WebElement webTechnologies = driver.findElement(By.xpath("//div//span[@id = 'yui_patched_v3_11_0_3_1522492667769_8485']"));
        webTechnologies.click();
        WebElement thirdSkill = driver.findElement(By.xpath("//div//i[@id = 'yui_patched_v3_11_0_3_1522492667769_8635']"));
        thirdSkill.click();
        WebElement fourthSkill = driver.findElement(By.xpath("//div//i[@id = 'yui_patched_v3_11_0_3_1522492667769_8659']"));
        fourthSkill.click();
        WebElement fifthSkill = driver.findElement(By.xpath("//div//i[@id = 'yui_patched_v3_11_0_3_1522492667769_8655']"));
        fifthSkill.click();*/
        WebElement buttonOK = driver.findElement(By.xpath("//div//button[@id = 'yui_patched_v3_11_0_3_1522492667769_8675']"));
        buttonOK.click();
        WebElement comment = driver.findElement(By.xpath("//div//textarea[@id = 'comment']"));
        comment.sendKeys("Good luck & have fun ");
        WebElement saveButton = driver.findElement(By.xpath("//div//button[@id = 'save']"));
        saveButton.click();
    }
}
