package com.igocst.coco.dto.member;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberReadResponseDto {
    private String email;
    private String nickname;
    private String githubUrl;
    private String portfolioUrl;
    private String introduction;
    private String status;
    // 프로필 페이지 이미지
    private String profileImageUrl;
}
