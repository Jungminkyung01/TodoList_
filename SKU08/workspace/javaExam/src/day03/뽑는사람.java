/*�������� ��ȣ�� ��� */
package day03;

public class �̴»�� {

	public static void main(String[] args) {
		//�ζ� ��ȣ���� ���� �迭
		int[] rotto = new int[6];
		
		//�ζǺ� ��ü ����
		�ζǺ� rottoBall = new �ζǺ�();
		//�ζǸӽ� ��ü ����
		�ζǸӽ� rottoMachine = new �ζǸӽ�();
		
		for(int i=0;i<6;i++) {
			rottoMachine.��ȣ����(rottoBall.getBall());
			rotto[i] = rottoMachine.��ȣ�̱�();
		}
		
		//�ζ� ��ȣ ���
		System.out.print("�ζ� ��ȣ : ");
		for(int i=0;i<6;i++) {
			System.out.print(rotto[i] + " ");
		}
	}

}