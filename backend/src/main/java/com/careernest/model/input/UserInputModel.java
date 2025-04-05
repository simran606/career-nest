package com.careernest.model.input;

// import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "users")
public class UserInputModel {

    @Id
    private String id;

    private String name;
    private String email;
    private String password;

    // private String currentClass;
    // private List<String> interest;
    // private String prefferedLanguage;
    // private String careerGoal;

    private String createdAt;

}
