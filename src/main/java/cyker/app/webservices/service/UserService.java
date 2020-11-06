package cyker.app.webservices.service;

import cyker.app.webservices.shared.dto.UserDto;


public interface UserService {
    UserDto createUser(UserDto user);
}
