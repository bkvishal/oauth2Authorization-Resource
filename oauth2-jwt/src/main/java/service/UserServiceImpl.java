package service;

import com.oauthjwt.model.Users;
import com.oauthjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author : Vishal Srivastava
 * @Date : 14-06-2019
 **/
@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = userRepository.findByUsername(username);

        if (users!= null)
        {
            return new User(users.getUsername(), users.getPassword(),
                    Arrays.asList(new SimpleGrantedAuthority("ADMIN")));
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}
