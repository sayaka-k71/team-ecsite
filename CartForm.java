package jp.co.internous.bravo.model.form;

import java.io.Serializable;

/**
 * カートフォーム
 * @author kasa-71
 *
 */

public class CartForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private int userId;
	private int tmpUserId;
	private int productId;
	private int productCount;	
	
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
	 * 仮ユーザーIDを取得する
	 * @return 仮ユーザーID
	 */
	public int getTmpUserId() {
		return tmpUserId;
	}
	
	/**
	 * 仮ユーザーIDを設定する
	 * @param userId 仮ユーザーID
	 */
	public void setTmpUserId(int tmpUserId) {
		this.tmpUserId = tmpUserId;
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
	

}
