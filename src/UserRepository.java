import javax.inject.Inject;

interface UserRepository {
    void saveUser(String email, String password);
}

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
