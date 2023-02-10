import java.util.Scanner;
public class Assign3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("책의 권수 : ");
		int i = input.nextInt();
		
		Book[] bookList = new Book[i];
		
		for(i = 0; i < bookList.length; i++) {
			System.out.print("제목 >>");
			String t = input.next();
			System.out.print("저자 >>");
			String a = input.next();
			bookList[i] = new Book(t, a);
		}
		
		for(i = 0; i < bookList.length; i++) {
			System.out.println(bookList[i].toString());
		}
		
		System.out.print("\n찾으려는 책의 제목은? ");
		String f = input.next();
		
		boolean flg = false;
		for(i = 0; i < bookList.length; i++) {
			if(bookList[i].getTitle().equals(f)) {
				System.out.print("저자는 " + bookList[i].getAuthor() + "입니다.");
				flg = true;
				break;
			} 
		} if (flg == false) {
			 System.out.println("찾으시는 책이 없습니다.");
		}
	}
}