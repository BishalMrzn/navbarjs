import java.net.*;
public class MyURL{
    public static void main(String[] args) throws Exception {
         URL url=new URL("https://www.google.com/search?q=bootstrap&oq=boot&gs_lcrp=EgZjaHJvbWUqDAgBECMYJxiABBiKBTIGCAAQRRg5MgwIARAjGCcYgAQYigUyDQgCEAAYgwEYsQMYgAQyBwgDEAAYgAQyCggEEAAYsQMYgAQyBggFEEUYPDIGCAYQRRg9MgYIBxBFGDzSAQgxNDI1ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
         System.out.println("URL: "+url);
         System.out.println("Protocal: "+url.getProtocol());
         System.out.println("Path: "+url.getPath());
         System.out.println("Query: "+url.getQuery());
         System.out.println("Ref: "+url.getRef());
         System.out.println("Port no: "+url.getPort());
         System.out.println("Host: "+url.getHost());
        
    }

}
