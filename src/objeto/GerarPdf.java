package objeto;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

public class GerarPdf {
	public static void geraPdf(String nome, Double nota1, Double nota2){
		Aluno aluno = new Aluno(nome, nota1, nota2, ((nota1+nota2)/2));
		
		 Document document = new Document(PageSize.A4, 36, 36, 36, 36);
	     try {	        
	         PdfWriter.getInstance(document, new FileOutputStream("C:\\Projetos\\Pdf\\media.pdf"));
	         document.open();
	         document.addTitle("Média do Aluno");
	         document.addSubject("Média");
	         document.addAuthor("Roberto Júnior");
	         document.addCreator("Faculdade do Roberto");
	         
	         Image imagem = Image.getInstance(String.format("C:\\Projetos\\ProvaOO2\\WebContent\\img\\faculdade.jpg"));
	         imagem.scaleToFit(180,180);	         
	         document.add(imagem);	         
	         Chunk linebreak = new Chunk(new LineSeparator());
	         document.add(linebreak);
	         
	         document.add(new Paragraph(" "));
	         document.add(new Paragraph("Média do Aluno",FontFactory.getFont(FontFactory.HELVETICA,16,Font.BOLD)));
	         document.add(new Paragraph(" "));
	         
	         PdfPTable table = new PdfPTable(4);
	         
	         PdfPCell c1 = new PdfPCell(new Phrase("Nome"));
	         c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         table.addCell(c1);
	         c1 = new PdfPCell(new Phrase("Nota 1"));
	         c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         table.addCell(c1);
	         c1 = new PdfPCell(new Phrase("Nota 2"));
	         c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         table.addCell(c1);
	         c1 = new PdfPCell(new Phrase("Média"));
	         c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         table.addCell(c1);
			
	         table.setHeaderRows(1);
	 
	                  
	         table.addCell(aluno.getNome());
	         table.addCell(""+aluno.getNota1());
	         table.addCell(""+aluno.getNota2());
	         table.addCell(""+aluno.getMedia());
	         	         
	         document.add(table);	         
	         
	     }
	     catch(DocumentException de) {
	         System.err.println(de.getMessage());
	     }
	     catch(IOException ioe) {
	         System.err.println(ioe.getMessage());
	     }
	     document.close();
	}
}