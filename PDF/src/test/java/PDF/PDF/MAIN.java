package PDF.PDF;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class MAIN {
	
	
	public static void main(String[] args) throws InvalidPasswordException, IOException {
		
		 PDDocument document = PDDocument.load(new File("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.pdf")); 
	      PDPage page = document.getPage(0);
	      PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND,true,true);
	      contentStream.beginText(); 
	       
	      //Setting the font  
	      contentStream.setFont(PDType1Font.TIMES_ROMAN, 122);

	      //Setting the text position 
	      contentStream.newLineAtOffset(25, 500);

	      String text = "This message is writtern to the pdf file."; 
	      contentStream.showText(text);      
	      contentStream.endText();
	      contentStream.close();	      
	      // Saving file after writing
	      document.save(new File("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.pdf"));
	      document.close();
		
	}

}
