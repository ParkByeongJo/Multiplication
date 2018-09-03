import java.util.Scanner;
import java.util.Random;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//입력을 받기 위한 변수 생성
		Random random=new Random();//랜덤한 숫자를 얻기 위한 변수 생성
		int num;//답을 입력하기 위한 변수
		int k;//반복문을 위한 변수
		int sum=0;//총 점 변수
		int score=0;//점수를 계산하기 위한 변수
		int ca=0;//정답 변수
		int fa=0;//오답 변수

		for(k=0;k<5;k++) {//반복문을 5번 돌림
			int x = random.nextInt(9)+1;//1~9사이의 랜덤한 숫자를 int형 변수 x에 저장
			int y = random.nextInt(9)+1;//1~9사이의 랜덤한 숫자를 int형 변수 y에 저장
			System.out.println(x+"*"+y+"?");

			System.out.println("곱셈 문제의 답을 입력하세요(통과하려면 0을 입력):");
			num=input.nextInt();//입력받기 위한 과정
			
			if(num!=0) {//입력한 답이 0이 아닐 경우
				if(num==x*y) {//입력한 답이 x*y와 같은 경우
					System.out.println("정답입니다.\n");
					score+=20;//20점 획득
					ca++;//정답 수 계산 과정
				}
				
				else if(num!=x*y) {//입력한 답이 x*y와 같지 않은 경우
					System.out.println("틀렸습니다.\n");
					score-=10;//10점 감점
					fa++;//오답 수 계산 과정
				}
			}
			else if(num==0){//입력한 답이 0일 때
				System.out.println("통과");
				score=0;//점수를 0점 처리
				k=5;//반복문을 총 5번을 도는 것은 k가 0부터 4일때 까지로 k가 임의의 숫자이면 반복문 탈출
			}
		}
		sum+=score;//총점 계산

		if(sum<0) {//총점이 0이하일 경우
			sum-=(fa*(-10));//총점이 음수가 되지 않도록하는 계산 과정
		}

		System.out.println("정답 수= "+ca);
		System.out.println("오답 수= "+fa);
		System.out.println("총 점= "+sum);

		if(sum>=50) {//총점이 50점 이상일 때
			System.out.println("합격입니다.");
		}

		else if(sum>=0 && sum<50) {//총점이 0점 이상 50점 미만일 때
			System.out.println("불합격입니다.");
		}
	}

}
