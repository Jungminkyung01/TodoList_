/*Goods ��ü�� �ϳ� �����ϰ�, �� ��ü�� ���� ���۷��� �������� camera�� �ϼ���
��ǰ�̸�(name) �� "Nikon",
��(price)�� 400000,
�����(countStock)�� 30
�ȸ�����(countSold)�� 50
��� �ʵ�� private ���� �����ϰ� getter/setter �� ���� �����Ͽ��� �մϴ�.
���� �������� ���� ȭ�鿡 ����ϼ���.
 */

package day02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		System.out.println("��ǰ�̸�: "+camera.getName()+" ��ǰ����: "+camera.getPrice()+
				" ������: "+camera.getCountSock()+" �ȸ�����: "+camera.getCountSold());
	}

}
