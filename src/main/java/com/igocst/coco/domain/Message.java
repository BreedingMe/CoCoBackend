package com.igocst.coco.domain;

import com.igocst.coco.domain.timestamped.CreateTimestamped;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message extends CreateTimestamped {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MESSAGE_ID")
    private Long id;

    // 쪽지 보내는 회원
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Member sender;

    // 쪽지 받는 회원
    @ManyToOne(fetch = FetchType.LAZY)
    private Member receiver;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private boolean readState;

}