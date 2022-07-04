package com.igocst.coco.dto.message;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MessageListReadResponseDto {
    private String title;
    private String sender;
    private String status;
}