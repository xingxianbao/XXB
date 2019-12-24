package cn.edu.aynu.rjxy.management.controller;

import cn.edu.aynu.rjxy.entity.Result;
import cn.edu.aynu.rjxy.management.service.ClientService;
import cn.edu.aynu.rjxy.pojo.TbClient;
import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/client")
public class ClientController {

	@Reference
	private ClientService clientService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbClient> findAll(){
		return clientService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageInfo findPage(int pageNum, int pageSize){
		return clientService.findPage(pageNum, pageSize);
	}
	
	/**
	 * 增加
	 * @param client
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbClient client){
		try {
			clientService.add(client);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param client
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbClient client){
		try {
			clientService.update(client);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbClient findOne(Long clientId){
		return clientService.findOne(clientId);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] clientIds){
		try {
			clientService.delete(clientIds);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/search")
	public PageInfo search(@RequestBody TbClient client, int pageNum, int pageSize  ){
		return clientService.findPage(client, pageNum, pageSize);
	}
	
}
