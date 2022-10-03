// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class UserRepositoryModule_GetSQLRepositoryFactory implements Factory<UserRepository> {
  private final UserRepositoryModule module;

  private final Provider<SQLRepository> sqlRepositoryProvider;

  public UserRepositoryModule_GetSQLRepositoryFactory(
      UserRepositoryModule module, Provider<SQLRepository> sqlRepositoryProvider) {
    this.module = module;
    this.sqlRepositoryProvider = sqlRepositoryProvider;
  }

  @Override
  public UserRepository get() {
    return Preconditions.checkNotNull(
        module.getSQLRepository(sqlRepositoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UserRepository> create(
      UserRepositoryModule module, Provider<SQLRepository> sqlRepositoryProvider) {
    return new UserRepositoryModule_GetSQLRepositoryFactory(module, sqlRepositoryProvider);
  }

  public static UserRepository proxyGetSQLRepository(
      UserRepositoryModule instance, Object sqlRepository) {
    return instance.getSQLRepository((SQLRepository) sqlRepository);
  }
}
