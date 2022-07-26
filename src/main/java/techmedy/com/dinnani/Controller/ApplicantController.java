package techmedy.com.dinnani.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import techmedy.com.dinnani.model.Applicant;
import techmedy.com.dinnani.repo.ApplicantRepository;
import techmedy.com.dinnani.serviceImpl.ApplicantServiceImp;

@Controller
public class ApplicantController {

    @Autowired
    ApplicantServiceImp applicantServiceImp;

    @Autowired
    ApplicantRepository applicantRepository;

    @GetMapping("/ApplicantSignUp")
    public String ApplicantSignUpPage(Model model){
        Applicant applicant = new Applicant();
        model.addAttribute("applicant",applicant);
        return "";
    }

    @PostMapping("/newApplicant")
    public String saveUser(Applicant applicant){
        applicantServiceImp.CreateApplicant(applicant);
        return "";
    }

    @PostMapping("/updateApplicantPassword/{email}")
    public String Password(Applicant applicant,@PathVariable("email") String email){
        applicantServiceImp.updatePassword(applicant,email);
        return "";
    }

    @GetMapping("/deleteApplication/{applicantId}")
    public String DeleteApplication(@PathVariable("applicantId") Long applicantId){
        applicantServiceImp.deleteApplicant(applicantId);
        return "";
    }

    @GetMapping("/editApplicant/{applicantId}")
    public String EditApplicant(@PathVariable("applicantId") long applicantId){
        Applicant applicant = applicantRepository.findById(applicantId).orElse(null);
        return "";
    }

    @PostMapping("/updateApplicant")
    public String updateApplicant(Applicant applicant, Long applicantId){
        applicantServiceImp.EditApplicant(applicant,applicantId);
        return "";
    }
}
