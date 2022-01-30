package Support;


import Run.runner;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Random;

public class utils extends runner {

    public void waitElementtoPresent (By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String emailaleatorio(){

        String email_init = "usuario";
        String email_final = "@ig.com.br";

        Random random = new Random();
        int minimo = 100;
        int maximo = 9999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }

    public String randomNumber (){
        Random random = new Random();
        int minimum = 10000;
        int maximum = 99999999;
        int results = random.nextInt(maximum-minimum) + minimum;
        return "F" + results;
    }
}
