package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"EN", "default"})
@Profile({"EN", "default", "dev", "qa", "uat", "prod"})
// Profiles "dev", "qa", "uat", "prod" need to be added because DataSourceService works with these profiles
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world on English - EN";
    }
}
