package Steps;

import Pages.homePage;
import Run.runner;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class registerSteps extends runner {

   homePage HomePage =new homePage(driver);
    String nome ="Jenilda";
    String sobrenome = "Campos";

   @Dado("^que estou na tela de cadastro$")
        public void que_estou_na_tela_de_cadastro () {
            HomePage.get_page();
        }

    @Quando("^preencho o formulario de cadastro$")
        public void preencho_o_formulario_de_cadastro() {
            HomePage.fillFirstName(nome);
            HomePage.fillLastName(sobrenome);
            HomePage.fillAdrress("Rua Tapajos 504");
            HomePage.fillEmail();
            HomePage.fillPhone("0119547852");
            HomePage.fillGender(2);
            HomePage.fillHobbie("Cricket", "","");
            HomePage.fillLinguage();
            HomePage.fillSkills();
            HomePage.fillSelCountry();
            HomePage.fillDateOfBird();
            HomePage.fillPassword();

    }

    @Quando("^clico em submit$")
        public void clico_em_submit()  {
            HomePage.clickSubmit();

    }

    @Então("^vejo cadastro realizado com sucesso$")
        public void vejo_cadastro_realizado_com_sucesso()  {
            HomePage.checkRegister();

    }



}
