package tw.com.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.beams.Mask;
import tw.com.net.MaskNetTools;
import java.util.function.Consumer;
public class MaskJsonTools {
	public static void maskJsonToObj(String json,Consumer<List<Mask>>callback) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objMapper = new ObjectMapper();
		Map map =  objMapper.readValue(json, Map.class);
		List<Map<String,Object>> maskList = (List) map.get("features");
		//System.out.println(maskList);
		List<Mask> maskObjList = new ArrayList();
		for (Map<String,Object> dataMap : maskList) {
			Map<String,Object> pMap = (Map)dataMap.get("properties");
			Mask mask = new Mask();
			mask.setId(pMap.get("id").toString());
			mask.setName(pMap.get("name").toString());
			mask.setMaskAdult(pMap.get("mask_adult").toString());
			mask.setMaskChild(pMap.get("mask_child").toString());
			maskObjList.add(mask);
		}
		callback.accept(maskObjList);
		
	}
	
	public static void main(String[] args) {
		MaskNetTools.getMaskJson(json->{
			
			try {
				MaskJsonTools.maskJsonToObj(json,lsit->System.out.println(lsit));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
	}
}
