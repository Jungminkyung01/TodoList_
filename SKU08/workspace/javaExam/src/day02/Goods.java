package day02;

public class Goods {


		private String name;	//private����(�����) ���������� �����Ҽ��� ����.
		private int price;
		private int countStock;
		private int countSold;
		
		//private�� ����ؼ� set/get�� �������� �ǰ�?
		public void setName(String n) {
			name=n;
		}
		
		public void setPrice(int p) {
			price=p;
		}
		
		public int getPrice() {
			return price;
		}

		public int getCountSock() {
			return countStock;
		}

		public void setCountStock(int countStock) {
			this.countStock = countStock;
		}

		public int getCountSold() {
			return countSold;
		}

		public void setCountSold(int countSold) {
			this.countSold = countSold;
		}

		public String getName() {
			return name;
		}

		public static void main(String[] args) {
			
		}
}
