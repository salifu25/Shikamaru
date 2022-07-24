/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package techmedy.com.dinnani.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techmedy.com.dinnani.model.Applicant;

/**
 *
 * @author hybof
 */

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long>{
    
    Optional <Applicant> findByEmail(String email);
    
}
