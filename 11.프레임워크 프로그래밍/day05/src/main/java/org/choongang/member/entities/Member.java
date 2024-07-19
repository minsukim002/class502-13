package org.choongang.member.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor

public class Member {
    @Id
    private Long seq;
    private String email;

    @JsonIgnore
    private String password;
    private String userName;

    //@JsonFormat(pattern="yyyy-mm-dd:mm:ss")
    private LocalDateTime regDt;
}
