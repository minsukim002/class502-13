package member;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor(access =AccessLevel.PRIVATE) // 기본생성자
@AllArgsConstructor
@RequiredArgsConstructor
public class Member {
    @NonNull
    private String userId;

    @NonNull
    private String userPw;
    private String userNm;
    private String email;

    @ToString.Exclude
    private LocalDateTime regDt;

}
