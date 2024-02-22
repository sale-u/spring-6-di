package guru.springframework.spring6di.services.assn;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("dataSource")
public class DataSourceServiceDev implements DataSourceService {
    @Override
    public String getDataSource() {
        return "dev - Get DataSource from DataSourceServiceDev";
    }
}
