import javax.inject.Inject;
import javax.inject.Singleton;

interface UserRepository {
    void saveUser(String email, String password);
}

@Singleton
class SQLRepository implements UserRepository {

    @Inject
    public SQLRepository() {}

    @Override
    public void saveUser(String email, String password) {
        System.out.println("User Saved in DB");
    }
}

class FirebaseRepository implements UserRepository {
    @Override
    public void saveUser(String email, String password) {System.out.println("User Saved in Firebase");}
}
