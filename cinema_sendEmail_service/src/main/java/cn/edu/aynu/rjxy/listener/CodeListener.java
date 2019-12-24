package cn.edu.aynu.rjxy.listener;

import cn.edu.aynu.rjxy.pojo.TbCinema;
import cn.edu.aynu.rjxy.pojo.TbSellers;
import cn.edu.aynu.rjxy.utils.EmailUtils;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

@Service
public class CodeListener implements MessageListener {

    @Autowired
    private EmailUtils emailUtils;

    @Override
    public void onMessage(Message message) {
        MapMessage myMessage = (MapMessage) message;
        try {
            String email = myMessage.getString("email");
            String emailCode = myMessage.getString("emailCode");
            emailUtils.sendRegisterCode(email,emailCode);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
