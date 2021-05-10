package ccbill.training.api.v1.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    @Schema(description = "First Name of customer", defaultValue = "", required = true)
    private String firstName;

    @Schema(description = "Surname of customer", defaultValue = "", required = true)
    private String lastName;
    private String customerUrl;
}
