import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop operations are not supported! ");
            return;
        }
        Desktop desktop = Desktop.getDesktop();
        //File file = new File("download2_uacs.html");
        try {
            URI uri = new URI("mailto:draganmirkovski123456@gmail.com?subject=TestSubject&body%20Example");
            desktop.mail(uri);
        }catch(IOException e){
            e.printStackTrace();
        }catch(URISyntaxException e){
            e.printStackTrace();
        }
    }
}