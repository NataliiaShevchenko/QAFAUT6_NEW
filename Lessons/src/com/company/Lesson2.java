package com.company;

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
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();  // задержать браузер перед закрытием на 5 сек
            }


            d123.quit();                   //закрыть браузер
        }

}
