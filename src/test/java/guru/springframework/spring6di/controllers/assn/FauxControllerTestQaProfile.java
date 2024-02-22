package guru.springframework.spring6di.controllers.assn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("qa")
@SpringBootTest
class FauxControllerTestQaProfile {

    @Autowired
    FauxController fauxController;

    @Test
    void getDataSource() {
        fauxController.getDataSource();
    }
}