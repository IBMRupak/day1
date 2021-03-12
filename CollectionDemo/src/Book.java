

public class Book {
	
		private String title;
		private float price;
		private int publishYear;

		public int getPublishYear() {
			return publishYear;
		}

		public void setPublishYear(int publishYear) {
			this.publishYear = publishYear;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title)throws Exception {
			
			this.title = title;
		}
		public String toString()
		{
			return "{price="+this.price+", title="+this.title+" , publishYear="+this.publishYear"}";
		}
		
	
