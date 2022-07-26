package techmedy.com.dinnani.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import techmedy.com.dinnani.model.User;
import techmedy.com.dinnani.repo.UserRepository;
import techmedy.com.dinnani.serviceImpl.UsersServiceImpl;

@Controller
public class UserController {

    @Autowired
    UsersServiceImpl usersService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/UserSignUp")
    public String ApplicantSignUpPage(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "";
    }

    @PostMapping("/newUser")
    public String saveUser(User user){
        usersService.CreateUser(user);
        return "";
    }

    @PostMapping("/updateUserPassword/{email}")
    public String Password(User user,@PathVariable("email") String email){
        usersService.updatePassword(user,email);
        return "";
    }

    @GetMapping("/deleteUser/{userId}")
    public String DeleteApplication(@PathVariable("userId") Long userId){
        usersService.deleteUser(userId);
        return "";
    }

    @GetMapping("/editUser/{userId}")
    public String EditApplicant(@PathVariable("userId") long userId){
        User user = userRepository.findById(userId).orElse(null);
        return "";
    }

    @PostMapping("/updateUser")
    public String updateApplicant(User user, Long userId){
        usersService.EditUser(user,userId);
        return "";
    }
}
