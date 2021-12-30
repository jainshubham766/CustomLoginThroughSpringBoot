package com.TestAPI.MyStsProject.Message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                        //from lambok for getters and setters
@NoArgsConstructor            //from lambok for default constructor
@AllArgsConstructor            //from lambok for para. constructor

public class LoginApi {

    private String userId;
    private String password;


    public void updateUserId(String userId) {
        this.setUserId(userId);
    }

    public void updatePasword(String password) {
        this.setPassword(password);
    }

    public String toString() {
        return ("The User Id : " + this.userId + "\nWith the password: " + this.password);

    }
}
