import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class UserRepositoryModule {
    @Singleton
    @Provides
    public UserRepository getSQLRepository(SQLRepository sqlRepository) {
        return sqlRepository;
    }
}
