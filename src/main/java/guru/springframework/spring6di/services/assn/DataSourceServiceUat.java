package guru.springframework.spring6di.services.assn;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("dataSource")
public class DataSourceServiceUat implements DataSourceService {
    @Override
    public String getDataSource() {
        return "uat - Get DataSource from DataSourceServiceUat";
    }
}
