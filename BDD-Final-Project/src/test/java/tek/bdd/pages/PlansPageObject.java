package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtilities;

public class PlansPageObject extends SeleniumUtilities {
    public static final By PLANS_LOCATOR = By.linkText("Plans");
    public static final By PLAN_TYPE = By.xpath("(//th[@class='css-1zts0j'])[2]");
    public static final By PLAN_BASE_PRICE = By.xpath("(//th[@class='css-1zts0j'])[3]");
    public static final By DATE_CREATED = By.xpath("(//th[@class='css-1zts0j'])[4]");
    public static final By DATE_EXPIRES = By.xpath("(//th[@class='css-1zts0j'])[5]");
    public static final By CREATE_DATE_IS_TODAY_DATE_EST_TIME_ZONE = By.xpath("(//td[@class='css-132p0l1'])[3]");

    public static final By EXPIRE_DATE_IS_AFTER_EST_TIME_ZONE = By.xpath("(//td[@class='css-132p0l1'])[4]");



}
