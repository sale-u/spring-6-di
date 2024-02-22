package guru.springframework.spring6di.controllers.assn;

import guru.springframework.spring6di.services.assn.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FauxController {

    private final DataSourceService dataSourceService;

    public FauxController(@Qualifier("dataSource") DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public void getDataSource() {
        System.out.println(dataSourceService.getDataSource());
    }
}
