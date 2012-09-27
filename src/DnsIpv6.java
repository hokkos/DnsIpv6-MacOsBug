import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class DnsIpv6 {
    public static void main(String[] args) {
        try {
            DirContext context = new InitialDirContext();
            Attributes attributes = context.getAttributes("dns:/example.com", new String[]{"SRV"});
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
