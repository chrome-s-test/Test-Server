package config.test;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "company")
@Getter
@ToString(exclude = "companyId")
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String companyNumber;

    @Column(nullable = false)
    private String companyEmail;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true)
    private String companyAddress;

    @Builder
    private Company(String companyName, String companyNumber, String companyEmail,
                    String password, String companyAddress) {
        this.companyName = companyName;
        this.companyNumber = companyNumber;
        this.companyEmail = companyEmail;
        this.password = password;
        this.companyAddress = companyAddress;
    }
}
