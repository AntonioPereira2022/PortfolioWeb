package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunnerWeb;

import java.util.Random;

public class Utils extends RunnerWeb {
        public static void waitElementBePresen(By element, Integer tempo) {
            WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }

        public static String getRandonEmail() {
            String email_init = "jr";                                 //RANDOM retorna um numero decimal
            String email_final = "@teste.com";
            Random random = new Random();
            int minimo = 1;
            int maximo = 999999989;
            int resultado = random.nextInt(maximo - minimo) + minimo;
            return email_init + resultado + email_final;
        }
    }


