package me.uniauto.data;

import com.alibaba.druid.pool.DruidDataSource;
import me.uniauto.data.cipher.Base64;
import me.uniauto.until.UniAutoLogger;


/**
 * 数据库加密.
 */

@SuppressWarnings("serial")
public class CipherDataSource extends DruidDataSource {
    private UniAutoLogger logger = UniAutoLogger.getLogger(CipherDataSource.class);

    @Override
    public void setPassword(String password) {
        Base64 base64 = new Base64();
        password = new String(base64.decode(password.getBytes()));
        logger.debug("setPassword....{}  " + password);
        super.setPassword(password);
    }

    @Override
    public void setUsername(String username) {
        Base64 base64 = new Base64();
        username = new String(base64.decode(username.getBytes()));
        logger.debug("setUsername....{}  " + username);
        super.setUsername(username);
    }

    public static void main(String[] args) {

        Base64 base64 = new Base64();
        String name = new String(base64.encode("7gSvQJT-UKIQolVUoWRnCFPZBtYBajqa".getBytes()));
        System.out.println(name);

        name = new String(base64.decode(name.getBytes()));
        System.out.println(name);

        String pwd = new String(base64.encode("root".getBytes()));
        System.out.println(pwd);

        pwd = new String(base64.decode(pwd.getBytes()));
        System.out.println(pwd);

        String encodeStr = "highway";
        System.out.println(new String(new Base64().encode(encodeStr.getBytes())));
    }
}
