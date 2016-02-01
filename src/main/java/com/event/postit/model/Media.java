package com.event.postit.model;

public class Media {
	private Image image;

	public Media(Image image) {
		super();
		this.image = image;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Media [image=" + image + "]";
	}
}
