import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class makepdf {
	public static final String filename = "Hello.pdf";
	public void createPdf()
		    throws DocumentException, IOException {
		    
		    Document document = new Document();
		    document.setMargins(50, 100, 2, 2);
		    PdfWriter.getInstance(document, new FileOutputStream("Hello.pdf"));
		    document.open();
		    document.add(new Paragraph("Hello PDF World!. it's a fabulous world"));
		    document.close();
		}	

}