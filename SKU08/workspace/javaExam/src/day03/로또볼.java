/*�� �迭�� ���� 1~45���� �迭������ ����
 * 
 * */
package day03;

public class �ζǺ� {
	//����ȣ���� ������ �迭
	private int[] ball = new int[45];
	
	//�⺻������
	//����ȣ���� ball�迭�� �����Ѵ�.
	public �ζǺ�() {
		for(int i=0;i<45;i++) {
			ball[i] = i+1;
		}
	}

	//����ȣ���� ������ �迭�� ��ȯ
	public int[] getBall() {
		return ball;
	}
}
