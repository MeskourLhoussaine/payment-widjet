package ma.m2t.paymentwidjet.security.jwt.services;

import ma.m2t.paymentwidjet.dao.IDAO;
import ma.m2t.paymentwidjet.models.User;
import ma.m2t.paymentwidjet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IDAO<User> {


    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User save(User o) {
        return userRepository.save(o);
    }


    public User 	findById(Long id) {
        // TODO Auto-generated method stub
        return userRepository.findById(id).get();
    }

    @Override
    public void update(User o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(User o) {
        // TODO Auto-generated method stub

    }

    public void deleteById(Long o) {

        userRepository.deleteById(o);

    }





}
