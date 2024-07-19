package member.controllers;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    private boolean termsAgree;


}
