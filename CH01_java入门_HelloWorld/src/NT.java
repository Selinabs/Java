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
		/*Scanner input = new Scanner(System.in);//����һ������ϵͳ����ɨ��������
		String a = input.next();
		System.out.println(a);
		input.close();*/
		/*Scanner input = new Scanner(System.in);
		System.out.print("�������ַ���");
		String str = input.next();
		
		char drive = str.charAt(0);
		System.out.println(drive);
		//input.close();
		if (drive >= 'A' && drive <= 'Z') {
			System.out.println("����ɹ�");
		} else {
			System.out.println("��������");
		}
		input.close();
		//Scanner.close();*/
		
		float price1,price2,price3;
		int num1,num2,num3;
		float total;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������·������Capucines�к��ִ��ļ�Ǯ��");
		price1 = scanner.nextFloat();
		System.out.println("������·������Capucines�к��ִ���������");
		num1 = scanner.nextInt();
		
		System.out.println("�����밮����ʱ������Ƥ���ļ�Ǯ��");
		price2 = scanner.nextFloat();
		System.out.println("�����밮����ʱ������Ƥ����������");
		num2 = scanner.nextInt();
		
		System.out.println("���������ζ�����������ˮ�ļ�Ǯ��");
		price3 = scanner.nextFloat();
		System.out.println("���������ζ�����������ˮ��������");
		num3 = scanner.nextInt();
		
		total = price1 * num1 + price2 * num2 + price3 * num3;
		
		if (total > 50000) {
			total *= 0.7F;
		} else {
			total *= 0.9F;
		}
		System.out.println("Ӧ�����Ϊ��"+total);
		scanner.close();
		System.out.print('B');	
	}
}
