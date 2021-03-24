import com.atguigu.utils.MD5Utils;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestMD5 {
    @Test
    public void t1(){
//        System.out.println(MD5Utils.md5("123"));
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("123");
        System.out.println(encode);
    }
}
