package cn.edu.aynu.rjxy.management.service;

import cn.edu.aynu.rjxy.pojo.TbSellers;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDetailServiceImpl implements UserDetailsService {

    //通过配置文件的实例化方式 注入属性
    private SellersService sellersService;

    public void setSellersService(SellersService sellersService) {
        this.sellersService = sellersService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("这是自定义的验证类.........");
        //创建一个list集合用于存储验证的用户权限
        List<GrantedAuthority> authorities =
                new ArrayList<GrantedAuthority>();
        //创建一个权限的对象 存储进去
        authorities.add(new SimpleGrantedAuthority("ROLE_SELLER"));
        //查询数据库的商家对象
        TbSellers seller = sellersService.findOne(username);
        if(!(seller.getStatus()+"").equals("1")){
            return null;
        }
        System.out.println(":::"+seller);
        return new User(seller.getUsername(),seller.getPassword(),authorities);
    }
}
