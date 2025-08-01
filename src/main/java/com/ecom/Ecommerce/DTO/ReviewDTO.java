package com.ecom.Ecommerce.DTO;

import java.util.UUID;

public class ReviewDTO {
    private UUID reviewId;
    private UUID userId;
    private UUID productId;
    private String comment;
    private int rating;
	public UUID getReviewId() {
		return reviewId;
	}
	public void setReviewId(UUID reviewId) {
		this.reviewId = reviewId;
	}
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	public UUID getProductId() {
		return productId;
	}
	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
