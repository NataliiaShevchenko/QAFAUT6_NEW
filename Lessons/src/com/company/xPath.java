package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Nataliia on 13.08.2015.
 */
public class xPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
        ChromeDriver d123 = new ChromeDriver();  //открываем хром
        d123.get("http://angel.net/~nic/passwd.current.html");      //открываем сайт
        System.out.println(d123.getTitle());   //вывести тайтл

        WebElement j = d123.findElementByXPath("//*[@name = 'master'");
        j = d123.findElement(By.xpath("//*[@name = 'master'"));
        j.sendKeys("mypass");
    }
}
