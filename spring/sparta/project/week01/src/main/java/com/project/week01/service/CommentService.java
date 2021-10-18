package com.project.week01.service;

import com.project.week01.dto.CommentDto;
import com.project.week01.model.Comment;
import com.project.week01.model.User;
import com.project.week01.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public Long modifyComment(Long commentId, CommentDto commentDto, User user) {
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(() -> new NullPointerException("해당 댓글이 존재하지 않습니다."));

        if(!user.getId().equals(comment.getUser().getId()))
            throw new IllegalArgumentException("회원님의 댓글이 아닙니다.");

        comment.setComment(commentDto.getComment());
        return commentRepository.save(comment).getId();
    }

    public Long deleteComment(Long commentId, User user) {
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(() -> new NullPointerException("해당 댓글이 존재하지 않습니다."));
        
        if(!user.getId().equals(comment.getUser().getId()))
            throw new IllegalArgumentException("회원님의 댓글이 아닙니다.");

        commentRepository.deleteById(commentId);
        return commentId;
    }
}
