/*��ȣ�� ����
 * ���迭�� �ε����� �������� �����鼭 �̴´�. 
 * ���࿩�⼭ null�� �ٲﺼ�� ������ �������� �ٽü���
 * 
 * ��ȣ �̱�
 * return ball:���� ���� ���� ������� ���� */
package day03;

import java.util.Random;

public class �ζǸӽ� {
	
		private int ball_num; //����ȣ
		//private: �������� ���̶� �ܺο��� ����� �� ����. 
		private int index; //�ε���
		//�ε����� ���� ���� �̱� ������ ���� ���� null�� ������ش�. 

		//�⺻������
		public �ζǸӽ�() {}
		
		//������ü ����-������ ���ڸ� �̱� ����
		Random rd = new Random();
		 
		public void ��ȣ����(int[] ball) { //�ζǺ����� ���� ���迭�� �Ű������� �Ѵ�.
			//�ε��� ��ȣ ���� ����
			index = rd.nextInt(45);
			
			//�̹� ���� ���̸� ���� �ʾҴ� ���� ���� �� ���� index�� �ٽ� �̴´�.
			if(ball[index] == 0) {
				while(ball[index] == 0) {
					index = rd.nextInt(45);
				}
			}
			
			//���� ����ȣ�� ball_num������ ����
			ball_num = ball[index];
			//���� ����ȣ�� 0���� �ʱ�ȭ
			ball[index]=0;
			
		}
		
		public int ��ȣ�̱�(){	
			//����ȣ ��ȯ
			return ball_num;
		}
	}
