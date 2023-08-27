package spring.app.healthcare.serviceImplementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import spring.app.healthcare.entity.UserInfo;
import spring.app.healthcare.repository.UserInfoRepository;

import java.util.Optional;
 
@Service
@Lazy
public class UserInfoService implements UserDetailsService {
 
    @Autowired
    private UserInfoRepository repository;
 
    @Autowired
    private PasswordEncoder encoder;
 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
 
        Optional<UserInfo> userDetail = repository.findByName(username);
 
        // Converting userDetail to UserDetails
        return userDetail.map(UserInfoDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
    }
 
    public String addUser(UserInfo userInfo) {
        userInfo.setPassword(encoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "User Added Successfully";
    }
 
 
}