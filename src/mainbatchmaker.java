
import java.io.IOException;
import com.itextpdf.text.DocumentException;

public class mainbatchmaker {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	        try {
				new makepdf().createPdf();
			} catch (DocumentException | IOException e) {
				e.printStackTrace();
			}
		}
	
}