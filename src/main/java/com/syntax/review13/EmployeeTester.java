package com.syntax.review13;

import com.syntax.utils.Constants;
import com.syntax.utils.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class EmployeeTester {
    public static void main(String[] args) {

        List<Map<String, String>> empData= ExcelReader.read(Constants.EXCEL_FILE_PATH, "Sheet1");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/addEmployee");

        WebElement name = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        name.sendKeys("Admin");
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

        for (Map<String, String> map : empData) {
            WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
            pim.click();
            WebElement addEmp = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
            addEmp.click();
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(map.get("FirstName"));
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(map.get("MiddleName"));
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(map.get("LastName"));
        }
    }
}
