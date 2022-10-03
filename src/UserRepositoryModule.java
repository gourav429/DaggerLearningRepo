import dagger.Module;
import dagger.Provides;

@Module
public class UserRepositoryModule {
    @Provides
    public UserRepository getSQLRepository(SQLRepository sqlRepository) {
        return sqlRepository;
    }
}
