package Array;
import java.util.Scanner;


public class CustomerManager {
	
static final int MAX = 100;
	
	static String[] nameList = new String[MAX];
	static char[] genderList = new char[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthYearList = new int[MAX];
	
	static int count = 0;
	static int index = -1;
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			System.out.printf("\n고객의 수: %d, 인덱스: %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate,"
					+ " (D)elete, (Q)uit");
			System.out.print("메뉴 입력:");
			String menu = sc.next();
			menu = menu.toLowerCase();
			switch(menu.charAt(0)) {
			case 'i':
				System.out.println("고객 정보 입력을 시작합니다");
				if(count >= MAX) {
					System.out.println("더 이상 입력할 수 없습니다.");
				}else {
					insertCustomer();
					System.out.println("고객 정보를 입력했습니다.");
				}
				break;
			case 'p':
				System.out.println("이전 데이터를 출력합니다.");
				if(index <= 0) {
					System.out.println("이전 데이터가 없습니다.");
				}else {
					index--;
					printCustomer();
				}
				break;
			case 'n':
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count-1) {
					System.out.println("다음 데이터가 없습니다.");
				}else {
					index++;
					printCustomer();
				}
				break;
			case 'c':
				System.out.println("현재 데이터를 출력합니다.");
				if( (index>=0) && (index<count) ) {
					printCustomer();
				}else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'u':
				System.out.println("데이터를 수정합니다.");
				if( (index>=0) && (index<count) ) {
					System.out.println(index + "위치 데이터를 수정합니다.");
					updateCustomer();
				}else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if( (index>=0) && (index<count) ) {
					System.out.println(index + "위치 데이터를 삭제합니다.");
					deleteCustomer();
				}else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("메뉴를 잘 못 입력했습니다.");
			}
		}

	}//end main

	private static void deleteCustomer() {
		// TODO Auto-generated method stub
		
	}

	private static void updateCustomer() {
		// TODO Auto-generated method stub
		
	}

	private static void printCustomer() {
		// TODO Auto-generated method stub
		
	}

	private static void insertCustomer() {
		// TODO Auto-generated method stub
		
	}
		
	

}
