package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UploadFileTypePage {
	
	AppiumDriver driver;
	
	public UploadFileTypePage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")
	WebElement addButton;
	
	@AndroidFindBy(id= "com.liqvd.digibox.test:id/llUploadFileFolders")
	WebElement uploadFile;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@index='0' and @text='sample-mp4-file.mp4']")
	WebElement videoFile;
	
//	@AndroidFindBy(xpath = "	\r\n"+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView[1]")
//	WebElement videoFileExist;
	
//	@AndroidFindAllBy(xpath="//android.widget.TextView[@resource-id='com.liqvd.digibox.test:id/tvName']")
//	WebElement allFilesUploaded;
//	public void select_file(WebElement fileElement) {
//		fileElement.click();
//	} 
//	
	public void click_AddButton() {
		addButton.click();
	}
	
	public void click_uploadFile() {
		uploadFile.click();
	}
	
	public void select_file() {
		videoFile.click();
	} 
	
	public void upload_file() {
		click_AddButton();
		click_uploadFile();
		select_file();
	}
	
//	public boolean videoFile_DIsplayed() {
//		boolean result = videoFileExist.isDisplayed();
//		return result;
//	}
//	
}