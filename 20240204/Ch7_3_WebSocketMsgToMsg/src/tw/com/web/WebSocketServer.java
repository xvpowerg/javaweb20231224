package tw.com.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.bean.Msg;

@ServerEndpoint("/websocket")
public class WebSocketServer {
	
	private static Map<String,Session> sessionMap = new HashMap<>();
	@OnMessage
	public void onMessage(String msg,Session session) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objMap = new ObjectMapper();
		Msg msgObj = objMap.readValue(msg, Msg.class);
		System.out.println(msgObj);
		sessionMap.putIfAbsent(msgObj.getFromUser(), session);
		if (sessionMap.containsKey(msgObj.getToUser())) {
			String msgStr = msgObj.getMsg();
			sessionMap.get(msgObj.getToUser()).getBasicRemote().
			sendText(msgObj.getFromUser()+"傳送的訊息:"+msgStr);
		}else {
			session.getBasicRemote().sendText(msgObj.getToUser()+"未上線無法傳送訊息");	
		}
	}
	
//	@OnMessage
//	public void onMessage(String msg,Session session) throws JsonParseException, JsonMappingException, IOException {
//		System.out.println("msg:"+msg);
//		ObjectMapper objMap = new ObjectMapper();
//		Map<String,String> msgMap = objMap.readValue(msg, Map.class);
//		if (msgMap.containsKey("fromUser")) {
//			String  fromUser = msgMap.get("fromUser");
//			sessionMap.putIfAbsent(fromUser, session);
//		}
//		//Ken Vivin
//		//Vivin Ken
//		
//		if (msgMap.containsKey("toUser")) {
//			 String toUser =  msgMap.get("toUser");
//			if (sessionMap.containsKey(toUser)) {
//				String msgStr = msgMap.get("msg");
//				sessionMap.get(toUser).
//				getBasicRemote().sendText(msgStr);
//			}else {
//				session.getBasicRemote().sendText(toUser+"沒上線無法傳送");
//			}
//		}
//		
//	}
}
