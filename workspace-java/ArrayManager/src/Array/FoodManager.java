package Array;

import java.util.Scanner;

public class FoodManager {

	static final int MAX = 100;
	
	static String[] nameList = new String[MAX];
	static int[] numList = new int[MAX];
	static String[] dateList = new String[MAX];
	static String[] infoList = new String[MAX];

	static int count = 0;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		while(true) {
			System.out.printf("\n식자재 갯수: %d\n", count);
			System.out.println("메뉴를 선택하세요:");
			System.out.println("(1) 입력, (2) 목록, (3) 수량 수정, (4) 음식물 쓰레기 버리기, (0) 냉장고 닫기");
			System.out.print("메뉴 선택: ");
			String option = sc.next();
			
			switch(option.charAt(0)) {
			case '1':
				System.out.println("식자재 등록");
				addFoodItem();
				break;
				
			case '2':
				System.out.println("식자재 목록");
				printAll();
				break;
				
			case '3':
				System.out.println("식자재 수량 수정");
				updateQuantity();
				break;
				
			case '4':
				System.out.println("음식물 쓰레기 버리기");
				delete();
				break;
				
			case '0':
				System.out.println("냉장고 닫기");
				sc.close();
				System.exit(0);
				break;
				
			default:
				System.out.println("잘못된 입력입니다. 다시 선택하세요.");
				break;
			}
		}
		
	}

	private static void delete() {
		if (count == 0) {
			System.out.println("등록된 식자재가 없습니다.");
			return;
		}
		
		System.out.print("버릴 식자재의 이름을 입력하세요: ");
		String nameToDelete = sc.next();

		boolean found = false;
		for (int i = 0; i < count; i++) {
			if (nameList[i].equals(nameToDelete)) {
				found = true;
				for (int j = i; j < count - 1; j++) {
					nameList[j] = nameList[j + 1];
					numList[j] = numList[j + 1];
					dateList[j] = dateList[j + 1];
					infoList[j] = infoList[j + 1];
				}
				count--;
				System.out.println(nameToDelete + "을(를) 버렸습니다.");
				break;
			}
		}
		if (!found) {
			System.out.println("해당 이름의 식자재를 찾을 수 없습니다.");
		}
	}

	private static void updateQuantity() {
		if (count == 0) {
			System.out.println("등록된 식자재가 없습니다.");
			return;
		}
		
		System.out.print("수량을 수정할 식자재의 이름을 입력하세요: ");
		String nameToUpdate = sc.next();

		boolean found = false;
		for (int i = 0; i < count; i++) {
			if (nameList[i].equals(nameToUpdate)) {
				found = true;
				System.out.print("새로운 수량을 입력하세요: ");
				int newQuantity = sc.nextInt();
				if (newQuantity <= 0) {
					System.out.println("수량은 1 이상이어야 합니다. 수정을 취소합니다.");
				} else {
					numList[i] = newQuantity;
					System.out.println(nameList[i] + "의 수량이 " + newQuantity + "로 수정되었습니다.");
				}
				break;
			}
		}
		if (!found) {
			System.out.println("해당 이름의 식자재를 찾을 수 없습니다.");
		}
	}

	private static void printAll() {
		if (count == 0) {
			System.out.println("등록된 식자재가 없습니다.");
			return;
		}
		System.out.println("========== 식자재 목록 ==========");
		for (int i = 0; i < count; i++) {
			System.out.println("식자재 이름: " + nameList[i]);
			System.out.println("수량: " + numList[i]);
			System.out.println("유통기한: " + dateList[i]);
			System.out.println("설명: " + infoList[i]);
			System.out.println("===============================");
		}
		System.out.println("=================================");
	}

	private static void addFoodItem() {
		if (count >= MAX) {
			System.out.println("냉장고 공간이 부족합니다.");
			return;
		}
		
		System.out.print("식자재 이름: ");
		String name = sc.next();
		System.out.print("수량: ");
		int quantity = sc.nextInt();
		System.out.print("유통기한: ");
		String expirationDate = sc.next();
		System.out.print("설명: ");
		String description = sc.next();

		nameList[count] = name;
		numList[count] = quantity;
		dateList[count] = expirationDate;
		infoList[count] = description;
		count++;
		
		System.out.println("식자재가 등록되었습니다.");
	}

}
