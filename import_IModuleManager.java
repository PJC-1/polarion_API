import com.polarion.alm.tracker.ITrackerService;
import javax.servlet.http.HttpServlet;

public class ImportIModuleManager<IContextId> extends HttpServlet {

    ITrackerService trackerService = (ITrackerService) PlatformContext.getPlatform().lookupService(ITrackerService.class);
    IModuleManager moduleManager = trackerService.getModuleManager();

}
