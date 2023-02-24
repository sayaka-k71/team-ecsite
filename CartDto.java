package jp.co.internous.bravo.model.domain.dto;

import java.sql.Timestamp;


public class CartDto {
	
	private int id;
	private String productName;
	private int price;
	private String imageFullPath;
	private int productCount;	
	private int subtotal;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	/**
	 *IDを取得する
	 * @return ID
	 */
	
	public int getId() {
		return id;
	}
	
	/**
	 * IDを設定する
	 * @param id ID
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 商品名を取得する
	 * @return 商品名
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * 商品名を設定する
	 * @param productName 商品名
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * 商品の数を取得する
	 * @return 商品の数
	 */
	public int getProductCount() {
		return productCount;
	}
	
	/**
	 * 商品の数を設定する
	 * @param productCount  商品の数
	 */
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * 画像パスを取得する
	 * @return 画像パス
	 */
	public String getImageFullPath() {
		return imageFullPath;
	}
	public void setImageFullPath(String imageFullPath) {
		this.imageFullPath = imageFullPath;
	}
	
	public void setSubtotal(int subtotal) {
		  this.subtotal = subtotal;
	}

	public int getSubtotal() {
		return subtotal;
	}
	
	/**
	 * レコードが追加された日時を取得する
	 * @return レコードの追加日時
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	/**
	 * レコードの追加日時を設定する
	 * @param createdAt レコードの追加日時
	 */
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	/**
	 * レコードが更新された日時を取得する
	 * @return レコードの更新日時
	 */
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	/**
	 * レコードの更新日時を設定する
	 * @param  updatedAt　レコードの更新日時
	 */
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	

}
