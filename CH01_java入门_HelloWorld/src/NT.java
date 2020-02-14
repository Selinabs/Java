import java.util.Scanner;
public class NT {
//	@SuppressWarnings("unused")
	public static void main(String[] args) {
/*/		int salary1;
//		double salary2,sum;
//		salary1 = 5000;
//		salary2 = 0.040570;
//		sum = salary1 * (1+salary2);
//		System.out.print(sum+" ");
//		System.out.println(sum);
//		System.out.print("");
//		@SuppressWarnings("unused")*/
		/*Scanner input = new Scanner(System.in);//创建一个接受系统输入扫描器对象
		String a = input.next();
		System.out.println(a);
		input.close();*/
		/*Scanner input = new Scanner(System.in);
		System.out.print("请输入字符：");
		String str = input.next();
		
		char drive = str.charAt(0);
		System.out.println(drive);
		//input.close();
		if (drive >= 'A' && drive <= 'Z') {
			System.out.println("输入成功");
		} else {
			System.out.println("输入有误");
		}
		input.close();
		//Scanner.close();*/
		
		float price1,price2,price3;
		int num1,num2,num3;
		float total;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入路易威登Capucines中号手袋的价钱：");
		price1 = scanner.nextFloat();
		System.out.println("请输入路易威登Capucines中号手袋的数量：");
		num1 = scanner.nextInt();
		
		System.out.println("请输入爱马仕时尚休闲皮带的价钱：");
		price2 = scanner.nextFloat();
		System.out.println("请输入爱马仕时尚休闲皮带的数量：");
		num2 = scanner.nextInt();
		
		System.out.println("请输入香奈儿东方屏风香水的价钱：");
		price3 = scanner.nextFloat();
		System.out.println("请输入香奈儿东方屏风香水的数量：");
		num3 = scanner.nextInt();
		
		total = price1 * num1 + price2 * num2 + price3 * num3;
		
		if (total > 50000) {
			total *= 0.7F;
		} else {
			total *= 0.9F;
		}
		System.out.println("应付金额为："+total);
		scanner.close();
		System.out.print('B');	
	}
}
