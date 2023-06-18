package com.syntax.review13;

import com.syntax.utils.Constants;
import com.syntax.utils.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class HWPersonalDetails {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement name = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        name.sendKeys("Admin");
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();
        WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();
        WebElement addEmp = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
        addEmp.click();

        List<Map<String, String>> person = ExcelReader.read(Constants.EXCEL_FILE_PERS, "sheet1");
        for (Map<String, String> map : person) {
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(map.get("FirstName"));
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(map.get("MiddleName"));
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(map.get("LastName"));

            WebElement save1=driver.findElement(By.xpath("//input[@id='btnSave']"));
            save1.click();
            WebElement addP=driver.findElement(By.xpath("//input[@id='btnSave']"));
            addP.click();

            driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys(map.get("Driver'sLicenceNumber"));
            driver.findElement(By.xpath("//input[@name='personal[txtNICNo]']")).sendKeys(map.get("SSNNumber"));
            driver.findElement(By.xpath("//input[@id='personal_txtOtherID']")).sendKeys(map.get("OtherId"));

            WebElement LED=driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']"));
            LED.click();
            WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            Select select=new Select(month);
            select.selectByVisibleText(map.get("LicenceExpiryDateM"));

            WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            Select select1=new Select(year);
            select1.selectByValue(map.get("LicenceExpiryDateY"));

            List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
            for(WebElement date:dates) {
                String d = date.getText();
                if (d.equals(map.get("LicenceExpiryDateD"))) {
                    date.click();
                }
            }

            driver.findElement(By.xpath("//input[@id='personal_txtSINNo']")).sendKeys(map.get("SINNumber"));

            if (map.get("Gender").equals("Male")) {
                driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
            } else {
                driver.findElement(By.xpath("//input[@id='personal_optGender_2']")).click();
            }

            WebElement nation=driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
            Select select2=new Select(nation);
            select2.selectByVisibleText(map.get("Nationality"));

            WebElement marStatus=driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
            Select select3=new Select(marStatus);
            select3.selectByVisibleText(map.get("MaritalStatus"));

            WebElement dataOfBirth=driver.findElement(By.xpath("//input[@id='personal_DOB']"));
            dataOfBirth.click();
            WebElement DOBmonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            Select select4=new Select(DOBmonth);
            select4.selectByVisibleText(map.get("DateOfBirthM"));

            WebElement DOByear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            Select select5=new Select(DOByear);
            select5.selectByValue(map.get("DateOfBirthY"));

            List<WebElement> DOBdates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
            for(WebElement date1:DOBdates) {
                String d1 = date1.getText();
                if (d1.equals(map.get("DateOfBirthD"))) {
                    date1.click();
                }
            }

            driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']")).sendKeys(map.get("NickName"));
            driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']")).sendKeys(map.get("MilitaryService"));

            if(map.get("Smoker").equals("Yes")){
               driver.findElement(By.xpath("//input[@id='personal_chkSmokeFlag']")).click();
            }

            driver.findElement(By.xpath("//input[@id='btnSave']")).click();
            driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
            }

          driver.quit();
        }
    }



