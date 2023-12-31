package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import tw.com.beans.Item;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	
	//private String[] itemNames ;
	private Map<String,Item> itemMap;
	
	private static ArrayList<Item>  getItemList(){
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item("0","���L",150));
		list.add(new Item("1","����",140));
		list.add(new Item("2","�ư�",120));
		return list;
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()....");
		ArrayList<Item> list = getItemList();
		itemMap = new HashMap<>();
		//itemNames = new String[] {"���L","����","�ư�"};
		 for (Item it : list) {
			 itemMap.put(it.getId(), it);
		 }
		

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out =  resp.getWriter();
		String[] items =  req.getParameterValues("item");
		ArrayList<Item> itemList = new ArrayList<>();
		for(String key : items) {
			Item it = itemMap.get(key);
			itemList.add(it);
			String countStr = req.getParameter("count"+key);
			try {
				int count = Integer.parseInt(countStr);
				it.setCount(count);
			}catch(Exception ex) {
				
			}
		}
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<ol>");
		
			for (Item it : itemList) {
				String olTag= String.format("<li> %s(%s) �ƶq%d </li>",
						it.getName(),it.getPrice(),it.getCount());
				out.println(olTag);	
			}			
		out.println("</ol>");
		out.println("<strong>�`���B:"+Item.sum(itemList)+"</strong>");
		out.println("</body>");
		out.println("</html>");
		
		//String item =  req.getParameter("item");
		//out.println(item);
		
		
		
//�ϥΰ}�C�����C�X���~�\��
//�}�C�L�k����ŦX���~�s���ܰʪ��ݨD
//�]���}�C���������Ǧ��u�����~�Ǹ����@�w������		
//		String[] items =  req.getParameterValues("item");
//		if (items == null) {
//			out.println("�п�ܲ��~");		
//			return;
//		}
//		for (String item : items) {
//			int index = Integer.parseInt(item);
//			out.println("item:"+itemNames[index]);
//		}
		
		
//		Map<String,String[]> map = req.getParameterMap();
//		map.forEach((k,v)->{
//			System.out.println("key:"+k);
//			for (String sv : v) {
//				System.out.println("value:"+sv);
//			}
//			System.out.println("================");
//		});
	}
}
