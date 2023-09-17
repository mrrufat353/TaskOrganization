package az.org.organization.Dto;

import az.org.organization.Model.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskRequest {

    private String name;

    Enum<Status> statusEnum;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate deadline;

    private String description;

}

