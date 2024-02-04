package tw.com.web;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket")
public class WebSocketSession {
	@OnMessage
	public void onMessage(String message,Session session) throws IOException, InterruptedException {
		session.getBasicRemote().sendText("�ڦ���T���F:"+message);
		
		for (int i =1; i<= 10; i++) {
			TimeUnit.SECONDS.sleep(1);
			session.getBasicRemote().sendText("Servelt Send Msg:"+i);
		}
		//�o�e10����� ��Ȥ�� �C�@��o�e�@��
	}
}
