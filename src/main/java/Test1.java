
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.commands.SetValue;
import io.github.bonigarcia.wdm.WebDriverManager;

import javafx.scene.control.ButtonType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Test1 {

    @Test
    public void Test1() {
        WebDriverManager.chromedriver().setup();

        Selenide.open("https://next.privat24.ua/money-transfer/card");

        Selenide.$(By.cssSelector("#app > div.root_wJ9hs8Vo1i > section > div > div.root_rr82wF_RGM > div.content_njTUt82UM4 > div.root_ldIyG4e33S > form > div:nth-child(1) > div > div.sc-kAzzGY.kMwAjf.sc-kgAjT.hSqdyW > div > div:nth-child(1) > div.sc-jzgbtB.gVCHSA > div.sc-cmTdod.gypweG > div:nth-child(2) > input")).sendKeys("4552331448138217");
        Selenide.$(By.cssSelector("#app > div.root_wJ9hs8Vo1i > section > div > div.root_rr82wF_RGM > div.content_njTUt82UM4 > div.root_ldIyG4e33S > form > div:nth-child(1) > div > div.sc-kAzzGY.kMwAjf.sc-kgAjT.hSqdyW > div > div.sc-bMvGRv.dHtXBd > div.sc-CtfFt.jMqTDZ > div.sc-laTMn.bYupHL > div > div:nth-child(2) > input")).sendKeys("05/24");
        Selenide.$(By.cssSelector("#app > div.root_wJ9hs8Vo1i > section > div > div.root_rr82wF_RGM > div.content_njTUt82UM4 > div.root_ldIyG4e33S > form > div:nth-child(1) > div > div.sc-kAzzGY.kMwAjf.sc-kgAjT.hSqdyW > div > div.sc-bMvGRv.dHtXBd > div.sc-CtfFt.jMqTDZ > div.sc-hGoxap.ebPmNd > div.sc-eerKOB.clfBnd > div > div:nth-child(2) > input")).sendKeys("926");
        Selenide.$(By.cssSelector("#app > div.root_wJ9hs8Vo1i > section > div > div.root_rr82wF_RGM > div.content_njTUt82UM4 > div.root_ldIyG4e33S > form > div:nth-child(2) > div > div.sc-kAzzGY.kMwAjf.sc-kgAjT.hSqdyW > div > div:nth-child(1) > div.sc-jzgbtB.gVCHSA > div.sc-cmTdod.gypweG > div:nth-child(2) > input")).sendKeys("4004159115449003");
        Selenide.$(By.cssSelector("#app > div.root_wJ9hs8Vo1i > section > div > div.root_rr82wF_RGM > div.content_njTUt82UM4 > div.root_ldIyG4e33S > form > div:nth-child(3) > div > div.sc-cmTdod.gRUIwg.amount_enyDvGm32N > div:nth-child(2) > input")).sendKeys("123");

        Selenide.$(By.cssSelector("#app > div.root_wJ9hs8Vo1i > section > div > div.root_rr82wF_RGM > div.content_njTUt82UM4 > div.root_ldIyG4e33S > form > div:nth-child(3) > div > div.currency_LIup4nXfM7 > div > div > div.sc-dqBHgY.dxKPDw > button > div.sc-dfVpRl.UrpzX > span")).click();
        Selenide.$("#app > div.root_wJ9hs8Vo1i > section > div > div.root_rr82wF_RGM > div.content_njTUt82UM4 > div.root_ldIyG4e33S > form > div:nth-child(3) > div > div.currency_LIup4nXfM7 > div > div > div.sc-dqBHgY.dxKPDw > div > div > div > div > button:nth-child(2)").click();
        Selenide.$(By.cssSelector("#app > div.root_wJ9hs8Vo1i > section > div > div.root_rr82wF_RGM > div.content_njTUt82UM4 > div.root_ldIyG4e33S > form > div.textCenter_FVWFx5O3Fm > div > button")).click();
Selenide.open("https://next.privat24.ua/money-transfer/card");




    }
}


