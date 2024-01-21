package tw.com.tools;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ImageTools {
	private static String imagePath;

	public static String getImagePath() {
		return imagePath;
	}

	public static void setImagePath(String imagePath) {
		ImageTools.imagePath = imagePath;
	}
		
	public static void uploadImage(InputStream inputStr,String fileName) throws FileNotFoundException, IOException {
		 String filePath = getImagePath()+File.separator+fileName;
		 File outFile = new File(filePath);
		 try(BufferedInputStream fin = new BufferedInputStream(inputStr);
			FileOutputStream fileOut = new 	FileOutputStream(outFile); ){
			 byte[] buffer = new byte [1024];
			 int index = - 1;
			 while( (index = fin.read(buffer)) != -1  ) {
				 fileOut.write(buffer, 0, index);
			 }
		 }
	}
	
	public static List<String> getImageList() throws IOException{
		Path filePath = Paths.get(getImagePath());
		List<String>  imageList =  Files.list(filePath).
				map(p->p.getFileName().toString()).
		   collect(Collectors.toList());
		return imageList;
	}
	
	public static void main(String[] args)throws IOException {
		ImageTools.setImagePath("c:\\upload_images");
//		List<String> imageList = getImageList();
//		System.out.println(imageList);
		FileInputStream fin = new
				FileInputStream("C:\\Users\\xvpow\\OneDrive\\Desktop\\upload\\peace.png");
		ImageTools.uploadImage(fin, "peace.png");
	}
}
