package cyker.app.webservices.service;

import cyker.app.webservices.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
}
