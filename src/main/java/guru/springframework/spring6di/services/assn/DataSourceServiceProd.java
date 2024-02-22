package guru.springframework.spring6di.services.assn;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("dataSource")
public class DataSourceServiceProd implements DataSourceService {
    @Override
    public String getDataSource() {
        return "prod - Get DataSource from DataSourceServiceProd";
    }
}
