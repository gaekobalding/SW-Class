package Array;

import java.util.Scanner;

public class ArrayManager {

	public static void main(String[] args) {

		int [] array = new int[100];
		int index = -1;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실행");
		while(true) {
			System.out.println("1추가 2출력 3조회 4수정 5삭제 6삽입 0종료");
			System.out.println("번호 입력 : ");
			
			int menu =sc.nextInt();
			switch (menu) {
			case 1:
				System.out.print("추가 할 숫자 : "); 
				int input = sc.nextInt();
				array[count++] = input;
				break;
				
			case 2:
				System.out.print("출력 : ");
				for(int i=0; i<count; i++) {
					System.out.printf("[%d]", array[i]);
					System.out.println("\t");
				}
				break;
				
			case 3:
				System.out.println("조회 : ");
				int search = sc.nextInt();
				index = -1;  //찾기전에 인덱스를 초기화 시켜줘야 여러번 찾아도 안꼬인다.
				for(int i=0; i<count; i++) {
					if(array[i] == search) {
						index = i;
//						System.out.println(i+"Find!");
						break;
					}
				}
				if(index == -1) {
					System.out.println("Do Not Find!");
				}else {
					System.out.println(index+"Find!");
				}
				break;
				
			case 4:
				System.out.println("수정 : (00 00)");
				index = sc.nextInt();
				int update = sc.nextInt();
				if (index>=0 && index<count) {
					array[index] = update;
				}else {
					System.out.println("ERR");
				}
				break;
				
			case 5:
				System.out.print("삭제 index : ");
				index = sc.nextInt();
				for(int i = index; i<count-1; i++) {
					array[i] = array[i+1];
					
			//	for(int i = index+1; i<count; i++)
				//	array[i-1] = array[i];				=> 같은 기능의 다른 식이다.
				}
				count--;
				break;
				
			case 6:
				System.out.println("삽입 : 00 00");
				index = sc.nextInt();
				int insert = sc.nextInt();
				if (index >= 0 && index<count) {
				for(int i=count-1; i>=index; i--) { 
					array[i+1] = array[i];
					
			//	for(int i=count-1; i>=index; i--) { 
			//		array[i+1] = array[i];
				}
				array[index] = insert;
					count++;
				} else {
					System.out.println("ERR!");
				}
				break;
				
			case 0:
				System.out.println("종료");
				sc.close();
				System.exit(0);
				break;
				
				
			default :
				System.out.println("err");
			}

		}
		
	
	}

}
