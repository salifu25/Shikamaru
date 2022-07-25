/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techmedy.com.dinnani.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author hybof
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "applications")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Application extends AuditModel{
    
    @OneToMany
    private Applicant applicant;
    @OneToOne
    private ApplicantParentInfo applicantParentInfo;
    @OneToMany
    private Set<ApplicantSiblingsInfo> applicantSiblingsInfo;
    @OneToOne
    private ApplicantSchools applicantSchools;
    @OneToOne
    private JHSResult jHSResult;
    @OneToOne
    private SHSResult sHSResult;
    @OneToOne
    private Documents supportingDocuments;
            
}
