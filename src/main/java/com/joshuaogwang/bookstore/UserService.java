package com.joshuaogwang.bookstore;

import com.joshuaogwang.bookstore.dto.ChangePasswordRequest;
import com.joshuaogwang.bookstore.entity.User;
import com.joshuaogwang.bookstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
@RequiredArgsConstructor
public class UserService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public void changePassword(ChangePasswordRequest changePasswordRequest, Principal principal) {
        var user = (User) ((UsernamePasswordAuthenticationToken) principal).getPrincipal();
        if (!passwordEncoder.matches(changePasswordRequest.getCurrentPassword(), user.getPassword())) {
            throw new IllegalStateException("Wrong password");
        }

        if (!changePasswordRequest.getNewPassword().equals(changePasswordRequest.getConfirmationPassword())) {
            throw new IllegalStateException("Passwords do not match");
        }
        user.setPassword(passwordEncoder.encode(changePasswordRequest.getNewPassword()));
        userRepository.save(user);
    }
}
