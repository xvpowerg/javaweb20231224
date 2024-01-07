package tw.com.web.http;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Random;
public class WebTools {
	private static final Map<String,MyHttpSession> myHttpSessionMap = new HashMap();
	public static final String MY_HTTP_SESSION_ID = "MY_HTTP_SESSION_ID";
	private static final Random random = new Random();
	public static MyHttpSession getMySession(HttpServletRequest req,
			HttpServletResponse respon,boolean create) {
		Cookie[] cookies =   req.getCookies();
		String mySessionId = "";
		if (cookies != null) {
			for (Cookie cook : cookies) {
				if (cook.getName().equals(MY_HTTP_SESSION_ID)) {
					mySessionId = cook.getValue();
				}
			}
		}
		
		if (mySessionId.isEmpty() && !create) {
			return null;
		}
		MyHttpSession session  =null;
		if (mySessionId.isEmpty() ||
				myHttpSessionMap.get(mySessionId) == null) {
			mySessionId = Integer.toHexString(random.nextInt(Integer.MAX_VALUE));
			Cookie sesionCookie = new Cookie(MY_HTTP_SESSION_ID,mySessionId);
			respon.addCookie(sesionCookie);
			session = new MyHttpSession();
			myHttpSessionMap.put(mySessionId, session);
		}else {
			session = myHttpSessionMap.get(mySessionId);
		}
		
		return session;
	}
	
	public static MyHttpSession getMySession(HttpServletRequest req,
			HttpServletResponse respon) {
		return getMySession(req,respon,true);
	}
}
