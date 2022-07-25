/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techmedy.com.dinnani.model;

import javax.persistence.Column;
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
@Table(name = "supporting_documents")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Documents extends AuditModel{
    
    @OneToOne
    private Applicant applicant;
    @Lob
    @Column(name = "photograph", length = 1000)
    private byte[] photograph;
    @Lob
    private byte[] nationalID;
    @Lob
    private byte[] birthCertificate;
    @Lob
    private byte[] previousSponsorDetails;
    
    
}
