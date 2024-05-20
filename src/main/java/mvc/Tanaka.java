package mvc;

import javax.servlet.http.HttpServletRequest;

public class Tanaka {
	public int tasu(HttpServletRequest request) {
		//リクエスト・パラメータを取得
		int x = Integer.parseInt(request.getParameter("data1"));
		int y = Integer.parseInt(request.getParameter("data2"));
		
		return x + y;
	}
}
