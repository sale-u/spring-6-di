package guru.springframework.spring6di.controllers.assn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// no ActiveProfiles is defined - so it should return "dev" profile as the default one
@SpringBootTest
class FauxControllerTestNoProfile {

    @Autowired
    FauxController fauxController;

    @Test
    void getDataSource() {
        fauxController.getDataSource();
    }
}