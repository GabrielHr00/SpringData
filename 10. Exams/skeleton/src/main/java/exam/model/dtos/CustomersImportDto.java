package exam.model.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class CustomersImportDto {
    @Size(min = 2)
    private String firstName;

    @Size(min = 2)
    private String lastName;

    @Email
    private String email;

    private String registeredOn;

    private CustomerTownDto town;

    public CustomersImportDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getRegisteredOn() {
        return registeredOn;
    }

    public CustomerTownDto getTown() {
        return town;
    }
}
