package com.syntax.review11;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class E9ArrayList {
    public static void main(String[] args) {

        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.amazon.com/");
        List<WebElement> allATags= webDriver.findElements(By.xpath("//a"));
        for(WebElement e:allATags){
            if(!e.getText().isEmpty()) {
                System.out.println(e.getText());
            }
            }

            webDriver.close();

        }




    }

