package cn.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.pojo.TbItem;
import cn.e3.service.ItemService;
/**
 * ItemController层
 * @author 小灰灰才是最骚的
 * date 2018年1月5日
 */
@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	/**
	 * 根据id查找Item
	 */
	@RequestMapping("/findItemById/{ItemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable long ItemId) throws Exception{
		TbItem item = itemService.findItemById(ItemId);
		return item;
	}
	
}
