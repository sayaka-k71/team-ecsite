package jp.co.internous.bravo.model.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import jp.co.internous.bravo.model.form.CartForm;

public class TblCart  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int userId;
	private int productId;
	private int productCount;	
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	
	/**
	 * コンストラクタ
	 */
	public TblCart() {}
	
	/**
	 * コンストラクタ
	 * @param f カートフォーム
	 */
	public TblCart(CartForm f) {
		userId = f.getUserId();
		productId = f.getProductId();
		productCount = f.getProductCount();
	}
	
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
	 * ユーザーIDを取得する
	 * @return ユーザーID
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * ユーザーIDを設定する
	 * @param userId ユーザーID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	 * 商品IDを取得する
	 * @return　商品ID
	 */
	public int getProductId() {
		return productId;
	}
	
	/**
	 * 商品IDを設定する
	 * @param productId 商品ID
	 */
	public void setProductId(int productId) {
		this.productId = productId;
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
