package cyker.app.webservices.ui.controller;

import cyker.app.webservices.shared.dto.UserDto;
import cyker.app.webservices.ui.model.request.UserDetailsRequestModel;
import cyker.app.webservices.ui.model.response.UserRest;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {



    @GetMapping
    public String getUser() {
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils copyProperties(createdUser, returnValue);

        return returnValue;


    }

    @PutMapping
    public String updateUser() {
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }
}
