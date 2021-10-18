package com.project.week01.controller;

import com.project.week01.dto.CommentDto;
import com.project.week01.security.UserDetailsImpl;
import com.project.week01.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CommentController {

    private final CommentService commentService;

    // 댓글 수정
    @PutMapping("/comments/modify/{commentId}")
    public Long modifyPost(@PathVariable Long commentId,  @RequestBody CommentDto commentDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {

        // 댓글 수정
        commentService.modifyComment(commentId, commentDto, userDetails.getUser());
        return commentId;
    }

    // 댓글 삭제
    @DeleteMapping("/comments/delete/{commentId}")
    public Long deletePost(@PathVariable Long commentId, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        // 댓글 삭제
        commentService.deleteComment(commentId, userDetails.getUser());
        return commentId;
    }

}