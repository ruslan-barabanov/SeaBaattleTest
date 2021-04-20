package test.pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {

    protected MainPage() {
        super(By.xpath("//body[@class ='body body__865715898 body__ru body__with-pointerevents']"), "Main Sea Battle Page");
    }

    private final IButton playButton = getElementFactory().getButton(By.xpath("//div[contains(text(),'Играть')]"), "Play Button");

    public void getPlayButton() {
        playButton.click();
    }
}
