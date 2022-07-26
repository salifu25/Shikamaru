/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techmedy.com.dinnani.serviceImpl;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import techmedy.com.dinnani.model.Applicant;
import techmedy.com.dinnani.repo.ApplicantRepository;

/**
 *
 * @author hybof
 */
@Slf4j
@Service
@AllArgsConstructor
public class ApplicantServiceImp {

    @Autowired
    ApplicantRepository applicantRepository;

    private  final BCryptPasswordEncoder bCryptPasswordEncoder;


    public Applicant FindApplicantByEmail(String email) {
        Applicant applicant = null;
        try {
            Optional<Applicant> result = applicantRepository.findByEmail(email);
            if (result.isEmpty()) {
                log.info("No Applicant with email " + email);
                return applicant;
            }
            applicant = result.get();
            return applicant;
        } catch (Exception ex) {
            log.error("Failed to find Application with email " + email + " " + ex.getMessage());
            return applicant;
        }
    }

    public boolean CreateApplicant(Applicant newApplicant) {
        try {
            String EncodedPassword = bCryptPasswordEncoder.encode(newApplicant.getPassword());
            newApplicant.setPassword(EncodedPassword);
            applicantRepository.save(newApplicant);
            return true;
        } catch (Exception ex) {
            log.error("Failed to save Application " + ex.getMessage());
            return false;
        }
    }

    public boolean EditApplicant(Applicant updateApplicant, long applicationId) {
        try {
            Optional<Applicant> result = applicantRepository.findById(applicationId);
            if (result.isEmpty()) {
                log.info("No applicant with ID " + applicationId + " found");
                return false;
            }
            Applicant originalApplicant = result.get();
            originalApplicant.setEmail(updateApplicant.getEmail());
            originalApplicant.setFirstName(updateApplicant.getFirstName());
            originalApplicant.setOtherNames(updateApplicant.getOtherNames());
            originalApplicant.setLastName(updateApplicant.getLastName());
            originalApplicant.setPhone(updateApplicant.getPhone());
            originalApplicant.setDob(updateApplicant.getDob());
            originalApplicant.setHomeTown(updateApplicant.getHomeTown());
            originalApplicant.setRegion(updateApplicant.getRegion());
            originalApplicant.setNationality(updateApplicant.getRegion());
            applicantRepository.save(originalApplicant);
            return true;
        } catch (Exception ex) {
            log.error("Failed to update Application " + ex.getMessage());
            return false;
        }
    }

    public boolean deleteApplicant(long applicantId) {
        try {
            applicantRepository.deleteById(applicantId);
            return true;
        } catch (Exception ex) {
            log.error("Failed to delete Application " + ex.getMessage());
            return false;
        }
    }

    public boolean updatePassword(Applicant existingApplicant,String email){
        try {
            Applicant ExistingApplicant = applicantRepository.findByEmail(email).orElse(null);
            ExistingApplicant.setPassword(bCryptPasswordEncoder.encode(existingApplicant.getPassword()));
            applicantRepository.save(ExistingApplicant);
            log.info("password update successful " + existingApplicant.getPassword());
            return true;
        } catch (Exception e) {
            log.error("user not found" + e.getMessage());
            return false;
        }
    }

}
