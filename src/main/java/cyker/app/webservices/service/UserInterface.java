package cyker.app.webservices.service;

import cyker.app.webservices.shared.dto.UserDto;


public interface UserInterface {
    UserDto createUser(UserDto user);
}
