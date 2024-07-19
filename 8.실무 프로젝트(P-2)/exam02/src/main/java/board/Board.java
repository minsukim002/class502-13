package board;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Builder
@Data
public class Board {
        private long SEQ;
        private String POSTER;
        private String SUBJECT;
        private String CONTENT;
        private LocalDateTime REG_DT;
        private LocalDateTime MOD_DT;
    }

