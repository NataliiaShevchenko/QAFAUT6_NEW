package com.company;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Nataliia on 04.08.2015.
 */
public class Lesson2 {
        public static void main (String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nataliia\\Documents\\QA Factory\\Java lib\\chromedriver.exe");
            ChromeDriver d123 = new ChromeDriver();  //открываем хром
            d123.get("http://google.com");      //открываем сайт
           try {
            Thread.sleep(2000);
           } catch (InterruptedException e) {
                e.printStackTrace();  // задержать браузер перед закрытием на 5 сек
            }
            System.out.println(d123.getTitle());   //вывести тайтл
            //d123.findElementByTagName("q");  // найти элемент страницы (в данном случае name="q" можно посмотреть в коде)

            WebElement j = d123.findElementByName("q"); //написать в поиске "котята"
            j.sendKeys("котята");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();  // задержать браузер перед закрытием на 5 сек
            }
            j.sendKeys(Keys.ENTER);  //нажать кнопку поиск/ввод

            d123.findElementByName("btnG").click(); // найти кнопку ввод и кликнуть

            d123.quit();                   //закрыть браузер
        }

}
