package com.event.postit.model;

public class Image {
	private String name;
	private String url;
	private String size;

	public Image(String name, String url, String size) {
		super();
		this.name = name;
		this.url = url;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Media [name=" + name + ", url=" + url + ", size=" + size + "]";
	}

}
