package com.igocst.coco.dto.comment;

import com.igocst.coco.domain.MemberRole;
import lombok.*;
import java.time.LocalDateTime;

@Builder
@Getter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentReadResponseDto {
    private Long id;
    private Long postId;
    private String comments;
    //List가 아니라 String으로 해줘야함 왜냐하면, Comment entity에  getContent할 content가 String 타입이니까.
    private String nickname;
    private String status;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    // 댓글을 삭제 할 수 있는지 여부 체크
    private boolean enableDelete;
    private boolean enableUpdate;
    // 관리자 여부 체크
    private MemberRole memberRole;
    // 멤버 정보 읽기
    private String profileImageUrl;
    private String githubUrl;
    private String portfolioUrl;
    private String introduction;
}