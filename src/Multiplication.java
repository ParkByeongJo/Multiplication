import java.util.Scanner;
import java.util.Random;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//�Է��� �ޱ� ���� ���� ����
		Random random=new Random();//������ ���ڸ� ��� ���� ���� ����
		int num;//���� �Է��ϱ� ���� ����
		int k;//�ݺ����� ���� ����
		int sum=0;//�� �� ����
		int score=0;//������ ����ϱ� ���� ����
		int ca=0;//���� ����
		int fa=0;//���� ����

		for(k=0;k<5;k++) {//�ݺ����� 5�� ����
			int x = random.nextInt(9)+1;//1~9������ ������ ���ڸ� int�� ���� x�� ����
			int y = random.nextInt(9)+1;//1~9������ ������ ���ڸ� int�� ���� y�� ����
			System.out.println(x+"*"+y+"?");

			System.out.println("���� ������ ���� �Է��ϼ���(����Ϸ��� 0�� �Է�):");
			num=input.nextInt();//�Է¹ޱ� ���� ����
			
			if(num!=0) {//�Է��� ���� 0�� �ƴ� ���
				if(num==x*y) {//�Է��� ���� x*y�� ���� ���
					System.out.println("�����Դϴ�.\n");
					score+=20;//20�� ȹ��
					ca++;//���� �� ��� ����
				}
				
				else if(num!=x*y) {//�Է��� ���� x*y�� ���� ���� ���
					System.out.println("Ʋ�Ƚ��ϴ�.\n");
					score-=10;//10�� ����
					fa++;//���� �� ��� ����
				}
			}
			else if(num==0){//�Է��� ���� 0�� ��
				System.out.println("���");
				score=0;//������ 0�� ó��
				k=5;//�ݺ����� �� 5���� ���� ���� k�� 0���� 4�϶� ������ k�� ������ �����̸� �ݺ��� Ż��
			}
		}
		sum+=score;//���� ���

		if(sum<0) {//������ 0������ ���
			sum-=(fa*(-10));//������ ������ ���� �ʵ����ϴ� ��� ����
		}

		System.out.println("���� ��= "+ca);
		System.out.println("���� ��= "+fa);
		System.out.println("�� ��= "+sum);

		if(sum>=50) {//������ 50�� �̻��� ��
			System.out.println("�հ��Դϴ�.");
		}

		else if(sum>=0 && sum<50) {//������ 0�� �̻� 50�� �̸��� ��
			System.out.println("���հ��Դϴ�.");
		}
	}

}
