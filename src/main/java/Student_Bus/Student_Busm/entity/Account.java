package Student_Bus.Student_Busm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "students")
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "account_holder_name")
    private String studentId;          // Unique student identifier
    private String name;               // Student's full name
    private String department;         // Department name, e.g., "CSE"
    private String batch;              // Batch year, e.g., "2022"
    private String gender;             // Gender, e.g., "Male", "Female"
    private String hall;               // Hall name, e.g., "Hall A"
    private String bloodGroup;         // Blood group, e.g., "A+"
    private String contactNo;          // Contact number
    private String email;              // Email address
    private String password;           // Password (consider encrypting this in a real application)


}
