/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techmedy.com.dinnani.serviceImpl;

import java.util.Date;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import techmedy.com.dinnani.model.User;
import techmedy.com.dinnani.repo.UserRepository;

/**
 *
 * @author hybof
 */
@Slf4j
@Service
@AllArgsConstructor
public class UsersServiceImpl {

    @Autowired
    private UserRepository usersRepository;

    private  final BCryptPasswordEncoder bCryptPasswordEncoder;

    public User FindUserByEmail(String email) {
        User user = null;
        try {
            Optional<User> result = usersRepository.findByEmail(email);
            if (result.isEmpty()) {
                log.info("No user with email " + email);
                return user;
            }
            user = result.get();
            return user;
        } catch (Exception ex) {
            log.error("Failed to find user with email " + email + " " + ex.getMessage());
            return user;
        }
    }

    public boolean CreateUser(User newUser) {
        try {
            newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
            usersRepository.save(newUser);
            return true;
        } catch (Exception ex) {
            log.error("Failed to save user " + ex.getMessage());
            return false;
        }
    }

    public boolean EditUser(User updateUser, long userId) {
        try {
            Optional<User> result = usersRepository.findById(userId);
            if (result.isEmpty()) {
                log.info("No user with ID " + userId + " found");
                return false;
            }
            User originalUser = result.get();
            originalUser.setEmail(updateUser.getEmail());
            originalUser.setFirstName(updateUser.getFirstName());
            originalUser.setLastName(updateUser.getLastName());
            originalUser.setPhone(updateUser.getPhone());
            usersRepository.save(originalUser);
            return true;
        } catch (Exception ex) {
            log.error("Failed to update user " + ex.getMessage());
            return false;
        }
    }

    public boolean deleteUser(long userId) {
        try {
            usersRepository.deleteById(userId);
            return true;
        } catch (Exception ex) {
            log.error("Failed to delete user " + ex.getMessage());
            return false;
        }
    }

    public boolean updatePassword(User user,String email) {
        // to be handled by Baba
        try {
            User Existinguser = usersRepository.findByEmail(email).orElse(null);
            Existinguser.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            usersRepository.save(Existinguser);
            log.info("password update successful " + user.getPassword());
            Date date = new Date();
            System.out.println(date);
            return true;
        } catch (Exception e) {
            log.error("user not found" + e.getMessage());
            return false;
        }

    }
}
