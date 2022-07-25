/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techmedy.com.dinnani.model;

import javax.persistence.Entity;
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
@Table(name = "applicant_schools_information")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicantSchools extends AuditModel{
    @OneToOne
    private Applicant applicant;
    
    private String primarySchoolName;
    private String primarySchoolTown;
    private String primarySchoolAttendancePeriod;
    private String primarySchoolSponor;
    
    private String jhsName;
    private String jhsTown;
    private String jhsAttendancePeriod;
    private String jhsSponor;
    

    private String shsName;
    private String shsTown;
    private String shsAttendancePeriod;
    private String shsSponor;
    
    private String otherSchoolName;
    private String otherSchoolTown;
    private String otherSchoolAttendancePeriod;
    private String otherSchoolSponor;
    

    
    
}
