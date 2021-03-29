
public class Main {
	public static void main(String[] args) throws Exception {




try {
		while(true) {
			System.out.println("メニューを選んでください");
			System.out.println("[メニュー]１：検索 ２：登録 ３：変更 ４削除 0:終了");
			int id =new java.util.Scanner(System.in).nextInt();
		switch(id) {
		    case 1:
		    System.out.println("検索します");
		    break;

		    case 2:

		    	Test2 t = new Test2();
		    	t.test();
		    	break;


		    case 3:

		    	System.out.println("変更");
		    	break;


		    case 4:

		    	System.out.println("削除");
		    	break;

		    case 0:

		    	System.out.println("終了");
		    	System.exit(0);

				}
		if(id<=4 && id>=0) {

		}else {
			System.out.println("メニュー番号が間違ってます。正しい値を入力してください。");
		}



		}

}catch(Exception e) {
	System.out.println("例外発生！メニュー番号は数字で入力してください");
	System.out.println("処理を終了します。");

}








		}
	}

