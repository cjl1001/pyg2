package com.pyg2.pojo.group;

import com.pyg2.pojo.TbGoods;
import com.pyg2.pojo.TbGoodsDesc;
import com.pyg2.pojo.TbItem;

import java.io.Serializable;
import java.util.List;

/**
 * 商品的组合实体类
 * @author jt
 *
 */

public class Goods implements Serializable{
	
	private TbGoods goods; // 商品信息
	private TbGoodsDesc goodsDesc; // 商品扩展信息
	
	private List<TbItem> itemList; // SKU的列表信息
	public TbGoods getGoods() {
		return goods;
	}
	public void setGoods(TbGoods goods) {
		this.goods = goods;
	}
	public TbGoodsDesc getGoodsDesc() {
		return goodsDesc;
	}
	public void setGoodsDesc(TbGoodsDesc goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	public List<TbItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<TbItem> itemList) {
		this.itemList = itemList;
	}

	
}
