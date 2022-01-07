package ryancharuk.LabTwelveThread.Library;

public class Library {
	private String nameBook;
	private boolean hands;
	private boolean readArea;

	public Library(String nameBook, boolean hands, boolean readArea) {
		this.nameBook = nameBook;
		this.hands = hands;
		this.readArea = readArea;
	}

	public Library() {
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public boolean isHands() {
		return hands;
	}

	public void setHands(boolean hands) {
		this.hands = hands;
	}

	public boolean isReadArea() {
		return readArea;
	}

	public void setReadArea(boolean readArea) {
		this.readArea = readArea;
	}
}
