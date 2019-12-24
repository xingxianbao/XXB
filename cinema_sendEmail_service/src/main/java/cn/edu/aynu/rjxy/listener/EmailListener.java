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
import javax.jms.TextMessage;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmailListener implements MessageListener {

    @Autowired
    private EmailUtils emailUtils;

    @Override
    public void onMessage(Message message) {
        System.out.println("消息队列");
        MapMessage myMessage = (MapMessage) message;
        try {
            TbCinema  cinema = JSON.parseObject(myMessage.getString("cinema"),TbCinema.class);
            TbSellers seller =  JSON.parseObject(myMessage.getString("seller"),TbSellers.class);
            String notice="对不上啊，请正确填写后再申请！";
            if ((cinema.getIsUsable()+"").equals("1")){
                System.out.println(seller.getPassword());
                notice ="你好啊！ 您的账号为:"+seller.getUsername()+" 密码为: "+seller.getPassword()+" 。登陆后可以修改密码。";
            }
            emailUtils.semdText(cinema.getCinEmail(),notice);
//            emailUtils.semdText("250658406@qq.com",notice);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
