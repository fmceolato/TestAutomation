package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Support.utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class homePage extends utils {

    WebDriver driver;
        private By firstname = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
        private By lastname = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
        private By address = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
        private By getemail = By.xpath("//*[@id=\"eid\"]/input");
        private By phonenumber = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
        private By male = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]");
        private By female = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]");
        private By hobcricket = By.id("checkbox1");
        private By hobmovies = By.id("checkbox2");
        private By hobhockey = By.id("checkbox3");
        private By fieldlinguage = By.id("msdd");
        private By filllinguage = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a");
        private By fillSkill = By.xpath("//*[@id=\"Skills\"]/option[39]");
        private By fillcountry = By.id("countries");
        private By fillselcountry = By.xpath("//*[@id=\"country\"]/option[4]");
        private By fillyear = By.xpath("//*[@id=\"yearbox\"]/option[86]");
        private By fillmounth = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[4]");
        private By fillday = By.xpath("//*[@id=\"daybox\"]/option[2]");
        private By fillPassword1 = By.id("firstpassword");
        private By fillPassword2 = By.id("secondpassword");
        private By buttonSubmit = By.id("submitbtn");


    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public void get_page (){
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
    }

    public void fillFirstName(String name){
        driver.findElement(firstname).sendKeys(name);
    }

    public void fillLastName(String sobreNome){
        driver.findElement(lastname).sendKeys(sobreNome);
    }

    public void fillAdrress(String Endereco){
        driver.findElement(address).sendKeys(Endereco);
    }

    public void fillEmail () {
        driver.findElement(getemail).sendKeys(emailaleatorio());
    }

    public void fillPhone (String telefon) {
        driver.findElement(phonenumber).sendKeys(telefon);
    }

    public void fillGender (Integer type) {
        if(type == 1) {
            driver.findElement(male).click();
        }else if (type == 2){
            driver.findElement(female).click();
        }

    }

    public void fillHobbie () {
        driver.findElement(hobmovies).click();
        driver.findElement(hobhockey).click();
    }

    public void fillLinguage () {
        driver.findElement(fieldlinguage).click();
        driver.findElement(filllinguage).click();
    }

    public void fillSkills () {
        driver.findElement(fillSkill).click();
    }

    public void fillCountry () {
        driver.findElement(fillcountry).click();
    }

    public void fillSelCountry () {
        driver.findElement(fillselcountry).click();
    }

    public void fillDateOfBird () {
        driver.findElement(fillyear).click();
        driver.findElement(fillmounth).click();
        driver.findElement(fillday).click();
    }

    public void fillPassword () {
        String savePassword = randomNumber();
        driver.findElement(fillPassword1).sendKeys(savePassword);
        driver.findElement(fillPassword2).sendKeys(savePassword);
    }

    public void clickSubmit (){
        driver.findElement(buttonSubmit).click();
    }


    public void checkRegisters () {
        //Assert Gender
        WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
        WebElement checkBox2 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
        Assert.assertTrue(checkBox.isSelected());
        Assert.assertFalse(checkBox2.isSelected());

        //Assert Hobies
        WebElement checkHobMovies = driver.findElement(By.id("checkbox2"));
        WebElement checkHobHockey = driver.findElement(By.id("checkbox3"));

        Assert.assertTrue("Movies não selecionado", checkHobMovies.isSelected());
        Assert.assertTrue("Hockey não selecionado",checkHobHockey.isSelected());

        //Assert Linguage
        String nameLinguage = driver.findElement(By.xpath("//*[@id=\"msdd\"]/div")).getText();
        Assert.assertEquals("IDIOMA ERRADO", "Portuguese",nameLinguage);

        //Assert Skill
        String textSkill = driver.findElement(fillSkill).getText();
        Assert.assertEquals("SKILL ERRADO", "Java", textSkill);

        //Assert Country
        String textCountry = driver.findElement(fillcountry).getText();
        Assert.assertEquals("PAÍS INVÁLIDO","Brazil", textCountry);
    }
}