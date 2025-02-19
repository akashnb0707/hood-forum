import React from "react";
import Button from "@mui/material/Button";
import ThumbUpOffAltIcon from "@mui/icons-material/ThumbUpOffAlt";
import CommentOutlinedIcon from "@mui/icons-material/CommentOutlined";
import ShareIcon from "@mui/icons-material/Share";
import "./Utilities.css";

const Utilities = () => {
  return (
    <div className="container-1">
      <Button variant="" className="like">
        <ThumbUpOffAltIcon id="likeIcon" />
        Like
      </Button>
      <Button variant="" className="comment">
        <CommentOutlinedIcon id="commentIcon" />
        Comment
      </Button>
      <Button variant="" className="share">
        <ShareIcon id="shareIcon" />
        Share
      </Button>
    </div>
  );
};

export default Utilities;
