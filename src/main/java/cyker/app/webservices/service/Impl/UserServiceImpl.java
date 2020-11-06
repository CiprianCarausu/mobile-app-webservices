package cyker.app.webservices.service.Impl;

import cyker.app.webservices.service.UserInterface;
import cyker.app.webservices.shared.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserInterface {
    @Override
    public UserDto createUser(UserDto user) {
        return null;
    }
}
