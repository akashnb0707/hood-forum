package com.example.forum.service.comment;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.forum.dto.Comment;
import com.example.forum.repositoryservices.comment.CommentRepositoryService;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepositoryService commentRepositoryService;

    @Override
    public Comment createComment(Comment comment) {
        return commentRepositoryService.createComment(comment);
    }

    @Override
    public ArrayList<Comment> getAllComments(String postId) {
        return commentRepositoryService.getAllComments(postId);
    }
    
    @Override
    public Comment getCommentByCommentId(String id) throws Exception{
       try {
        Comment comment  = commentRepositoryService.getCommentByCommentId(id);
        return comment;
       } catch (Exception e) {
        throw(e);
       }
    }
    
    @Override
    public String deleteCommentByCommentId(String id) throws Exception{
        try {
            return commentRepositoryService.deleteByCommentId(id);
        } catch (Exception e) {
            throw(e);
        }
    }
    @Override
    public String deleteCommentByPostId(String id) throws Exception{
        try {
            return commentRepositoryService.deleteByPostId(id);
        } catch (Exception e) {
            throw(e);
        }
    }

    @Override
    public Comment updateComment(String id, Comment commentRequest) throws Exception{
        try {
            Comment comment = commentRepositoryService.getCommentByCommentId(id);
            comment.setDescription(commentRequest.getDescription());
            comment.setCreatedOn(commentRequest.getCreatedOn());
            return comment;
        } catch (Exception e) {
            throw (e);
        }   
    }

    
}
