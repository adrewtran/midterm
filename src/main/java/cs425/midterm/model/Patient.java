package cs425.midterm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int PatientId;
    private String FirstName;
    private String LastName;
    private String MailingAddress;
    private String ContactPhoneNumber;
    private String Email;
    private String DateOfBirth;
}
