/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techmedy.com.dinnani.model;

import java.sql.Date;
import javax.persistence.Entity;
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
@Table(name = "applicants")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Applicant extends AuditModel{
    
    private String firstName;
    private String otherNames;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Date dob;
    private String homeTown;
    private String region;
    private String nationality;
    private Roles role = Roles.APPLICANT;
   
    
}
