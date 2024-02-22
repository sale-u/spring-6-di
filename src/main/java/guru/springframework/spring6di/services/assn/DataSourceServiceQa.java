package guru.springframework.spring6di.services.assn;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("dataSource")
public class DataSourceServiceQa implements DataSourceService {
    @Override
    public String getDataSource() {
        return "qa - Get DataSource from DataSourceServiceQa";
    }
}
