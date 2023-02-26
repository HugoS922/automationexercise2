package ui.web;

import ui.BasePageObject;
import ui.web.components.BrandsBarMenu;
import ui.web.components.TopBarMenu;
import ui.web.pages.AllenSollyJuniorPage;
import ui.web.pages.BabyHugPage;
import ui.web.pages.BibaPage;
import ui.web.pages.HMPage;
import ui.web.pages.KookieKidsPage;
import ui.web.pages.MadamePage;
import ui.web.pages.MastHarbourPage;
import ui.web.pages.PoloPage;

public abstract class BaseHomePage extends BasePageObject {
    public TopBarMenu topBarMenu;
    public BrandsBarMenu brandsBarMenu;
    public PoloPage poloPage;
    public HMPage hMPage;
    public MadamePage madamePage;
    public MastHarbourPage mastHarbourPage;
    public BabyHugPage babyHugPage;
    public AllenSollyJuniorPage allenSollyJuniorPage;
    public KookieKidsPage kookieKidsPage;
    public BibaPage bibaPage;
    public BaseHomePage() {
        topBarMenu = new TopBarMenu();
        brandsBarMenu = new BrandsBarMenu();
        poloPage = new PoloPage();
        hMPage = new HMPage();
        madamePage = new MadamePage();
        mastHarbourPage = new MastHarbourPage();
        babyHugPage = new BabyHugPage();
        allenSollyJuniorPage = new AllenSollyJuniorPage();
        kookieKidsPage = new KookieKidsPage();
        bibaPage = new BibaPage();
    }
}
