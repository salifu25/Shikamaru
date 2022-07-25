/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techmedy.com.dinnani.model;

import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "applicant_jhs_result")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JHSResult extends AuditModel{
    
    @OneToOne
    private Applicant applicant;
    private String BECEIndexNumber;
    private int BECEGrade;
     @Lob
    private byte[] BECECertificate;
    
    
}
