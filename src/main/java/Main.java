import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("D:\\convert-word-to-pdf\\Deeccecv.docx");
        XWPFDocument document = new XWPFDocument(fileInputStream);
        PdfOptions pdfOptions = PdfOptions.create();
        OutputStream outputStream = new FileOutputStream("converted.pdf");
        PdfConverter.getInstance().convert(document, outputStream, pdfOptions);
        document.close();
        outputStream.close();
    }
}
